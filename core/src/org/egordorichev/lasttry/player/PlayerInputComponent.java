package org.egordorichev.lasttry.player;

import org.egordorichev.lasttry.entity.components.EntityComponent;
import org.egordorichev.lasttry.entity.components.PhysicsComponent;
import org.egordorichev.lasttry.input.InputManager;
import org.egordorichev.lasttry.input.Keys;
import org.egordorichev.lasttry.ui.UiInventory;

public class PlayerInputComponent extends EntityComponent<Player> {
	public PlayerInputComponent(Player player) {
		super(player);
	}

	@Override
	public void update(int dt) {
		if (InputManager.isKeyDown(Keys.JUMP)) {
			this.entity.physics.jump();
		}

		if (InputManager.isKeyDown(Keys.MOVE_LEFT)) {
			this.entity.physics.move(PhysicsComponent.Direction.LEFT);
		}

		if (InputManager.isKeyDown(Keys.MOVE_RIGHT)) {
			this.entity.physics.move(PhysicsComponent.Direction.RIGHT);
		}

		if (InputManager.isKeyJustDown(Keys.OPEN_INVENTORY)) {
			UiInventory inv = this.entity.getInventory();
			inv.toggle();
		}
	}
}