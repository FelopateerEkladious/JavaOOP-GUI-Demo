package drawingTool;

import java.awt.Color;

public class Sea {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	private Boat boat1; //aggregate
	private Boat boat2; //aggregate

	public Sea(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
		int boatWidth = width * 1/5;
		int boatHeight = height * 1/5;
		int boat1LocationX = locationX + 30;
		int boat1LocationY = locationY + 100;
		int boat2LocationX = locationX + 920;
		int boat2LocationY = locationY + 70;
		boat1 = new Boat(boatWidth, boatHeight, boat1LocationX, boat1LocationY);
		boat2 = new Boat(boatWidth, boatHeight, boat2LocationX, boat2LocationY);
	}
	
	public int width() {
		return width;
	}
	public int height() {
		return height;
	}
	
	public void draw () {
		Drawing.pen().setColor(Color.blue);
		Drawing.pen().fillRect(locationX, locationY, width, height);
		boat1.draw();
		boat2.draw();
	}
}
