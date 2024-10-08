package drawingTool;

import java.awt.Color;

public class Cloud {
	private int width;
	private int height;
	private int locationX;
	private int locationY;

	public Cloud(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
	}
	
	public void draw () {
		Drawing.pen().setColor(Color.white);
		Drawing.pen().fillOval(locationX, locationY, width, height);
		Drawing.pen().fillOval(locationX + width/2, locationY, width, height);
		Drawing.pen().fillOval(locationX + width, locationY, width, height);
		Drawing.pen().fillOval(locationX, locationY+height/2, width, height);
		Drawing.pen().fillOval(locationX + width/2, locationY+height/2, width, height);
		Drawing.pen().fillOval(locationX + width, locationY+height/2, width, height);
	}
}
