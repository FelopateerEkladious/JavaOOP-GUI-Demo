package drawingTool;

import java.awt.Color;
import java.util.ArrayList;

public class LionSnout extends OvalObject {
	private LionMouth mouth; //composite
	private LionNose nose; //composite
	private ArrayList<LionWhisker> whiskers; //composite 

	public LionSnout (int width, int height, int locationX, int locationY) {
		super(width, height, locationX, locationY);
		int mouthWidth = width * 1/2;
		int mouthHeight = height * 1/2;
		int noseWidth = width * 1/2;
		int noseHeight = height * 1/4;
		int whiskerWidth = width * 1/2;
		int noseXLocation = locationX + width * 1/4;
		int noseYLocation = locationY;
		int mouthXLocation = locationX + width * 1/2;
		int mouthYLocation = locationY + height * 1/4;
		int leftWhiskerLocationX = locationX - width * 1/4;
		int firstTopWhiskerLocationY = locationY + height * 3/8;
		int verticalDistanceOfWhiskers = height * 1/8;
		int horizontalDistanceOfWhiskers = width;
		int numberOfWhiskers = 8;
		whiskers = new ArrayList<LionWhisker>();
		mouth = new LionMouth(mouthWidth, mouthHeight, mouthXLocation, mouthYLocation);
		nose = new LionNose(noseWidth, noseHeight, noseXLocation, noseYLocation);
		for (int i = 0; i < numberOfWhiskers * 1/2; i++) {
			LionWhisker leftWhisker = new LionWhisker(whiskerWidth, leftWhiskerLocationX, firstTopWhiskerLocationY +  verticalDistanceOfWhiskers * i);
			LionWhisker rightWhisker = new LionWhisker(whiskerWidth, leftWhiskerLocationX + horizontalDistanceOfWhiskers, firstTopWhiskerLocationY +  verticalDistanceOfWhiskers * i);
			whiskers.add(leftWhisker);
			whiskers.add(rightWhisker);
		}
	}

	@Override
	public void draw(Color color) {
		super.draw(color);
		mouth.draw();
		nose.draw(Color.darkGray);
		for (LionWhisker whisker : whiskers) {
			whisker.draw();
		}
	}

	@Override
	public void draw(int minColorLimit, int maxColorLimit) { //overlaoding
		super.draw(minColorLimit, maxColorLimit);
		mouth.draw(minColorLimit, maxColorLimit);
		nose.draw(minColorLimit, maxColorLimit);
		for (LionWhisker whisker : whiskers) {
			whisker.draw();
		}
	}
}
