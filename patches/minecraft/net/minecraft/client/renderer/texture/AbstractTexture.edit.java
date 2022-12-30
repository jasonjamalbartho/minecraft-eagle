
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 3  @  2 : 5

~ import static net.lax1dude.eaglercraft.v1_8.opengl.RealOpenGLEnums.*;

> INSERT  2 : 4  @  4

+ import net.lax1dude.eaglercraft.v1_8.opengl.EaglercraftGPU;
+ 

> CHANGE  10 : 22  @  8 : 19

~ 		if (blur != parFlag || mipmap != parFlag2) {
~ 			this.blur = parFlag;
~ 			this.mipmap = parFlag2;
~ 			int i = -1;
~ 			short short1 = -1;
~ 			if (parFlag) {
~ 				i = parFlag2 ? 9987 : 9729;
~ 				short1 = 9729;
~ 			} else {
~ 				i = parFlag2 ? 9986 : 9728;
~ 				short1 = 9728;
~ 			}

> CHANGE  13 : 16  @  12 : 14

~ 			EaglercraftGPU.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, i);
~ 			EaglercraftGPU.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, short1);
~ 		}

> EOF
