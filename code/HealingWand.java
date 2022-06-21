/**
 * Yuting Hou - jun 20, 2022
 * This is the healing wand class
 * Healing wand heals the player when they right click with the wand
 */
package net.fabricmc.example.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class HealingWand extends Item {

    public HealingWand(Settings settings) {
        super(settings);
    }

    /**
     * This method is called whenever this item is used(right clicked)
     * @param world the world this item is in
     * @param user the user that is using the item
     * @param hand the hand the item is in
     * @return TypedActionResult, the result of the action
     */
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        //adds healing effect to the user
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 2));

        return super.use(world, user, hand);
    }
}
