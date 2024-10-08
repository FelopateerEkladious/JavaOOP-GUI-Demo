package drawingTool;

import java.awt.Color;

public class LionMouth {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	private LionTongue tongue; //composite
	
	public LionMouth(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
		int tongueWidth = width * 1/2;
		int tongueHeight = height * 1/4;
		int tongueLocationX = locationX - width * 1/2 + width * 1/4;
		int tongueLocationY = locationY + height * 3/4;
		tongue = new LionTongue(tongueWidth, tongueHeight, tongueLocationX, tongueLocationY);
	}
	
	public void draw() {
		int numberOfPoints = 3;
		int xTopPoint = locationX;
		int yTopPoint = locationY;
		int xRightPoint = locationX + width * 1/2;
		int yRightPoint = locationY + height;
		int xLeftPoint = locationX - width * 1/2;
		int yLeftPoint = locationY + height;
		int[] xCoordinates = {xTopPoint, xRightPoint, xLeftPoint};
		int[] yCoordinates = {yTopPoint, yRightPoint, yLeftPoint};
		Drawing.pen().setColor(Color.white);
		Drawing.pen().fillPolygon(xCoordinates, yCoordinates, numberOfPoints);
		tongue.draw();
	}
	
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		int numberOfPoints = 3;
		int xTopPoint = locationX;
		int yTopPoint = locationY;
		int xRightPoint = locationX + width * 1/2;
		int yRightPoint = locationY + height;
		int xLeftPoint = locationX - width * 1/2;
		int yLeftPoint = locationY + height;
		int[] xCoordinates = {xTopPoint, xRightPoint, xLeftPoint};
		int[] yCoordinates = {yTopPoint, yRightPoint, yLeftPoint};
		int x = RandomNumber.between(minColorLimit, maxColorLimit);
		int y = RandomNumber.between(minColorLimit, maxColorLimit);
		int z = RandomNumber.between(minColorLimit, maxColorLimit);
		Drawing.pen().setColor(new Color(x, y, z));
		Drawing.pen().fillPolygon(xCoordinates, yCoordinates, numberOfPoints);
		tongue.draw();
	}
}
