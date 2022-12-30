
# Eagler Context Redacted Diff
# Copyright (c) 2022 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 4  @  2 : 3

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
~ 

> DELETE  5  @  4 : 5

> DELETE  1  @  2 : 4

> DELETE  4  @  6 : 22

> DELETE  3  @  19 : 22

> DELETE  9  @  12 : 15

> DELETE  4  @  7 : 8

> DELETE  6  @  7 : 8

> DELETE  7  @  8 : 9

> CHANGE  12 : 13  @  13 : 165

~ 	private static EntityVillager.ITradeList[][][][] DEFAULT_TRADE_LIST_MAP = null;

> INSERT  2 : 167  @  153

+ 	public static void bootstrap() {
+ 		DEFAULT_TRADE_LIST_MAP = new EntityVillager.ITradeList[][][][] {
+ 				{ { { new EntityVillager.EmeraldForItems(Items.wheat, new EntityVillager.PriceInfo(18, 22)),
+ 						new EntityVillager.EmeraldForItems(Items.potato, new EntityVillager.PriceInfo(15, 19)),
+ 						new EntityVillager.EmeraldForItems(Items.carrot,
+ 								new EntityVillager.PriceInfo(15, 19)),
+ 						new EntityVillager.ListItemForEmeralds(Items.bread, new EntityVillager.PriceInfo(-4, -2)) },
+ 						{ new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.pumpkin),
+ 								new EntityVillager.PriceInfo(8, 13)),
+ 								new EntityVillager.ListItemForEmeralds(Items.pumpkin_pie,
+ 										new EntityVillager.PriceInfo(-3, -2)) },
+ 						{ new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.melon_block),
+ 								new EntityVillager.PriceInfo(7, 12)),
+ 								new EntityVillager.ListItemForEmeralds(Items.apple,
+ 										new EntityVillager.PriceInfo(-5, -7)) },
+ 						{ new EntityVillager.ListItemForEmeralds(Items.cookie, new EntityVillager.PriceInfo(-6, -10)),
+ 								new EntityVillager.ListItemForEmeralds(Items.cake,
+ 										new EntityVillager.PriceInfo(1, 1)) } },
+ 						{ { new EntityVillager.EmeraldForItems(Items.string, new EntityVillager.PriceInfo(15, 20)),
+ 								new EntityVillager.EmeraldForItems(Items.coal, new EntityVillager.PriceInfo(16, 24)),
+ 								new EntityVillager.ItemAndEmeraldToItem(
+ 										Items.fish, new EntityVillager.PriceInfo(6, 6), Items.cooked_fish,
+ 										new EntityVillager.PriceInfo(6, 6)) },
+ 								{ new EntityVillager.ListEnchantedItemForEmeralds(Items.fishing_rod,
+ 										new EntityVillager.PriceInfo(7, 8)) } },
+ 						{ { new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.wool),
+ 								new EntityVillager.PriceInfo(16, 22)),
+ 								new EntityVillager.ListItemForEmeralds(Items.shears,
+ 										new EntityVillager.PriceInfo(3, 4)) },
+ 								{ new EntityVillager.ListItemForEmeralds(
+ 										new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 0),
+ 										new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 1),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 2),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 3),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 4),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 5),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 6),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 7),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 8),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 9),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 10),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 11),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 12),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 13),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 14),
+ 												new EntityVillager.PriceInfo(1, 2)),
+ 										new EntityVillager.ListItemForEmeralds(
+ 												new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 15),
+ 												new EntityVillager.PriceInfo(1, 2)) } },
+ 						{ { new EntityVillager.EmeraldForItems(Items.string, new EntityVillager.PriceInfo(15, 20)),
+ 								new EntityVillager.ListItemForEmeralds(Items.arrow,
+ 										new EntityVillager.PriceInfo(-12, -8)) },
+ 								{ new EntityVillager.ListItemForEmeralds(Items.bow, new EntityVillager.PriceInfo(2, 3)),
+ 										new EntityVillager.ItemAndEmeraldToItem(Item.getItemFromBlock(Blocks.gravel),
+ 												new EntityVillager.PriceInfo(10, 10), Items.flint,
+ 												new EntityVillager.PriceInfo(6, 10)) } } },
+ 				{ { { new EntityVillager.EmeraldForItems(Items.paper, new EntityVillager.PriceInfo(24, 36)),
+ 						new EntityVillager.ListEnchantedBookForEmeralds() },
+ 						{ new EntityVillager.EmeraldForItems(Items.book, new EntityVillager.PriceInfo(8, 10)),
+ 								new EntityVillager.ListItemForEmeralds(Items.compass,
+ 										new EntityVillager.PriceInfo(10, 12)),
+ 								new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(Blocks.bookshelf),
+ 										new EntityVillager.PriceInfo(3, 4)) },
+ 						{ new EntityVillager.EmeraldForItems(Items.written_book, new EntityVillager.PriceInfo(2, 2)),
+ 								new EntityVillager.ListItemForEmeralds(Items.clock,
+ 										new EntityVillager.PriceInfo(10, 12)),
+ 								new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(Blocks.glass),
+ 										new EntityVillager.PriceInfo(-5, -3)) },
+ 						{ new EntityVillager.ListEnchantedBookForEmeralds() },
+ 						{ new EntityVillager.ListEnchantedBookForEmeralds() },
+ 						{ new EntityVillager.ListItemForEmeralds(Items.name_tag,
+ 								new EntityVillager.PriceInfo(20, 22)) } } },
+ 				{ { { new EntityVillager.EmeraldForItems(Items.rotten_flesh, new EntityVillager.PriceInfo(36, 40)),
+ 						new EntityVillager.EmeraldForItems(Items.gold_ingot, new EntityVillager.PriceInfo(8, 10)) },
+ 						{ new EntityVillager.ListItemForEmeralds(Items.redstone, new EntityVillager.PriceInfo(-4, -1)),
+ 								new EntityVillager.ListItemForEmeralds(
+ 										new ItemStack(Items.dye, 1, EnumDyeColor.BLUE.getDyeDamage()),
+ 										new EntityVillager.PriceInfo(-2, -1)) },
+ 						{ new EntityVillager.ListItemForEmeralds(Items.ender_eye, new EntityVillager.PriceInfo(7, 11)),
+ 								new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(Blocks.glowstone),
+ 										new EntityVillager.PriceInfo(-3, -1)) },
+ 						{ new EntityVillager.ListItemForEmeralds(Items.experience_bottle,
+ 								new EntityVillager.PriceInfo(3, 11)) } } },
+ 				{ { { new EntityVillager.EmeraldForItems(Items.coal, new EntityVillager.PriceInfo(16, 24)),
+ 						new EntityVillager.ListItemForEmeralds(Items.iron_helmet, new EntityVillager.PriceInfo(4, 6)) },
+ 						{ new EntityVillager.EmeraldForItems(Items.iron_ingot, new EntityVillager.PriceInfo(7, 9)),
+ 								new EntityVillager.ListItemForEmeralds(Items.iron_chestplate,
+ 										new EntityVillager.PriceInfo(10, 14)) },
+ 						{ new EntityVillager.EmeraldForItems(Items.diamond, new EntityVillager.PriceInfo(3, 4)),
+ 								new EntityVillager.ListEnchantedItemForEmeralds(Items.diamond_chestplate,
+ 										new EntityVillager.PriceInfo(16, 19)) },
+ 						{ new EntityVillager.ListItemForEmeralds(Items.chainmail_boots,
+ 								new EntityVillager.PriceInfo(5, 7)),
+ 								new EntityVillager.ListItemForEmeralds(Items.chainmail_leggings,
+ 										new EntityVillager.PriceInfo(9, 11)),
+ 								new EntityVillager.ListItemForEmeralds(Items.chainmail_helmet,
+ 										new EntityVillager.PriceInfo(5, 7)),
+ 								new EntityVillager.ListItemForEmeralds(Items.chainmail_chestplate,
+ 										new EntityVillager.PriceInfo(11, 15)) } },
+ 						{ { new EntityVillager.EmeraldForItems(Items.coal, new EntityVillager.PriceInfo(16, 24)),
+ 								new EntityVillager.ListItemForEmeralds(Items.iron_axe,
+ 										new EntityVillager.PriceInfo(6, 8)) },
+ 								{ new EntityVillager.EmeraldForItems(Items.iron_ingot,
+ 										new EntityVillager.PriceInfo(7, 9)),
+ 										new EntityVillager.ListEnchantedItemForEmeralds(Items.iron_sword,
+ 												new EntityVillager.PriceInfo(9, 10)) },
+ 								{ new EntityVillager.EmeraldForItems(Items.diamond, new EntityVillager.PriceInfo(3, 4)),
+ 										new EntityVillager.ListEnchantedItemForEmeralds(Items.diamond_sword,
+ 												new EntityVillager.PriceInfo(12, 15)),
+ 										new EntityVillager.ListEnchantedItemForEmeralds(Items.diamond_axe,
+ 												new EntityVillager.PriceInfo(9, 12)) } },
+ 						{ { new EntityVillager.EmeraldForItems(Items.coal, new EntityVillager.PriceInfo(16, 24)),
+ 								new EntityVillager.ListEnchantedItemForEmeralds(Items.iron_shovel,
+ 										new EntityVillager.PriceInfo(5, 7)) },
+ 								{ new EntityVillager.EmeraldForItems(Items.iron_ingot,
+ 										new EntityVillager.PriceInfo(7, 9)),
+ 										new EntityVillager.ListEnchantedItemForEmeralds(Items.iron_pickaxe,
+ 												new EntityVillager.PriceInfo(9, 11)) },
+ 								{ new EntityVillager.EmeraldForItems(Items.diamond, new EntityVillager.PriceInfo(3, 4)),
+ 										new EntityVillager.ListEnchantedItemForEmeralds(Items.diamond_pickaxe,
+ 												new EntityVillager.PriceInfo(12, 15)) } } },
+ 				{ { { new EntityVillager.EmeraldForItems(Items.porkchop, new EntityVillager.PriceInfo(14, 18)),
+ 						new EntityVillager.EmeraldForItems(Items.chicken, new EntityVillager.PriceInfo(14, 18)) },
+ 						{ new EntityVillager.EmeraldForItems(Items.coal, new EntityVillager.PriceInfo(16, 24)),
+ 								new EntityVillager.ListItemForEmeralds(Items.cooked_porkchop,
+ 										new EntityVillager.PriceInfo(-7, -5)),
+ 								new EntityVillager.ListItemForEmeralds(Items.cooked_chicken,
+ 										new EntityVillager.PriceInfo(-8, -6)) } },
+ 						{ { new EntityVillager.EmeraldForItems(Items.leather, new EntityVillager.PriceInfo(9, 12)),
+ 								new EntityVillager.ListItemForEmeralds(Items.leather_leggings,
+ 										new EntityVillager.PriceInfo(2, 4)) },
+ 								{ new EntityVillager.ListEnchantedItemForEmeralds(Items.leather_chestplate,
+ 										new EntityVillager.PriceInfo(7, 12)) },
+ 								{ new EntityVillager.ListItemForEmeralds(Items.saddle,
+ 										new EntityVillager.PriceInfo(8, 10)) } } } };
+ 	}
+ 

> DELETE  174  @  9 : 25

> DELETE  3  @  19 : 39

> DELETE  5  @  25 : 68

> DELETE  4  @  47 : 52

> DELETE  57  @  62 : 63

> DELETE  42  @  43 : 82

> DELETE  73  @  112 : 120

> DELETE  140  @  148 : 149

> DELETE  19  @  20 : 30

> DELETE  1  @  11 : 14

> CHANGE  94 : 95  @  97 : 98

~ 		public void modifyMerchantRecipeList(MerchantRecipeList recipeList, EaglercraftRandom random) {

> CHANGE  11 : 12  @  11 : 12

~ 		void modifyMerchantRecipeList(MerchantRecipeList var1, EaglercraftRandom var2);

> CHANGE  17 : 18  @  17 : 18

~ 		public void modifyMerchantRecipeList(MerchantRecipeList merchantrecipelist, EaglercraftRandom random) {

> CHANGE  19 : 20  @  19 : 20

~ 		public void modifyMerchantRecipeList(MerchantRecipeList merchantrecipelist, EaglercraftRandom random) {

> CHANGE  24 : 25  @  24 : 25

~ 		public void modifyMerchantRecipeList(MerchantRecipeList merchantrecipelist, EaglercraftRandom random) {

> CHANGE  27 : 28  @  27 : 28

~ 		public void modifyMerchantRecipeList(MerchantRecipeList merchantrecipelist, EaglercraftRandom random) {

> CHANGE  25 : 26  @  25 : 26

~ 		public int getPrice(EaglercraftRandom rand) {

> EOF
