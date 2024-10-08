package drawingTool;

import java.awt.Color;

public class BoatBody {
	private int width;
	private int height;
	private int locationX;
	private int locationY;

	public BoatBody(int width, int height, int locationX, int locationY) {
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

	public void draw() {
		int[] xPoints = {locationX,locationX+width,locationX+width/2,locationX+width*1/4};
		int[] yPoints = {locationY,locationY,locationY+height,locationY+height};
		Drawing.pen().setColor(Color.lightGray);
		Drawing.pen().fillPolygon(xPoints, yPoints, 4);
	}
}
