package drawingTool;

import java.awt.Color;

public class LionEye extends OvalObject {
	private LionPupil pupil; //composite
	
	public LionEye (int width, int height, int locationX, int locationY) {
		super(width, height, locationX, locationY);
		int pupilWidth = width * 1/2;
		int pupilHeight = height * 1/2;
		int pupilLocationX = locationX + width() * 1/4;
		int pupilLocationY = locationY + height() * 1/4;
		pupil = new LionPupil(pupilWidth, pupilHeight, pupilLocationX, pupilLocationY);
	}
	
	@Override
	public void draw(Color color) {
		super.draw(color);
		pupil.draw(Color.black);
	}
	
	@Override
	public void draw(int minColorLimit, int maxColorLimit) {
		super.draw(minColorLimit, maxColorLimit);
		pupil.draw(Color.black);
	}
}
