package drawingTool;

import java.awt.Point;

public class Lion implements LocatedRectangle{
	private LionHead head; //composite
	private LionBody body; //composite
	private Point address;
	
	public Lion(int width, int height, int locationX, int locationY) {
		int headWidth = width;
		int bodyWidth = width * 2/3;
		int headHeight = height * 1/3;
		int bodyHeight = height * 2/3;
		int headLocationX = locationX;
		int headLocationY = locationY;
		int bodyLocationX = locationX + headWidth * 3/16;
		int bodyLocationY = locationY + headHeight * 2/3;
		head = new LionHead(headWidth, headHeight, headLocationX, headLocationY);
		body = new LionBody(bodyWidth, bodyHeight, bodyLocationX, bodyLocationY);
		address = new Point(head.lionStartX(), head.lionStartY());
	}
	
	public Point address() {
		return address;
	}
	
	public int width() {
		return head.lionWidth();
	}
	
	public int height() {
		return head.height() * 2/3 + body.height();
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
