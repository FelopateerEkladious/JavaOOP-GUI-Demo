package drawingTool;

import java.awt.Color;

public class LionFace {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	private LionEye leftEye; //composite
	private LionEye rightEye; //composite
	private LionEar leftEar; //composite
	private LionEar rightEar; //composite
	private LionSnout snout; //composite
	
	public LionFace(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
		int eyeWidth = width * 1/8;
		int eyeHeight = height * 1/4;
		int earWidth = width * 1/2;
		int earHeight = height * 1/2;
		int snoutWidth = width * 1/2;
		int snoutHeight = height * 1/2;
		int leftEyeLocationX = locationX + width * 1/4;
		int leftEyeLocationY = locationY + height * 1/8;
		int rightEyeLocationX = locationX + width * 5/8;
		int rightEyeLocationY = locationY + height * 1/8;
		int leftEarLocationX = locationX - width * 1/4;
		int leftEarLocationY = locationY - height * 1/8;
		int rightEarLocationX = locationX + width * 3/4;
		int rightEarLocationY = locationY - height * 1/8;
		int snoutLocationX = locationX + width * 1/4;
		int snoutLocationY = locationY + height * 1/2;
		leftEye = new LionEye(eyeWidth, eyeHeight, leftEyeLocationX, leftEyeLocationY);
		rightEye = new LionEye(eyeWidth, eyeHeight, rightEyeLocationX, rightEyeLocationY);
		leftEar = new LionEar(earWidth, earHeight, leftEarLocationX, leftEarLocationY);
		rightEar = new LionEar(earWidth, earHeight, rightEarLocationX, rightEarLocationY);
		snout = new LionSnout(snoutWidth, snoutHeight, snoutLocationX, snoutLocationY);
	}
	
	public int lionStartX() {
		return leftEar.locationX();
	}
	
	public int lionEndX() {
		return rightEar.locationX() + rightEar.width();
	}
	
	public int width() {
		return leftEar.width() * 1/2 + width + rightEar.width() * 1/2;
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.yellow);
		Drawing.pen().fillOval(locationX, locationY, width, height);
		leftEye.draw(Color.white);
		rightEye.draw(Color.white);
		leftEar.draw(Color.yellow);
		rightEar.draw(Color.yellow);
		snout.draw(Color.orange);
	}
	
	public void draw(int minColorLimit, int maxColorLimit) {
		int x = RandomNumber.between(minColorLimit, maxColorLimit);
		int y = RandomNumber.between(minColorLimit, maxColorLimit);
		int z = RandomNumber.between(minColorLimit, maxColorLimit);
		Drawing.pen().setColor(new Color(x, y, z));
		Drawing.pen().fillOval(locationX, locationY, width, height);
		leftEye.draw(minColorLimit, maxColorLimit);
		rightEye.draw(minColorLimit, maxColorLimit);
		leftEar.draw(minColorLimit, maxColorLimit);
		rightEar.draw(minColorLimit, maxColorLimit);
		snout.draw(minColorLimit, maxColorLimit);
	}
}
