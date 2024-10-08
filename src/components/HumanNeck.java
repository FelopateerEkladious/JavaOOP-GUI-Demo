package drawingTool;

import java.awt.Color;

public class HumanNeck {
	private int width;
	private int height;
	private int locationX;
	private int locationY;

	public HumanNeck(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
	}

	public int height() {
		return height;
	}

	public void draw() {
		Drawing.pen().setColor(Color.yellow);
		Drawing.pen().fillRect(locationX, locationY, width, height);
	}

	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		int x = RandomNumber.between(minColorLimit, maxColorLimit);
		int y = RandomNumber.between(minColorLimit, maxColorLimit);
		int z = RandomNumber.between(minColorLimit, maxColorLimit);

		Drawing.pen().setColor(new Color(x, y, z));
		Drawing.pen().fillRect(locationX, locationY, width, height);
	}
}