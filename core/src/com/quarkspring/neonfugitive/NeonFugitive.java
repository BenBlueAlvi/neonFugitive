package com.quarkspring.neonfugitive;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public class NeonFugitive extends Game {
	public static final int viewWidth = 1280;
	public static final int viewHeight = 768;

	public static final float aspectRatio = (float) viewWidth / (float) viewHeight;
	
	public static LabelStyle font;


	@Override
	public void create() {
		// viewBorder = new Rectangle(1, 0, PS.viewWidth-1, PS.viewHeight-220);
		/*FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("assets/AndromedaTV.TTF"));
		FreeTypeFontParameter parameter = new FreeTypeFontParameter();
		parameter.size = 12;
		BitmapFont theFont = generator.generateFont(parameter); // font size 12
																// pixels
		generator.dispose(); // don't forget to dispose to avoid memory leaks!

		font = new LabelStyle(new BitmapFont(), Color.WHITE);*/

		GameplayScreen ms = new GameplayScreen(this);

		setScreen(ms);
	}

	public static int getViewHeight() {
		return viewHeight;
	}

	public static int getViewWidth() {

		return viewWidth;
	}
}
