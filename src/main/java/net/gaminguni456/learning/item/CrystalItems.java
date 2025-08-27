package net.gaminguni456.learning.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class CrystalItems {
    public static final Item BLUE_CRYSTAL = ModItems.registerItem("blue_crystal", Item::new, new Item.Settings());
    public static final Item GREEN_CRYSTAL = ModItems.registerItem("green_crystal", Item::new, new Item.Settings());
    public static final Item PURPLE_CRYSTAL = ModItems.registerItem("purple_crystal", Item::new, new Item.Settings());

    public static void registerCrystals() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.BLUE_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.GREEN_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.PURPLE_CRYSTAL));
    }
}
