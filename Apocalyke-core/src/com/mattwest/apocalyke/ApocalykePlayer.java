package com.mattwest.apocalyke;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class ApocalykePlayer extends ApocalykeCreature {

	private OrthographicCamera cam;

	public ApocalykePlayer(String name, int maxHp, Sprite sprite, Vector2 startPos, OrthographicCamera cam) {
		super(name, maxHp, sprite, startPos);
		this.cam = cam;
		cam.translate(new Vector2(-10,-10));
		cam.update();
		updateSprite();
	}
	
	@Override
	protected void updateSprite() {
		getSprite().setPosition((float) (Math.floor(cam.viewportWidth/2) * getUnitSize()),
				(float) (Math.floor(cam.viewportHeight/2) * getUnitSize()));
	}
	
	@Override
	public void move(Cardinal cardinal, int increment) {
		super.move(cardinal, increment);
		Vector2 vector = new Vector2(0,0);
		
		switch (cardinal) {
		case NORTH:
			vector.y = increment;
			break;
		case NORTHEAST:
			vector.y = increment;
			vector.x = increment;
			break;
		case EAST:
			vector.x = increment;
			break;
		case SOUTHEAST:
			vector.y = -increment;
			vector.x = increment;
			break;
		case SOUTH:
			vector.y = -increment;
			break;
		case SOUTHWEST:
			vector.y = -increment;
			vector.x = -increment;
			break;
		case WEST:
			vector.x = -increment;
			break;
		case NORTHWEST:
			vector.y = increment;
			vector.x = -increment;
			break;
		default:
			Gdx.app.log("Unrecognised Cardinal", cardinal.toString());
			break;
		}
		
		cam.translate(vector);
		cam.update();
		updateSprite();
	}

}
