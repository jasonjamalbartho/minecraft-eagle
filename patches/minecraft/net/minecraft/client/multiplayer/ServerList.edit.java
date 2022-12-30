
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 4  @  2 : 4

~ import java.io.ByteArrayOutputStream;
~ import java.util.Iterator;

> INSERT  3 : 16  @  3

+ 
+ import com.google.common.collect.Lists;
+ 
+ import net.lax1dude.eaglercraft.v1_8.EagRuntime;
+ import net.lax1dude.eaglercraft.v1_8.EaglerInputStream;
+ import net.lax1dude.eaglercraft.v1_8.internal.EnumServerRateLimit;
+ import net.lax1dude.eaglercraft.v1_8.internal.IClientConfigAdapter.DefaultServer;
+ import net.lax1dude.eaglercraft.v1_8.internal.QueryResponse;
+ import net.lax1dude.eaglercraft.v1_8.log4j.LogManager;
+ import net.lax1dude.eaglercraft.v1_8.log4j.Logger;
+ import net.lax1dude.eaglercraft.v1_8.socket.AddressResolver;
+ import net.lax1dude.eaglercraft.v1_8.socket.RateLimitTracker;
+ import net.lax1dude.eaglercraft.v1_8.socket.ServerQueryDispatch;

> CHANGE  14 : 15  @  1 : 2

~ import net.minecraft.client.renderer.texture.TextureManager;

> CHANGE  4 : 5  @  4 : 6

~ import net.minecraft.util.EnumChatFormatting;

> INSERT  5 : 6  @  6

+ 	private final List<ServerData> allServers = Lists.newArrayList();

> CHANGE  3 : 6  @  2 : 3

~ 	private static ServerList instance = null;
~ 
~ 	private ServerList(Minecraft mcIn) {

> INSERT  7 : 15  @  5

+ 	public static void initServerList(Minecraft mc) {
+ 		instance = new ServerList(mc);
+ 	}
+ 
+ 	public static ServerList getServerList() {
+ 		return instance;
+ 	}
+ 

> CHANGE  10 : 17  @  2 : 6

~ 			freeServerIcons();
~ 
~ 			this.allServers.clear();
~ 			for (DefaultServer srv : EagRuntime.getConfiguration().getDefaultServerList()) {
~ 				ServerData dat = new ServerData(srv.name, srv.addr, true);
~ 				dat.isDefault = true;
~ 				this.allServers.add(dat);

> CHANGE  9 : 10  @  6 : 7

~ 			byte[] localStorage = EagRuntime.getStorage("s");

> CHANGE  2 : 15  @  2 : 4

~ 			if (localStorage != null) {
~ 				NBTTagCompound nbttagcompound = CompressedStreamTools
~ 						.readCompressed(new EaglerInputStream(localStorage));
~ 				if (nbttagcompound == null) {
~ 					return;
~ 				}
~ 
~ 				NBTTagList nbttaglist = nbttagcompound.getTagList("servers", 10);
~ 
~ 				for (int i = 0; i < nbttaglist.tagCount(); ++i) {
~ 					ServerData srv = ServerData.getServerDataFromNBTCompound(nbttaglist.getCompoundTagAt(i));
~ 					this.allServers.add(srv);
~ 				}

> INSERT  14 : 15  @  3

+ 

> INSERT  3 : 5  @  2

+ 		} finally {
+ 			refreshServerPing();

> CHANGE  11 : 14  @  9 : 10

~ 				if (!serverdata.isDefault) {
~ 					nbttaglist.appendTag(serverdata.getNBTCompound());
~ 				}

> CHANGE  7 : 12  @  5 : 6

~ 
~ 			ByteArrayOutputStream bao = new ByteArrayOutputStream();
~ 			CompressedStreamTools.writeCompressed(nbttagcompound, bao);
~ 			EagRuntime.setStorage("s", bao.toByteArray());
~ 

> CHANGE  16 : 21  @  12 : 13

~ 		ServerData data = this.servers.remove(parInt1);
~ 		if (data != null && data.iconTextureObject != null) {
~ 			mc.getTextureManager().deleteTexture(data.iconResourceLocation);
~ 			data.iconTextureObject = null;
~ 		}

> INSERT  41 : 149  @  37

+ 
+ 	public void freeServerIcons() {
+ 		TextureManager mgr = mc.getTextureManager();
+ 		for (int i = 0, l = allServers.size(); i < l; ++i) {
+ 			ServerData server = allServers.get(i);
+ 			if (server.iconTextureObject != null) {
+ 				mgr.deleteTexture(server.iconResourceLocation);
+ 				server.iconTextureObject = null;
+ 			}
+ 		}
+ 	}
+ 
+ 	public void refreshServerPing() {
+ 		this.servers.clear();
+ 		this.servers.addAll(this.allServers);
+ 		for (ServerData dat : servers) {
+ 			if (dat.currentQuery != null) {
+ 				if (dat.currentQuery.isOpen()) {
+ 					dat.currentQuery.close();
+ 				}
+ 				dat.currentQuery = null;
+ 			}
+ 			dat.hasPing = false;
+ 			dat.pingSentTime = -1l;
+ 		}
+ 	}
+ 
+ 	public void updateServerPing() {
+ 		int total = 0;
+ 		Iterator<ServerData> itr = servers.iterator();
+ 		while (itr.hasNext()) {
+ 			ServerData dat = itr.next();
+ 			if (dat.pingSentTime <= 0l) {
+ 				dat.pingSentTime = System.currentTimeMillis();
+ 				if (RateLimitTracker.isLockedOut(dat.serverIP)) {
+ 					logger.error(
+ 							"Server {} locked this client out on a previous connection, will not attempt to reconnect",
+ 							dat.serverIP);
+ 					dat.serverMOTD = EnumChatFormatting.RED + "Too Many Requests!\nTry again later";
+ 					dat.pingToServer = -1l;
+ 					dat.hasPing = true;
+ 					dat.field_78841_f = true;
+ 				} else {
+ 					dat.pingToServer = -2l;
+ 					String addr = AddressResolver.resolveURI(dat.serverIP);
+ 					dat.currentQuery = ServerQueryDispatch.sendServerQuery(addr, "MOTD");
+ 					if (dat.currentQuery == null) {
+ 						dat.pingToServer = -1l;
+ 						dat.hasPing = true;
+ 						dat.field_78841_f = true;
+ 					} else {
+ 						++total;
+ 					}
+ 				}
+ 			} else if (dat.currentQuery != null) {
+ 				if (!dat.hasPing) {
+ 					++total;
+ 					EnumServerRateLimit rateLimit = dat.currentQuery.getRateLimit();
+ 					if (rateLimit != EnumServerRateLimit.OK) {
+ 						if (rateLimit == EnumServerRateLimit.BLOCKED) {
+ 							RateLimitTracker.registerBlock(dat.serverIP);
+ 						} else if (rateLimit == EnumServerRateLimit.LOCKED_OUT) {
+ 							RateLimitTracker.registerLockOut(dat.serverIP);
+ 						}
+ 						dat.serverMOTD = EnumChatFormatting.RED + "Too Many Requests!\nTry again later";
+ 						dat.pingToServer = -1l;
+ 						dat.hasPing = true;
+ 						return;
+ 					}
+ 				}
+ 				if (dat.currentQuery.responsesAvailable() > 0) {
+ 					QueryResponse pkt;
+ 					do {
+ 						pkt = dat.currentQuery.getResponse();
+ 					} while (dat.currentQuery.responsesAvailable() > 0);
+ 					if (pkt.responseType.equalsIgnoreCase("MOTD") && pkt.isResponseJSON()) {
+ 						dat.setMOTDFromQuery(pkt);
+ 						if (!dat.hasPing) {
+ 							dat.pingToServer = pkt.clientTime - dat.pingSentTime;
+ 							dat.hasPing = true;
+ 						}
+ 					}
+ 				}
+ 				if (dat.currentQuery.binaryResponsesAvailable() > 0) {
+ 					byte[] r;
+ 					do {
+ 						r = dat.currentQuery.getBinaryResponse();
+ 					} while (dat.currentQuery.binaryResponsesAvailable() > 0);
+ 					dat.setIconPacket(r);
+ 				}
+ 				if (!dat.currentQuery.isOpen() && dat.pingSentTime > 0l
+ 						&& (System.currentTimeMillis() - dat.pingSentTime) > 2000l && !dat.hasPing) {
+ 					if (RateLimitTracker.isProbablyLockedOut(dat.serverIP)) {
+ 						logger.error("Server {} ratelimited this client out on a previous connection, assuming lockout",
+ 								dat.serverIP);
+ 						dat.serverMOTD = EnumChatFormatting.RED + "Too Many Requests!\nTry again later";
+ 					}
+ 					dat.pingToServer = -1l;
+ 					dat.hasPing = true;
+ 				}
+ 			}
+ 			if (total >= 4) {
+ 				break;
+ 			}
+ 		}
+ 
+ 	}
+ 

> EOF
