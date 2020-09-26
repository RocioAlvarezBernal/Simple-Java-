/*
 * Decomp and Psuedo 
 * Make a face with the required specifications using acm graphics
 * Predict I will need to use set add fill 
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class RoboFace extends GraphicsProgram {
// Constant Zone per assignment specifications 
private static final int HEAD_WIDTH = 75;
private static final int HEAD_HEIGHT = 125;
private static final int EYE_RADIUS = 20; 
private static final int MOUTH_WIDTH = 40;
private static final int MOUTH_HEIGHT = 20;
	
	public void run() {
		head();
//		add( head() );
		eyes();
		eyes();
		mouth();
	}

//head should be centered gray with black outline 
	private void head() {
		GRect headRect = new GRect(10,0, HEAD_WIDTH,HEAD_HEIGHT); // center center width height
		headRect.setFilled(true);
		headRect.setFillColor(Color.GRAY);
		add(headRect);
		
	}
/*pixels horizontally a quarter of the width of the head in from edges and one quarter of the distance down from
the top of the head filled yellow.*/
	private void eyes() {
		GOval eyeOvals = new GOval (EYE_RADIUS,EYE_RADIUS);
		add(eyeOvals);
		eyeOvals.setFilled(true);
		eyeOvals.setFillColor(Color.yellow);
		
	}
// centered in head x && 1/4 up from the bottom aka y dimension filled while 
	private void mouth() {
		GRect mouthRect = new GRect(10,0, MOUTH_WIDTH,MOUTH_HEIGHT); // center center width height
		mouthRect.setFilled(true);
		mouthRect.setFillColor(Color.white);
		add(mouthRect);

	}
 
}
