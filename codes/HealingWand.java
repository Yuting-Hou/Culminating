package net.fabricmc.example.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;


public class HealingWand extends Item {

    public HealingWand(Settings settings) {
        super(settings);
    }

    /**
     *
     * @override use
     * @param world
     * @param user
     * @param hand
     * @return
     */
    @Override
    public net.minecraft.util.TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 2));

        return super.use(world, user, hand);
    }
}
