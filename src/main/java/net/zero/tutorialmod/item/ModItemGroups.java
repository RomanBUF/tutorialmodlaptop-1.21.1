package net.zero.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zero.tutorialmod.TutorialMod;
import net.zero.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup SHOOTING_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "shooting_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.Bullets))
                    .displayName(Text.translatable("itemgroup.tutorialmod.shooting_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Bullets);
                    })
                    .build());

    public static final ItemGroup SHOOTING_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "shooting_blocks"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.LAND_MINE_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.shooting_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.LAND_MINE_BLOCK);
                    })
                    .build());

    public static void registerItemGroups() {

        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }

}
