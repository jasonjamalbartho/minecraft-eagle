
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  3 : 4  @  3 : 4

~ 

> CHANGE  17 : 18  @  17 : 19

~ 	public static PropertyEnum<BlockQuartz.EnumType> VARIANT;

> INSERT  8 : 12  @  9

+ 	public static void bootstrapStates() {
+ 		VARIANT = PropertyEnum.<BlockQuartz.EnumType>create("variant", BlockQuartz.EnumType.class);
+ 	}
+ 

> EOF
