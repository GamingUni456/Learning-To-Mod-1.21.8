package net.gaminguni456.learning.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class CrystalItems {
    // Components
    public static final FoodComponent CRYSTAL_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(5)
            .saturationModifier(0.2f)
            .build();
    public static final ConsumableComponent CRYSTAL_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 120 * 20, 0), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 120 * 20, 0), 1.0f))
            .build();


    // Crystal Items
    public static final Item BLUE_CRYSTAL = ModItems.registerItem("blue_crystal", Item::new, new Item.Settings());
    public static final Item GREEN_CRYSTAL = ModItems.registerItem("green_crystal", Item::new, new Item.Settings());
    public static final Item PURPLE_CRYSTAL = ModItems.registerItem("purple_crystal", Item::new, new Item.Settings());
    public static final Item BLUE_REFINED_CRYSTAL = ModItems.registerItem("blue_refined_crystal", Item::new, new Item.Settings());
    public static final Item GREEN_REFINED_CRYSTAL = ModItems.registerItem("green_refined_crystal", Item::new, new Item.Settings());
    public static final Item PURPLE_REFINED_CRYSTAL = ModItems.registerItem("purple_refined_crystal", Item::new, new Item.Settings());
    public static final Item CRYSTAL_APPLE = ModItems.registerItem("crystal_apple", Item::new, new Item.Settings().food(CRYSTAL_FOOD_COMPONENT, CRYSTAL_CONSUMABLE_COMPONENT));


    public static void registerCrystals() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.BLUE_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.GREEN_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.PURPLE_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.BLUE_REFINED_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.GREEN_REFINED_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.PURPLE_REFINED_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(CrystalItems.CRYSTAL_APPLE));
    }
}
