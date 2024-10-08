package drawingTool;

public class LionTailBody {
	private int length;
	private int locationX; 
	private int locationY;
	
	public LionTailBody(int length, int locationX, int locationY) {
		this.length = length;
		this.locationX = locationX;
		this.locationY = locationY;
	}

	public int length() {
		return length;
	}
	
	public void draw() {
		Drawing.pen().drawLine(locationX, locationY - length, locationX + length, locationY);
	}
}
