package drawingTool;

import java.awt.Color;

public class LionBody {
	private LionTrunk trunk; //composite
	private LionLeg leftFrontLeg; //composite
	private LionLeg rightFrontLeg; //composite
	private LionLeg leftBackLeg; //composite
	private LionLeg rightBackLeg; //composite
	private LionTail tail; //composite
	
	public LionBody(int width, int height, int locationX, int locationY) {
		int trunkWidth = width;
		int trunkHeight = height;
		int frontLegWidth = width * 1/4;
		int frontLegHeight = height * 1/2;
		int backLegWidth =  width * 1/4;
		int backLegHeight = height * 1/4;
		int tailWidth = width;
		int tailHeight = height * 1/10;
		int trunkLocationX = locationX;
		int trunkLocationY = locationY;
		int tailLocationX = locationX + trunkWidth * 1/2;
		int tailLocationY = locationY + trunkHeight;
		int leftFrontlegLocationX = locationX;
		int leftFrontlegLocationY = locationY + trunkHeight * 1/2;
		int rightFrontlegLocationX = locationX + trunkWidth * 7/8;
		int rightFrontlegLocationY = locationY + trunkHeight * 1/2;
		int leftBacklegLocationX = locationX + trunkWidth * 1/4;
		int leftBacklegLocationY = locationY + trunkHeight * 3/4;
		int rightBacklegLocationX = locationX + trunkWidth * 5/8;
		int rightBacklegLocationY = locationY + trunkHeight * 3/4;
		trunk = new LionTrunk(trunkWidth, trunkHeight, trunkLocationX, trunkLocationY);
		leftFrontLeg = new LionLeg(frontLegWidth, frontLegHeight, leftFrontlegLocationX, leftFrontlegLocationY);
		rightFrontLeg = new LionLeg(frontLegWidth, frontLegHeight, rightFrontlegLocationX, rightFrontlegLocationY);
		leftBackLeg = new LionLeg(backLegWidth, backLegHeight, leftBacklegLocationX, leftBacklegLocationY);
		rightBackLeg = new LionLeg(backLegWidth, backLegHeight, rightBacklegLocationX, rightBacklegLocationY);
		tail = new LionTail(tailWidth, tailHeight, tailLocationX, tailLocationY);
	}
	
	public int lionEndY() {
		return trunk.locationY() + trunk.height();
	}
	
	public int height() {
		return trunk.height();
	}
	
	public void draw() {
		tail.draw();
		trunk.draw(Color.yellow);
		leftFrontLeg.draw();
		rightFrontLeg.draw();
		leftBackLeg.draw();
		rightBackLeg.draw();
	}
	
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
	
		tail.draw(minColorLimit, maxColorLimit);
		trunk.draw(minColorLimit, maxColorLimit);
		leftFrontLeg.draw(minColorLimit, maxColorLimit);
		rightFrontLeg.draw(minColorLimit, maxColorLimit);
		leftBackLeg.draw(minColorLimit, maxColorLimit);
		rightBackLeg.draw(minColorLimit, maxColorLimit);
	}
}
