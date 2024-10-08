package drawingTool;

public class LionLeg {
	private LionForeLeg foreLeg; //composite
	private LionFeet feet; //composite
	
	public LionLeg(int width, int height, int locationX, int locationY) {
		int foreLegWidth = width * 1/2;
		int foreLegHeight = height * 3/4;
		int feetWidth = width;
		int feetHeight = height * 1/4;
		int foreLegLocationX = locationX;
		int foreLegLocationY = locationY;
		int feetLocationX = locationX - foreLegWidth * 1/2;
		int feetLocationY = locationY + foreLegHeight;
		foreLeg = new LionForeLeg(foreLegWidth, foreLegHeight, foreLegLocationX, foreLegLocationY);
		feet = new LionFeet(feetWidth, feetHeight, feetLocationX, feetLocationY);
	}
	
	public void draw() {
		foreLeg.draw();
		feet.draw();
	}
	
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		foreLeg.draw(minColorLimit, maxColorLimit);
		feet.draw(minColorLimit, maxColorLimit);
	}
}
