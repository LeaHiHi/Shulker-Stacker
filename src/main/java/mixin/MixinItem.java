package mixin;

import main.ShulkerStacker;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.apache.logging.log4j.Level;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Items.class)
public abstract class MixinItem {
//    @ModifyVariable(method = "<init>(Lnet/minecraft/item/Item/Settings;)V", at = @At(value = "FIELD", ordinal = 4))
//    private Item.Settings shulkerCheck(Item.Settings settings) {
//        return settings.maxCount(64);
//    }

    @Inject(method = "register(Lnet/minecraft/item/BlockItem;)Lnet/minecraft/item/Item;", at = @At(value = "HEAD"), cancellable = true)
    private static void shulkerCheck(BlockItem item, CallbackInfoReturnable<Item> ci) {
        if (item.getBlock().equals(Blocks.SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.WHITE_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.WHITE_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.ORANGE_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.ORANGE_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.MAGENTA_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.MAGENTA_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.LIGHT_BLUE_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.LIGHT_BLUE_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.YELLOW_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.YELLOW_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.LIME_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.LIME_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.PINK_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.PINK_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.GRAY_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.GRAY_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.LIGHT_GRAY_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.LIGHT_GRAY_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.CYAN_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.CYAN_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.PURPLE_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.PURPLE_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.BLUE_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.BLUE_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.BROWN_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.BROWN_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.GREEN_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.GREEN_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.RED_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.RED_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
        if (item.getBlock().equals(Blocks.BLACK_SHULKER_BOX)) {
            BlockItem sb = new BlockItem(Blocks.BLACK_SHULKER_BOX, ((new Item.Settings()).maxCount(64).group(ItemGroup.DECORATIONS)));
            ci.setReturnValue(shulkerStuff(sb));
        }
    }

    private static Item shulkerStuff(BlockItem sb) {
        Identifier id = Registry.BLOCK.getId(sb.getBlock());
        Item item1 = (Item)sb;

        if (item1 instanceof BlockItem) {
            ((BlockItem)item1).appendBlocks(Item.BLOCK_ITEMS, item1);
        }

        return Registry.register(Registry.ITEM, (Identifier)id, item1);
        //ShulkerStacker.log(Level.INFO, "SHULKER FOUND");
    }
}
