package drawingTool;

import java.awt.Color;

public class HumanFace extends OvalObject{
	private HumanEye leftEye; //composite
	private HumanEye rightEye; //composite
	private HumanNose nose; //composite
	private HumanMouth mouth; //composite

	public HumanFace(int width, int height, int locationX, int locationY) {
		super(width, height, locationX, locationY);
		int eyeWidth = width * 1/8;
		int eyeHeight = height * 1/4;
		int noseWidth = width * 1/4;
		int noseHeight = height * 1/4;
		int mouthWidth = width * 1/4;
		int mothHeight = height * 1/8;
		int mouthLocationX = locationX + width * 3/8;
		int mouthLocationY = locationY + height * 7/8;
		int leftEyeLocationX = locationX + width * 1/4;
		int leftEyeLocationY = locationY + height * 1/8;
		int rightEyeLocationX = locationX + width * 5/8;
		int rightEyeLocationY = locationY + height * 1/8;
		int noseLocationX = locationX + width * 3/8;
		int noseLocationY = locationY + height * 1/2;
		leftEye = new HumanEye(eyeWidth, eyeHeight, leftEyeLocationX, leftEyeLocationY);
		rightEye = new HumanEye(eyeWidth, eyeHeight, rightEyeLocationX, rightEyeLocationY);
		nose = new HumanNose(noseWidth, noseHeight, noseLocationX, noseLocationY);
		mouth = new HumanMouth(mouthWidth, mothHeight, mouthLocationX, mouthLocationY);
	}

	@Override
	public void draw(Color color) {
		super.draw(color);
		leftEye.draw(Color.white);
		rightEye.draw(Color.white);
		nose.draw(Color.black);
		mouth.draw();
	}

	@Override
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		super.draw(minColorLimit, maxColorLimit);
		leftEye.draw(minColorLimit, maxColorLimit);
		rightEye.draw(minColorLimit, maxColorLimit);
		nose.draw(minColorLimit, maxColorLimit);
		mouth.draw(minColorLimit, maxColorLimit);
	}
}
