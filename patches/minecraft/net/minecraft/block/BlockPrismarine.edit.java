
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  3 : 4  @  3 : 4

~ 

> CHANGE  14 : 15  @  14 : 16

~ 	public static PropertyEnum<BlockPrismarine.EnumType> VARIANT;

> INSERT  11 : 15  @  12

+ 	public static void bootstrapStates() {
+ 		VARIANT = PropertyEnum.<BlockPrismarine.EnumType>create("variant", BlockPrismarine.EnumType.class);
+ 	}
+ 

> EOF
