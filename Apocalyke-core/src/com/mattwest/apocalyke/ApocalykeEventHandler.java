package com.mattwest.apocalyke;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;

public class ApocalykeEventHandler implements InputProcessor {

	private ApocalykeGameObject gameObject;

	public ApocalykeEventHandler(ApocalykeGameObject apocalykeGameObject) {
		gameObject = apocalykeGameObject;
	}

	@Override
	public boolean keyDown(int keycode) {
		switch (keycode) {
		case Input.Keys.NUMPAD_8:
			gameObject.getPlayer().move(Cardinal.NORTH, 1);
			break;
		case Input.Keys.NUMPAD_9:
			gameObject.getPlayer().move(Cardinal.NORTHEAST, 1);
			break;
		case Input.Keys.NUMPAD_6:
			gameObject.getPlayer().move(Cardinal.EAST, 1);
			break;
		case Input.Keys.NUMPAD_3:
			gameObject.getPlayer().move(Cardinal.SOUTHEAST, 1);
			break;
		case Input.Keys.NUMPAD_2:
			gameObject.getPlayer().move(Cardinal.SOUTH, 1);
			break;
		case Input.Keys.NUMPAD_1:
			gameObject.getPlayer().move(Cardinal.SOUTHWEST, 1);
			break;
		case Input.Keys.NUMPAD_4:
			gameObject.getPlayer().move(Cardinal.WEST, 1);
			break;
		case Input.Keys.NUMPAD_7:
			gameObject.getPlayer().move(Cardinal.NORTHWEST, 1);
			break;
		case Input.Keys.F1:
			Gdx.app.log("PLAYER_POSITION", gameObject.getPlayer().getPos().toString());
			Gdx.app.log("CAMERA_POSITION", gameObject.getCam().position.toString());
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
