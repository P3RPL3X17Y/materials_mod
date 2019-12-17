package minecraft.tadas77.materialsmod.items;

import minecraft.tadas77.materialsmod.MinecraftList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;

public class ItemList extends MinecraftList {
	public static Item copper;

	public static void register(final RegistryEvent.Register<Item> event) {
		ItemList.copper = new Item((new Item.Properties()).group(ItemGroup.MATERIALS)).setRegistryName(location("copper_ingot"));
		event.getRegistry().registerAll(
				ItemList.copper
		);
	}
}