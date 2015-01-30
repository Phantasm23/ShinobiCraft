package phantasm23.shinobicraft.common.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityShuriken extends EntityThrowable {

	public EntityShuriken(World world) {
		super(world);
	}

	public EntityShuriken(World world, EntityLivingBase livingEntity) {
		super(world, livingEntity);
	}

	public EntityShuriken(World world, double PosX, double posY, double PosZ) {
		super(world, PosX, posY, PosZ);
	}

	@Override
	protected void onImpact(MovingObjectPosition impact) {
		if (impact.entityHit != null) {
			byte damage = 5;
			if (impact.entityHit instanceof EntityEnderman) {
				damage = 0;
			}
			impact.entityHit.attackEntityFrom(
					DamageSource.causeThrownDamage(this, this.getThrower()),
					damage);
		}
		for (int i = 0; i < 8; ++i) {
			this.worldObj.spawnParticle("crit", this.posX, this.posY,
					this.posZ, 0.0D, 0.0D, 0.0D);
		}
		if (!this.worldObj.isRemote) {
			this.setDead();
		}
	}

}
