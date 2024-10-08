package drawingTool;

import java.awt.Color;

public class HumanEye extends OvalObject {
	private HumanPupil pupil; //composite

	public HumanEye (int width, int height, int locationX, int locationY) {
		super(width, height, locationX, locationY);
		int pupilWidth = width * 1/2;
		int pupilHeight = height * 1/2;
		int pupilLocationX = locationX + width() * 1/4;
		int pupilLocationY = locationY + height() * 1/4;
		pupil = new HumanPupil(pupilWidth, pupilHeight, pupilLocationX, pupilLocationY);
	}

	@Override
	public void draw(Color color) {
		super.draw(color);
		pupil.draw(Color.black);
	}

	@Override
	public void draw (int minColorLimit, int maxColorLimit) { //overloading
		super.draw(minColorLimit, maxColorLimit);
		pupil.draw(Color.black);
	}
}

