package net.thedaftcat.gardeningmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thedaftcat.gardeningmod.GardeningMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GardeningMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GARDENING_SEEDS_FRUIT_TAB =CREATIVE_MODE_TABS.register("gardening_seeds_fuit_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MANGO.get()))
                    .title(Component.translatable("creativetab.gardeningmod.gardening_seeds_fruit"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MANGO.get());
                        output.accept(ModItems.MANGO_SEED.get());
                        output.accept(ModItems.BLUEBERRY.get());
                        output.accept(ModItems.BLUEBERRY_SEED.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}