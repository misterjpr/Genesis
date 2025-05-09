package net.misterjpr.genesis.item;

import net.minecraft.world.item.Item;
import net.misterjpr.genesis.Genesis;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS_REGISTER = DeferredRegister.createItems(Genesis.MODID);

    public static final Supplier<Item> ETERNAL_ORB = ITEMS_REGISTER.registerSimpleItem("eternal_orb");

    public static void register(IEventBus eventBus) {
        ITEMS_REGISTER.register(eventBus);
    }
}
