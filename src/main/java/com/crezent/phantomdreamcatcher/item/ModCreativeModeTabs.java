package com.crezent.phantomdreamcatcher.item;

import com.crezent.phantomdreamcatcher.PhantomDreamCatcher;
import com.crezent.phantomdreamcatcher.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PhantomDreamCatcher.MOD_ID);

    public static final Supplier<CreativeModeTab> PHANTOM_DREAM_CATCHER_TAB = CREATIVE_MODE_TAB.register("phantom_dream_catcher_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DREAMCATCHER.get()))
                    .title(Component.translatable("creativetab.phantomdreamcatcher.phantom_dream_catcher"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModItems.DREAMCATCHER);
                        output.accept(ModBlocks.DREAMCATCHER_BLOCK);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
