package drawingTool;

import java.awt.Point;

public class Human implements LocatedRectangle{
	private HumanBody body; //composite
	private HumanHead head; //composite
	private Point address;

	public Human(int width, int height, int locationX, int locationY) {
		int headWidth = width;
		int bodyWidth = width * 2/3;
		int headHeight = height * 1/3;
		int bodyHeight = height * 2/3;
		int headLocationX = locationX;
		int headLocationY = locationY;
		int bodyLocationX = locationX + headWidth * 3/16;
		int bodyLocationY = locationY + headHeight * 2/3;
		address = new Point(headLocationX, headLocationY); 
		head = new HumanHead(headWidth, headHeight, headLocationX, headLocationY);
		body = new HumanBody(bodyWidth, bodyHeight, bodyLocationX, bodyLocationY);
	}

	public Point address() {
		return address;
	}

	public int width() {
		return head.width();
	}

	public int height() {
		return body.height() + head.height();
	}

	public void draw() {
		body.draw();
		head.draw();
	}

	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		body.draw(minColorLimit, maxColorLimit);
		head.draw(minColorLimit, maxColorLimit);
	}
}
