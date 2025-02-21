package com.crezent.phantomdreamcatcher.item;

import com.crezent.phantomdreamcatcher.PhantomDreamCatcher;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PhantomDreamCatcher.MOD_ID);

    public static final DeferredItem<Item> DREAMCATCHER = ITEMS.register("dreamcatcher", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
