/**
 * This is where new items are added
 * items allows for the player to interact with the world
 * such as placing blocks, using tools etc
 */
package net.fabricmc.example.item;

import net.fabricmc.example.item.custom.HealingWand;
import net.fabricmc.example.item.custom.JetPack;
import net.fabricmc.example.item.custom.JetPackControl;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.example.Example;
import net.minecraft.item.Item;

public class ModItems{

    //These variables declearations creates items by calling registerItem()

    /** The ruby item*/
    public static final Item RUBY = registerItem("ruby",
            new Item(
                    new FabricItemSettings().group(ItemGroup.MISC) //puts the item in the miscellaneous group
            )
    );

    /** The healing wand item*/
    public static final  Item HEALING_WAND = registerItem("healing_wand",
            new HealingWand(
                    new FabricItemSettings().group(ItemGroup.MISC) //puts the item in the miscellaneous group
            )
    );

    /** The jetpack control item */
    public static final  Item JETPACK_CONTROL = registerItem("jetpack_control",
            new JetPackControl(
                    new FabricItemSettings().group(ItemGroup.MISC) //puts the item in the miscellaneous group
            )
    );

    /** The jetpack item*/
    public static final  Item JETPACK = registerItem("jetpack",
            new JetPack(
                    new FabricItemSettings().group(ItemGroup.MISC) //puts the item in the miscellaneous group
            )
    );

    /**
     * Tells Fabric to register a new item into minecraft registry
     * This is called during variable declaration of the above variables in order to add items
     * @param name the in game name of the item
     * @param item the parameter of the item
     * @return Item the item that is to be created
     */
    private static Item registerItem(String name, Item item){

        return Registry.register(Registry.ITEM, new Identifier(Example.mod_id, name), item);
    }
    public static void registerModItems(){
        Example.LOGGER.info("Registering mod items");
    } //console output, not visible

}
