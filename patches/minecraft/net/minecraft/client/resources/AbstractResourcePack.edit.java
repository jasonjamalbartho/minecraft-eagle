
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 9

> CHANGE  2 : 13  @  9 : 10

~ import java.nio.charset.StandardCharsets;
~ 
~ import net.lax1dude.eaglercraft.v1_8.vfs.SYS;
~ import org.json.JSONException;
~ import org.json.JSONObject;
~ 
~ import net.lax1dude.eaglercraft.v1_8.IOUtils;
~ import net.lax1dude.eaglercraft.v1_8.HString;
~ import net.lax1dude.eaglercraft.v1_8.log4j.LogManager;
~ import net.lax1dude.eaglercraft.v1_8.log4j.Logger;
~ import net.lax1dude.eaglercraft.v1_8.opengl.ImageData;

> DELETE  12  @  2 : 3

> DELETE  3  @  4 : 7

> CHANGE  3 : 4  @  6 : 7

~ 	protected final String resourcePackFile;

> CHANGE  2 : 3  @  2 : 3

~ 	public AbstractResourcePack(String resourcePackFileIn) {

> CHANGE  5 : 6  @  5 : 6

~ 		return HString.format("%s/%s/%s",

> DELETE  4  @  4 : 8

> CHANGE  19 : 27  @  23 : 24

~ 		try {
~ 			return readMetadata(parIMetadataSerializer, this.getInputStreamByName("pack.mcmeta"), parString1);
~ 		} catch (JSONException e) {
~ 			if (SYS.VFS != null) {
~ 				SYS.deleteResourcePack(this.resourcePackFile);
~ 			}
~ 			throw e;
~ 		}

> CHANGE  12 : 13  @  5 : 7

~ 		JSONObject jsonobject = null;

> CHANGE  3 : 6  @  4 : 8

~ 			jsonobject = new JSONObject(IOUtils.inputStreamToString(parInputStream, StandardCharsets.UTF_8));
~ 		} catch (RuntimeException | IOException runtimeexception) {
~ 			throw new JSONException(runtimeexception);

> CHANGE  4 : 5  @  5 : 6

~ 			IOUtils.closeQuietly(parInputStream);

> CHANGE  6 : 7  @  6 : 7

~ 	public ImageData getPackImage() throws IOException {

> CHANGE  5 : 6  @  5 : 6

~ 		return this.resourcePackFile;

> EOF
