package drawingTool;

import java.awt.Color;

public class LionEar extends OvalObject {
	private LionInnerEar innerEar; //composite
	
	public LionEar (int width, int height, int locationX, int locationY) {
		super(width, height, locationX, locationY);
		int innerEarWidth = width * 1/2;
		int innerEarHeight = height * 1/2;
		int innerEarLocationX = locationX + width() * 1/4;
		int innerEarLocationY = locationY + height() * 1 /4;
		innerEar = new LionInnerEar(innerEarWidth, innerEarHeight, innerEarLocationX, innerEarLocationY);
	}
	
	@Override
	public void draw(Color color) {
		super.draw(color);
		innerEar.draw(Color.orange);
	}
	
	@Override
	public void draw(int minColorLimit, int maxColorLimit) {
		super.draw(minColorLimit, maxColorLimit);
		innerEar.draw(Color.orange);
	}
}
