package com.mattwest.apocalyke.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mattwest.apocalyke.Apocalyke;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = 672;
		config.height = 672;
		
		new LwjglApplication(new Apocalyke(), config);
	}
}
