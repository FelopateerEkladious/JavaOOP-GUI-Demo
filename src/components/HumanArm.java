package drawingTool;

import java.awt.Color;

public class HumanArm {
	private HumanForeArm foreArm; //composite
	private HumanHand hand; //composite

	public HumanArm(int width, int height, int locationX, int locationY) {
		int foreArmWidth = width * 3/4;
		int foreArmHeight = height * 3/4;
		int handWidth = width;
		int handHeight = height * 1/4;
		int foreArmLocationX = locationX + width * 1/8;
		int foreArmLocationY = locationY;
		int handLocationX = locationX;
		int handLocationY = locationY + height * 3/4;
		foreArm = new HumanForeArm(foreArmWidth, foreArmHeight, foreArmLocationX, foreArmLocationY);
		hand = new HumanHand(handWidth, handHeight, handLocationX, handLocationY);
	}

	public void draw() {
		foreArm.draw();
		hand.draw(Color.black);

	}

	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		foreArm.draw(minColorLimit, maxColorLimit);
		hand.draw(minColorLimit, maxColorLimit);
	}
}
