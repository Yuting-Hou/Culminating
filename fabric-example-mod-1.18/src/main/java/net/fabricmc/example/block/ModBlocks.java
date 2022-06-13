/**
 *This class describes how a block can be added to the game
 * A block consists of two things:
 * The block itself, which is what you see in the mincraft mod as a block
 * And a blockItem, which is an item repersenting the block that the player can hold and place down.
 */
package net.fabricmc.example.block;

import net.fabricmc.example.Example;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE) //gives the ruby ore a proprotie of stone
                    .strength(4f)
                    .requiresTool()
            ),
            ItemGroup.MISC);

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            )
            ,ItemGroup.MISC

            );

    /**
     * Register(mod) a block into minecraft
     * @param name
     * @param block
     * @param group
     * @return
     */
    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block,group);
        return Registry.register(Registry.BLOCK, new Identifier(Example.mod_id, name), block);
    }


    /**
     * Register a blockItem for a block into minecraft
     * This allows for the player to hold and place down the block
     * @param name
     * @param block
     * @param group
     * @return
     */
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(Example.mod_id, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    };

    public static void registerModBlocks(){

    }
}
