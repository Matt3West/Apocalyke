package com.mattwest.apocalyke;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class ApocalykeCreature {
	
	private String name;
	private int maxHp;
	private int hp;
	private Sprite sprite;
	private Vector2 pos;
	private float unitSize;
	
	public ApocalykeCreature (String name, int maxHp, Sprite sprite, Vector2 startPos) {
		setName(name);
		setMaxHp(maxHp);
		setHp(maxHp);
		setSprite(sprite);
		setPos(startPos);
		setUnitSize(sprite.getWidth());
	}
	
	public void move(Cardinal cardinal, int increment) {
		switch (cardinal) {
		case NORTH:
			pos.add(new Vector2(0, increment));
			break;
		case NORTHEAST:
			pos.add(new Vector2(increment, increment));
			break;
		case EAST:
			pos.add(new Vector2(increment, 0));
			break;
		case SOUTHEAST:
			pos.add(new Vector2(increment, -increment));
			break;
		case SOUTH:
			pos.add(new Vector2(0, -increment));
			break;
		case SOUTHWEST:
			pos.add(new Vector2(-increment, -increment));
			break;
		case WEST:
			pos.add(new Vector2(-increment, 0));
			break;
		case NORTHWEST:
			pos.add(new Vector2(-increment, increment));
			break;
		default:
			Gdx.app.log("Unrecognised Cardinal", cardinal.toString());
			break;
		}
		updateSprite();
	}

	protected void updateSprite() {
		float unitSize = getSprite().getWidth();
		this.getSprite().setPosition(pos.x * unitSize, pos.y * unitSize);
	}

	public Vector2 getPos() {
		return pos;
	}

	public void setPos(Vector2 pos) {
		this.pos = pos;
	}

	public Sprite getSprite() {
		return sprite;
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getUnitSize() {
		return unitSize;
	}

	public void setUnitSize(float unitSize) {
		this.unitSize = unitSize;
	}

}
