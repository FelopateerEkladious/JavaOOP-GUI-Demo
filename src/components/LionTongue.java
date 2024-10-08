package drawingTool;

import java.awt.Color;

public class LionTongue {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	
	public LionTongue(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.red);
		Drawing.pen().fillRect(locationX, locationY, width, height);
	}
}
