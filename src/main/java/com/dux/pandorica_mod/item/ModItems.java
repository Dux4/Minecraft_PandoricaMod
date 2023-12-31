package com.dux.pandorica_mod.item;

import com.dux.pandorica_mod.Pandorica_mod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Pandorica_mod.MOD_ID);

    //Não registre nomes iguais
    public static final RegistryObject<Item> PANDORICA = ITEMS.register("pandoricakey",
            ()-> new Item(new Item.Properties().tab(ModCreativeMode.Pandorica_Tab)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
