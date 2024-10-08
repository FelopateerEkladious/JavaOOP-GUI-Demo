package drawingTool;

public class LionWhisker {
	private int width;
	private int locationX;
	private int locationY;
	
	public LionWhisker(int width, int locationX, int locationY) {
		this.width = width;
		this.locationX = locationX;
		this.locationY = locationY;
	}
	
	public void draw() {
		Drawing.pen().drawLine(locationX, locationY, locationX + width, locationY);
	}
}
