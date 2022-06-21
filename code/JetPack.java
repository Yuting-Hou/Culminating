/**
 * Yuting Hou - jun 20, 2022
 * This is the jetpack equipment
 * note that jetpack cannot be equipped like conventional armor
 */
package net.fabricmc.example.item.custom;

import net.fabricmc.example.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Wearable;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class JetPack extends Item implements Wearable{
    public JetPack(Settings settings) {
        super(settings);
    }

    /**
     * This method puts the jetpack on the user
     * @param world the minecraft mod
     * @param user the user
     * @param hand the hand
     * @return TypedAction result the result of the action
     */
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack stack = new ItemStack(ModItems.JETPACK); //ItemStack -> new "instance" of a item in the minecraft world

        //if the user does not have anything equpped in the chest slot
        if (!user.hasStackEquipped(EquipmentSlot.CHEST)) {
            user.getInventory().removeStack(user.getInventory().getSlotWithStack(stack)); //removes the jetpack item from user's inventory
            user.equipStack(EquipmentSlot.CHEST, stack); //equips the jetpack on the user
        }
        return super.use(world, user, hand);
    }
}
