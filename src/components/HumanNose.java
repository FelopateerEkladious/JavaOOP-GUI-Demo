package drawingTool;

import java.awt.Color;

public class HumanNose extends OvalObject {
	private HumanNostril leftNostril; //composite
	private HumanNostril rightNostril; //composite

	public HumanNose (int width, int height, int locationX, int locationY) {
		super(width, height, locationX, locationY);
		int nostrilWidth = width * 1/4;
		int nostrilHeight = height * 1/4;
		int leftNostrilLocationX = locationX;
		int leftNostrilLocationY = locationY + height() * 1/4;
		int rightNostrilLocationX = locationX + width() * 3/4;
		int rightNostrilLocationY = locationY + height() * 1/4;
		leftNostril = new HumanNostril(nostrilWidth, nostrilHeight, leftNostrilLocationX, leftNostrilLocationY);
		rightNostril = new HumanNostril(nostrilWidth, nostrilHeight, rightNostrilLocationX, rightNostrilLocationY);
	}

	@Override
	public void draw(Color color) {
		super.draw(color);
		leftNostril.draw(Color.white);
		rightNostril.draw(Color.white);
	}

	@Override
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		super.draw(minColorLimit, maxColorLimit);
		leftNostril.draw(Color.white);
		rightNostril.draw(Color.white);
	}
}
