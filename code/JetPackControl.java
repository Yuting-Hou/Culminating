/**
 * Yuting Hou - jun 20, 2022
 * This is the jetpack control item
 * Jetpack control gives its user upward velocity when used
 * Jetpack control needs jetpack to work
 */
package net.fabricmc.example.item.custom;

import net.fabricmc.example.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class JetPackControl extends Item {
    public JetPackControl(Settings settings) {
        super(settings);
    }

    /**
     * This method controls the behavior of the jetpack/jetpack control
     * @param world the minecraft world (not used)
     * @param user the user of the jetpack
     * @param hand the hand that does the action
     * @return TypedActionResult the result of the action
     */
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack itemStack = user.getEquippedStack(EquipmentSlot.CHEST); //determines if the user has a jetpack equipped

        if (itemStack.isOf(ModItems.JETPACK)) {
            user.addVelocity(0, 0.5, 0); //add upward velocity
            
       }

        return super.use(world, user, hand);
    }

}
