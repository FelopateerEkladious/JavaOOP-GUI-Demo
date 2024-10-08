package drawingTool;

public class HumanLeg {
	private HumanForeLeg foreLeg; //composite
	private HumanShoes shoes; //aggregate

	public HumanLeg(int width, int height, int locationX, int locationY) {
		int foreLegWidth = width * 1/2;
		int foreLegHeight = height * 3/4;
		int shoesWidth = width;
		int shoesHeight = height * 1/4;
		int foreLegLocationX = locationX;
		int foreLegLocationY = locationY;
		int shoesLocationX = locationX - foreLegWidth * 1/2;
		int shoesLocationY = locationY + foreLegHeight;
		foreLeg = new HumanForeLeg(foreLegWidth, foreLegHeight, foreLegLocationX, foreLegLocationY);
		shoes = new HumanShoes(shoesWidth, shoesHeight, shoesLocationX, shoesLocationY);
	}

	public int height() {
		return shoes.height() + foreLeg.height(); 
	}

	public void draw() {
		foreLeg.draw();
		shoes.draw();
	}

	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		foreLeg.draw(minColorLimit, maxColorLimit);
		shoes.draw(minColorLimit, maxColorLimit);
	}
}
