/*
 * Decomp and Psuedo 
 * Make a face with the required specifications using acm graphics
 * Predict I will need to use set add fill 
 * 
 * Centering head (x,y,width, height) x and y need to be the center of the window its open in 
 * 
 * variable x=pixels (left to right) the width of the rect needs to be taken into consideration find the center 
 * of the canvas set the left most point to it but the rect will be too much to the right solution start it half (the middle distance to the left
 * subtract half the width of the rect!) 
 */

import java.awt.Color;
import acm.graphics.GCanvas;
import acm.graphics.*;
import acm.program.*;

public class RoboFace extends GraphicsProgram {
// Constant Zone per assignment specifications 
private static final int HEAD_WIDTH = 400;
private static final int HEAD_HEIGHT = 450;
private static final int EYE_RADIUS = 80; 
private static final int MOUTH_WIDTH = 300;
private static final int MOUTH_HEIGHT = 100;
/* affected the settings diff than adding them in their own methods so I could not build it all and then set it to the center 
		double canvasXCenter= getWidth() /2;
		double canvasYCenter= getHeight() /2;
		double sectFaceWidth= HEAD_WIDTH / 4;
		double sectFaceHeight= HEAD_HEIGHT / 4;
*/
	public void run() {
		buildFace(); // first build a face then set it all to center
	}

//head should be centered gray with black outline 
	private void head() {
//x location 
		double canvasXCenter= getWidth() /2;
		double xHead = canvasXCenter - (HEAD_WIDTH / 2);
		
// y location 
		double canvasYCenter= getHeight()/2;
		double yHead = canvasYCenter - (HEAD_HEIGHT / 2);
		
		GRect headRect = new GRect(xHead, yHead,HEAD_WIDTH, HEAD_HEIGHT); 
		headRect.setFilled(true);
		headRect.setFillColor(Color.GRAY);
		add(headRect);
		
	}
/*pixels horizontally a quarter of the width of the head in from edges and one quarter of the distance down from
*the top of the head filled yellow.take the face location and width and divide them into fourths for eye placement 
*/
	private void leftEye() {
		double canvasXCenter= getWidth() /2;
		double canvasYCenter= getHeight() /2;
		double sectFaceWidth= HEAD_WIDTH / 4;
		double sectFaceHeight= HEAD_HEIGHT / 4;

//		double xLeft = canvasXCenter - (HEAD_WIDTH / 4) - EYE_RADIUS ;
		double xLeft = canvasXCenter - (sectFaceWidth + EYE_RADIUS);
//		double yLeft = canvasYCenter - HEAD_HEIGHT/ 4 * 2 - EYE_RADIUS ;
		double yLeft = canvasYCenter - ((sectFaceHeight * 2) - EYE_RADIUS) ;

		GOval lEyeOval = new GOval (xLeft, yLeft, EYE_RADIUS,EYE_RADIUS);
		lEyeOval.setFilled(true);
		lEyeOval.setFillColor(Color.GREEN);
		add(lEyeOval);
		
	}
	
	private void rightEye() {
		double canvasXCenter= getWidth() /2;
		double canvasYCenter= getHeight() /2;
		double sectFaceWidth= HEAD_WIDTH / 4;
		double sectFaceHeight= HEAD_HEIGHT / 4;
		
//		double xRight = canvasXCenter + (HEAD_WIDTH/2) - (HEAD_WIDTH/4) ;
		double xRight = canvasXCenter + sectFaceWidth;
//		double yRight = canvasYCenter - HEAD_HEIGHT/ 4 * 2 - EYE_RADIUS ;
		double yRight = canvasYCenter - ((sectFaceHeight * 2) - EYE_RADIUS);
				
		GOval rEyeOval = new GOval (xRight, yRight, EYE_RADIUS,EYE_RADIUS);
		rEyeOval.setFilled(true);
		rEyeOval.setFillColor(Color.yellow);
		add(rEyeOval);
		
	}
// centered in head x && 1/4 up from the bottom aka y dimension filled while 
	private void mouth() {
		double canvasXCenter= getWidth() /2;
		double canvasYCenter= getHeight() /2;
		double sectFaceWidth= HEAD_WIDTH / 4;
		double sectFaceHeight= HEAD_HEIGHT / 4;

		double yMouth = canvasYCenter - (sectFaceHeight - (MOUTH_WIDTH/2));
		double xMouth = canvasXCenter- (MOUTH_WIDTH/2);
		GRect mouthRect = new GRect(xMouth,yMouth, MOUTH_WIDTH,MOUTH_HEIGHT); 
		mouthRect.setFilled(true);
		mouthRect.setFillColor(Color.white);
		add(mouthRect);

	}
	
	private void buildFace() {
		
		head();
		leftEye();
		rightEye();
		mouth();
		
	}
	
	
	
 
}

