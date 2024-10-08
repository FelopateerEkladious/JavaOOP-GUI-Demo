package drawingTool;

import java.awt.Color;

public class BoatPole {
	private int width;
	private int height;
	private int locationX;
	private int locationY;

	public BoatPole(int width, int height, int locationX, int locationY) {
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
		Drawing.pen().setColor(Color.yellow);
		Drawing.pen().fillRect(locationX, locationY, width, height);
	}
}
