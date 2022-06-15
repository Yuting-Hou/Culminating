/**
 * This is where new items are added
 * items allows for the player to interact with the world
 * such as placing blocks, using tools etc
 */
package net.fabricmc.example.item;

import net.fabricmc.example.item.custom.HealingWand;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.example.Example;
import net.minecraft.item.Item;

public class ModItems{

    //These variables declearations creates items by calling registerItem()

    //declares a Ruby item
    public static final Item RUBY = registerItem("ruby",
            new Item(
                    new FabricItemSettings().group(ItemGroup.MISC)
            )
    );

    public static final  Item HEALING_WAND = registerItem("healing_wand",
            new HealingWand(
                    new FabricItemSettings().group(ItemGroup.MISC)
            )
            );

    /**
     * Tells Fabric to register a new item into minecraft registry
     * @param name the in game name of the item
     * @param item the parameter of the item
     * @return Item the item that is to be created
     */
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Example.mod_id, name), item);
    }
    public static void registerModItems(){
        Example.LOGGER.info("Registering mod items");
    }

}
