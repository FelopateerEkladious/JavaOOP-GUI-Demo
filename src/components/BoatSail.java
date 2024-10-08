package drawingTool;

import java.awt.Color;

public class BoatSail {
	private int width;
	private int height;
	private int locationX;
	private int locationY;

	public BoatSail(int width, int height, int locationX, int locationY) {
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

	public void draw () {
		int numberOfPoints = 3;
		int[] xPoints = {locationX, locationX + width, locationX};
		int[] yPoints = {locationY + height, locationY + height, locationY};
		Drawing.pen().setColor(Color.white);
		Drawing.pen().fillPolygon(xPoints, yPoints, numberOfPoints);
	}
}
