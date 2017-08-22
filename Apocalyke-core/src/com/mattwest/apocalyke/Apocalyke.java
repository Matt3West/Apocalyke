package com.mattwest.apocalyke;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class Apocalyke extends ApplicationAdapter {
	SpriteBatch batch;
	TiledMap map;
	OrthogonalTiledMapRenderer mapRenderer;
	OrthographicCamera cam;
	private int unitSize = 32;
	
	ApocalykeGameObject gameObject;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		map = new TmxMapLoader().load("test_map.tmx");
		mapRenderer = new OrthogonalTiledMapRenderer(map, 1f / unitSize);
		cam = new OrthographicCamera();
		cam.setToOrtho(false, Gdx.graphics.getWidth()/unitSize, Gdx.graphics.getHeight()/unitSize);
		gameObject = new ApocalykeGameObject(batch, cam, map);
		Gdx.input.setInputProcessor(gameObject.getEventHandler());
	}

	@Override
	public void render () {		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		mapRenderer.setView(cam);
		mapRenderer.render();
		batch.begin();
		gameObject.getPlayer().getSprite().draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
