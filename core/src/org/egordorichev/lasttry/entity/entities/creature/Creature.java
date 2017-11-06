package org.egordorichev.lasttry.entity.entities.creature;

import org.egordorichev.lasttry.entity.Entity;
import org.egordorichev.lasttry.entity.component.PositionComponent;
import org.egordorichev.lasttry.entity.component.TextureComponent;
import org.egordorichev.lasttry.entity.component.physics.AccelerationComponent;
import org.egordorichev.lasttry.entity.component.Component;
import org.egordorichev.lasttry.entity.component.physics.VelocityComponent;

/**
 * Represents all mobs, players, NPCs and etc
 */
public class Creature extends Entity {
	public Creature(Class<? extends Component> ... types) {
		super(HealthComponent.class, PositionComponent.class, AccelerationComponent.class,
			VelocityComponent.class, TextureComponent.class, AnimationComponent.class);

		this.addComponent(types);
	}

	/**
	 * Renders the entity
	 */
	@Override
	public void render() {
		AnimationComponent animation = this.getComponent(AnimationComponent.class);

		if (animation.current != null) {
			PositionComponent position = this.getComponent(PositionComponent.class);
			animation.current.render(position.x, position.y);
		}
	}
}