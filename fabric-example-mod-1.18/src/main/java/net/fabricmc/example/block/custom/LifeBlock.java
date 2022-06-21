/**
 * Yuting Hou - jun 20, 2022
 * This is the lifeblock class
 * Lifeblock gives the player extra HP when they stand on it
 */
package net.fabricmc.example.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LifeBlock extends Block {

    public LifeBlock(Settings settings) {
        super(settings);
    }

    /**
     * This method runs whenever a entity steps on it
     * @override onSteppedOn What will happen if the block is stepped on by a entity
     * @param world the minecraft dimension the block is in
     * @param pos the position of the block
     * @param state the state of the block
     * @param entity the instance of the entity stepped on
     */
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {


        if(!world.isClient()) { //changes where the calculation is done from client to the server

            if(entity instanceof LivingEntity) { //if the entity is living
                LivingEntity livingEntity = ((LivingEntity) entity); //casting Entity entity to LivingEntity

                //adds bonus HP effect to said entity
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1)); //addes status effect
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
