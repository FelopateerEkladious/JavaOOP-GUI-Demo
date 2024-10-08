package drawingTool;

import java.awt.Color;

public class HumanBody {
	private HumanNeck neck; //composite
	private HumanTrunk trunk; //composite
	private HumanArm leftArm; //composite
	private HumanArm rightArm; //composite
	private HumanLeg leftLeg; //composite
	private HumanLeg rightLeg; //composite

	public HumanBody(int width, int height, int locationX, int locationY) {
		int trunkWidth = width * 3/4;
		int trunkHeight = height * 1/2;
		int trunkLocationX = locationX + width * 1/8;
		int trunkLocationY = locationY + height * 1/8;
		int neckWidth = width * 1/4;
		int neckHeight = height * 1/8;
		int neckLocationX = locationX + width * 3/8;
		int neckloactionY = locationY;
		int armWidth = width * 1/8;
		int armHeight = height * 1/4;
		int leftArmlocationX = locationX + width * 1/16;
		int leftArmLocationY = locationY + height * 1/4;
		int rightArmlocationX = locationX + width * 1/8 + width * 3/4 - width * 1/16;
		int rightArmLocationY = locationY + height * 1/4;
		int legWidth = width * 1/8;
		int legHeight = height * 3/8;
		int leftLegLocationX = locationX + width * 1/8 + width * 1/8;
		int leftLegLocationY = locationY + height * 1/8 + height * 3/8;
		int rightLegLocationX = locationX + width * 3/4 - width * 1/8;
		int rightLegLocationY = locationY + height * 1/8 + height * 3/8;
		neck = new HumanNeck(neckWidth, neckHeight, neckLocationX, neckloactionY);
		trunk = new HumanTrunk(trunkWidth, trunkHeight, trunkLocationX, trunkLocationY);
		leftArm = new HumanArm(armWidth, armHeight, leftArmlocationX, leftArmLocationY);
		rightArm = new HumanArm(armWidth, armHeight, rightArmlocationX, rightArmLocationY);
		leftLeg = new HumanLeg(legWidth, legHeight, leftLegLocationX, leftLegLocationY);
		rightLeg = new HumanLeg(legWidth, legHeight, rightLegLocationX, rightLegLocationY);
	}

	public int height() {
		return leftLeg.height() + trunk.height() + neck.height();
	}

	public void draw() {
		neck.draw();
		leftLeg.draw();
		rightLeg.draw();
		trunk.draw(Color.orange);
		leftArm.draw();
		rightArm.draw();
	}

	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		neck.draw(minColorLimit, maxColorLimit);
		leftLeg.draw(minColorLimit, maxColorLimit);
		rightLeg.draw(minColorLimit, maxColorLimit);
		trunk.draw(minColorLimit, maxColorLimit);
		leftArm.draw(minColorLimit, maxColorLimit);
		rightArm.draw(minColorLimit, maxColorLimit);
	}
}
