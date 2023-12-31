package com.dux.pandorica_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeMode {
    public static final CreativeModeTab Pandorica_Tab = new CreativeModeTab("Pandorica Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PANDORICA.get());
        }
    };

}
