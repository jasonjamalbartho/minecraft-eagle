
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 5  @  2 : 5

~ import net.lax1dude.eaglercraft.v1_8.internal.buffer.FloatBuffer;
~ 
~ import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;

> DELETE  4  @  4 : 5

> CHANGE  8 : 10  @  9 : 11

~ 		GlStateManager.disableMCLight(0);
~ 		GlStateManager.disableMCLight(1);

> CHANGE  7 : 10  @  7 : 9

~ 		GlStateManager.enableMCLight(0, 0.6f, LIGHT0_POS.xCoord, LIGHT0_POS.yCoord, LIGHT0_POS.zCoord, 0.0D);
~ 		GlStateManager.enableMCLight(1, 0.6f, LIGHT1_POS.xCoord, LIGHT1_POS.yCoord, LIGHT1_POS.zCoord, 0.0D);
~ 		GlStateManager.setMCLightAmbient(0.4f, 0.4f, 0.4f);

> DELETE  4  @  3 : 17

> EOF
