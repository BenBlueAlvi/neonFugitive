package com.quarkspring.neonfugitive;

import java.util.ArrayList;
import java.util.UUID;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class NFUtils {
	
	
	public static Texture emptyTexture = NFUtils.getImg("empty");
	
	public static Vector2 polarToRect(int r, double angle, Vector2 origin) {
		Vector2 v = new Vector2();
		v.x = (float) (r * Math.cos(Math.toRadians(angle))) + origin.x;
		v.y = (float) (r * Math.sin(Math.toRadians(angle))) + origin.y;

		return v;
	}

	public static void insertionSort(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int index = ar[i];
			int j = i;
			while (j > 0 && ar[j - 1] > index) {
				ar[j] = ar[j - 1];
				j--;
			}
			ar[j] = index;
		}

	}

	public static Texture getImg(String path) {
		try {
			Texture t = new Texture(Gdx.files.internal("assets/" + path + ".png"));
			return t;

		} catch (Exception GdxRuntimeException) {
			System.out.println("Error: Could not find: " + path + " substituting...");
			Texture t = new Texture(Gdx.files.internal("assets/missingTex.png"));
			return t;
		}
	}

	
	/**
	 * gets the angle between the two given points
	 * @param x the x coord of the first point
	 * @param y the y coord of the first point
	 * @param x2 the x coord of the second point
	 * @param y2 the y coord of the second point
	 * @return Double the angle between the two points
	 */
	public static double angleBetweenPoints(float x, float y, float x2, float y2) {

		double yDiff = y - y2;
		double xDiff = x - x2;
		double newAngle = Math.toDegrees(Math.atan2(yDiff, xDiff)) + 180;
	

		return newAngle;

	}
	/**
	 * Converts an angle into a unit vector at that angle.
	 * @param angle an angle in degrees
	 * @return the corresponding unit vector
	 */

	public static Vector2 convertVel(float angle) {
		double radians = Math.toRadians(angle);

		return new Vector2((float) Math.cos(radians), (float) Math.sin(radians));
	}
	
	/**
	 * Calculated the distance between two points
	 * @param x the x coord of the first point	
	 * @param y the y coord of the first point
	 * @param x2 the x coord of the second point
	 * @param y2 the y coord of the second point
	 * @return the distance between the two points
	 */
	public static double distanceTo(double x, double y, double x2, double y2) {

		return Math.hypot(Math.abs(x2 - x), Math.abs(y2 - y));
	}

	
	
	

	
	
	

}
