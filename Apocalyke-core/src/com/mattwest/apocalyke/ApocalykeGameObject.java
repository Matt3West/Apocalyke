package com.mattwest.apocalyke;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell;
import com.badlogic.gdx.math.Vector2;

public class ApocalykeGameObject {

	private SpriteBatch batch;
	private ApocalykeEventHandler eventHandler;
	private OrthographicCamera cam;
	private ApocalykePlayer player;
	private TiledMap map;

	public ApocalykeGameObject(SpriteBatch sb, OrthographicCamera c, TiledMap map) {
		setCam(c);
		setBatch(sb);
		setEventHandler(new ApocalykeEventHandler(this));
		setMap(map);
		setPlayer(new ApocalykePlayer("PLAYER", 10, new Sprite(new Texture("player_sprite.png")), new Vector2(0,0), cam));
	}
	
	public TiledMapTile getTileAtPos(Vector2 pos) {
		TiledMapTileLayer layer = (TiledMapTileLayer) map.getLayers().get(0);
		Cell cell = layer.getCell(Math.round(pos.x), Math.round(pos.y));
		return cell.getTile();
	}

	private void setMap(TiledMap map) {
		this.map = map;
	}

	public SpriteBatch getBatch() {
		return batch;
	}

	public void setBatch(SpriteBatch batch) {
		this.batch = batch;
	}

	public ApocalykeEventHandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(ApocalykeEventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}

	public OrthographicCamera getCam() {
		return cam;
	}

	public void setCam(OrthographicCamera cam) {
		this.cam = cam;
	}

	public ApocalykePlayer getPlayer() {
		return player;
	}

	public void setPlayer(ApocalykePlayer player) {
		this.player = player;
	}

}
