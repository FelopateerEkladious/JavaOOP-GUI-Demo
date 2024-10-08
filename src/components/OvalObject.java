package drawingTool;

import java.awt.Color;

public class OvalObject {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	
	public OvalObject(int width, int height, int locationX, int locationY) {
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
	
	public int locationX() {
		return locationX;
	}
	
	public int locationY() {
		return locationY;
	}
	
	public void draw(Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(locationX, locationY, width, height);
	}
	
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		int x = RandomNumber.between(minColorLimit, maxColorLimit);
		int y = RandomNumber.between(minColorLimit, maxColorLimit);
		int z = RandomNumber.between(minColorLimit, maxColorLimit);
		Drawing.pen().setColor(new Color(x, y, z));
		Drawing.pen().fillOval(locationX, locationY, width, height);
	}
}
