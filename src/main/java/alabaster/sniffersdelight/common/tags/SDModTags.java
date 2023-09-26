package alabaster.sniffersdelight.common.tags;

import alabaster.sniffersdelight.SniffersDelight;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class SDModTags {

    private static TagKey<Item> modItemTag(String path) {
        return ItemTags.create(new ResourceLocation(SniffersDelight.MODID, path));
    }
}