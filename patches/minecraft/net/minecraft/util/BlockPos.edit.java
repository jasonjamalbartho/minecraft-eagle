
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 3

> INSERT  1 : 4  @  2

+ 
+ import com.google.common.collect.AbstractIterator;
+ 

> DELETE  4  @  1 : 5

> INSERT  103 : 120  @  107

+ 	public BlockPos offsetFaster(EnumFacing facing, MutableBlockPos ret) {
+ 		ret.x = this.getX() + facing.getFrontOffsetX();
+ 		ret.y = this.getY() + facing.getFrontOffsetY();
+ 		ret.z = this.getZ() + facing.getFrontOffsetZ();
+ 		return ret;
+ 	}
+ 
+ 	/**
+ 	 * only use with a regular "net.minecraft.util.BlockPos"!
+ 	 */
+ 	public BlockPos offsetEvenFaster(EnumFacing facing, MutableBlockPos ret) {
+ 		ret.x = this.x + facing.getFrontOffsetX();
+ 		ret.y = this.y + facing.getFrontOffsetY();
+ 		ret.z = this.z + facing.getFrontOffsetZ();
+ 		return ret;
+ 	}
+ 

> DELETE  125  @  108 : 111

> CHANGE  6 : 7  @  9 : 13

~ 			super(x_, y_, z_);

> EOF
