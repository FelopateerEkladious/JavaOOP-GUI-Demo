package drawingTool;

import java.awt.Color;

public class HumanHead {
	private HumanFace face; //composite
	private HumanHat hat; //aggregate

	public HumanHead(int width, int height, int locationX, int locationY) {
		int hatWidth = width;
		int hatHeight = height * 1/3;
		int faceWidth = width * 3/4;
		int faceHeight = height * 2/3;
		int hairLocationX =locationX;
		int hairLocationY = locationY;
		int faceLocationX = locationX + width * 1/8;
		int faceLocationY = locationY + height * 1/12;
		face = new HumanFace(faceWidth, faceHeight, faceLocationX, faceLocationY);
		hat = new HumanHat(hatWidth, hatHeight, hairLocationX, hairLocationY);
	}

	public int width() {
		return hat.width();
	}

	public int height() {
		return hat.height() + face.height();
	}

	public void draw() {
		hat.draw(Color.black);
		face.draw(Color.yellow);
	}

	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		hat.draw(minColorLimit, maxColorLimit);
		face.draw(minColorLimit, maxColorLimit);
	}
}
