package net.rwbrocke.createTurboMechanics.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rwbrocke.createTurboMechanics.createTurboMechanics;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, createTurboMechanics.MODID);


    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromiumingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CHROMITE = ITEMS.register("rawchromite",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRUSHED_CHROMIUM = ITEMS.register("crushedchromium",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRUSTY_INGOT = ITEMS.register("crustyingot",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
