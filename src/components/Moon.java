package drawingTool;

import java.awt.Color;

public class Moon {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	
	public Moon(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
	}
	public Moon() {
		
	}
	
	public void draw() {
		Color darkBlue = new Color(0,0,153);
		Drawing.pen().setColor(Color.white);
		Drawing.pen().fillOval(locationX, locationY, width * 2/3, height);
		Drawing.pen().setColor(darkBlue);
		Drawing.pen().fillOval(locationX + width * 1/4, locationY, width * 2/3, height);
	}
}
