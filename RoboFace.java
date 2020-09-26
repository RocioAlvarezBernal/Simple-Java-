/*
 * Decomp and Psuedo 
 * Make a face with the required specifications using acm graphics
 * Predict I will need to use set add fill 
 * 
 * Centering head (x,y,width, height) x and y need to be the center of the window its open in 
 * 
 * variable x=pixels (left to right) the width of the rect needs to be taken into consideration find the center 
 * of the canvas set the left most point to it but the rect will be too much to the right to then start it half (the middle distance to the left)
 * subtract hald the width of the rect! 
 */

import java.awt.Color;
import acm.graphics.GCanvas;
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
		leftEye();
		rightEye();
		mouth();
	}

//head should be centered gray with black outline 
	private void head() {
//x location 
		double canvasWidth= getWidth(); 
		double canvasXCenter= canvasWidth/2;
		double halfHeadWidth = HEAD_WIDTH / 2;
		double xDimCenter = canvasXCenter - halfHeadWidth;
		
// y location 
		double canvasHeight= getHeight(); 
		double canvasYCenter= canvasHeight/2;
		double halfHeadHeight = HEAD_HEIGHT / 2;
		double YDimCenter = canvasYCenter - halfHeadHeight;
		
		GRect headRect = new GRect(xDimCenter, YDimCenter, HEAD_WIDTH,HEAD_HEIGHT); // center center width height
		headRect.setFilled(true);
		headRect.setFillColor(Color.GRAY);
		add(headRect);
		
	}
/*pixels horizontally a quarter of the width of the head in from edges and one quarter of the distance down from
the top of the head filled yellow.*/
	private void leftEye() {
		
		double LOvalXDim = 4;
		double LOvalYDim = 4 ;
		GOval lEyeOval = new GOval (LOvalXDim, LOvalYDim, EYE_RADIUS,EYE_RADIUS);
		lEyeOval.setFilled(true);
		lEyeOval.setFillColor(Color.yellow);
		add(lEyeOval);
		
	}
	
	private void rightEye() {
		
		double ROvalXDim = 2;
		double ROvalYDim = 2;
		GOval rEyeOval = new GOval (ROvalXDim, ROvalYDim, EYE_RADIUS,EYE_RADIUS);
		rEyeOval.setFilled(true);
		rEyeOval.setFillColor(Color.yellow);
		add(rEyeOval);
		
	}
// centered in head x && 1/4 up from the bottom aka y dimension filled while 
	private void mouth() {
		GRect mouthRect = new GRect(10,0, MOUTH_WIDTH,MOUTH_HEIGHT); // center center width height
		mouthRect.setFilled(true);
		mouthRect.setFillColor(Color.white);
		add(mouthRect);

	}
	
	private void arrangeEyes() {
		
	}
	
 
}

