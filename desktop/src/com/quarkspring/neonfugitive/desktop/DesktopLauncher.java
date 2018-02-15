package com.quarkspring.neonfugitive.desktop;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.quarkspring.neonfugitive.NeonFugitive;


public class DesktopLauncher {
	public static void main (String[] arg) {
		NeonFugitive theGame = new NeonFugitive();
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Neon Fugitive";
		cfg.height = NeonFugitive.viewHeight;
		cfg.width =  NeonFugitive.viewWidth;
	
		cfg.addIcon("assets/icon.png", FileType.Internal);

		
	
		LwjglApplication launcher = new LwjglApplication(theGame, cfg);
	}
}
