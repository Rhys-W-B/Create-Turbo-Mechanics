package net.rwbrocke.createTurboMechanics.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rwbrocke.createTurboMechanics.block.ModBlocks;
import net.rwbrocke.createTurboMechanics.createTurboMechanics;

public class ModCreativemodeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, createTurboMechanics.MODID);

    public static final RegistryObject<CreativeModeTab> CREATE_TURBO_MECHANICS = CREATIVE_MODE_TABS.register("turbomechanics",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.CHROMIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.turbomechanics"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHROMIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_CHROMITE.get());
                        pOutput.accept(ModItems.CRUSHED_CHROMIUM.get());
                        pOutput.accept(ModItems.CRUSTY_INGOT.get());
                        pOutput.accept(ModBlocks.CHROMITE_ORE.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_CHROMIUM.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_RAW_CHROMITE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
