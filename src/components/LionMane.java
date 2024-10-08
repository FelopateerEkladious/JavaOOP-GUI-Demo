package drawingTool;

import java.awt.Color;

public class LionMane {
	private int width;
	private int height;
	private int locationX;
	private int locationY;

	public LionMane(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
	}

	public int width() {
		return width;
	}

	public int height() {
		return height;
	}

	public int lionStartY() {
		return locationY;
	}

	public void draw() {
		int numberOfPoints = 5;
		int[] xCoordinates1 = {locationX + width * 1/2, locationX + width, locationX + width * 3/4, locationX + width * 1/4, locationX};
		int[] yCoordinates1 = {locationY, locationY + height * 1/2, locationY + height, locationY + height, locationY + height * 1/2};
		int[] xCoordinates2 = {locationX + width * 1/4, locationX + width * 3/4, locationX + width, locationX + width * 1/2, locationX};
		int[] yCoordinates2 = {locationY + height * 1/8, locationY + height * 1/8, locationY + height * 5/8, locationY + height * 9/8, locationY + height * 5/8};
		Drawing.pen().setColor(Color.orange);
		Drawing.pen().fillPolygon(xCoordinates1, yCoordinates1, numberOfPoints);
		Drawing.pen().fillPolygon(xCoordinates2, yCoordinates2, numberOfPoints);
	}

	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		int numberOfPoints = 5;
		int[] xCoordinates1 = {locationX + width * 1/2, locationX + width, locationX + width * 3/4, locationX + width * 1/4, locationX};
		int[] yCoordinates1 = {locationY, locationY + height * 1/2, locationY + height, locationY + height, locationY + height * 1/2};
		int[] xCoordinates2 = {locationX + width * 1/4, locationX + width * 3/4, locationX + width, locationX + width * 1/2, locationX};
		int[] yCoordinates2 = {locationY + height * 1/8, locationY + height * 1/8, locationY + height * 5/8, locationY + height * 9/8, locationY + height * 5/8};
		int x = RandomNumber.between(minColorLimit, maxColorLimit);
		int y = RandomNumber.between(minColorLimit, maxColorLimit);
		int z = RandomNumber.between(minColorLimit, maxColorLimit);
		Drawing.pen().setColor(new Color(x, y, z));
		Drawing.pen().fillPolygon(xCoordinates1, yCoordinates1, numberOfPoints);
		Drawing.pen().fillPolygon(xCoordinates2, yCoordinates2, numberOfPoints);
	}
}
