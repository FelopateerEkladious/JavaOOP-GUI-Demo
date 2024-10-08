package drawingTool;

import java.awt.Color;

public class LionFeet {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	private LionPaw firstPaw; //composite
	private LionPaw secondPaw; //composite
	private LionPaw thirdPaw; //composite
	private LionPaw fourthPaw; //composite
	
	public LionFeet(int width, int height, int locationX, int locationY) {
		int pawWidth = width * 1/4;
		int pawHeight = height * 1/4;
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
		int firstPawLocationX = locationX;
		int secondPawLocationX = locationX + width * 1/4;
		int thirdPawLocationX = locationX + width * 1/2;
		int fourthPawLocationX = locationX + width * 3/4;
		int pawLocationY = locationY + height * 3/4;
		firstPaw = new LionPaw(pawWidth, pawHeight, firstPawLocationX, pawLocationY);
		secondPaw = new LionPaw(pawWidth, pawHeight, secondPawLocationX, pawLocationY);
		thirdPaw = new LionPaw(pawWidth, pawHeight, thirdPawLocationX, pawLocationY);
		fourthPaw = new LionPaw(pawWidth, pawHeight, fourthPawLocationX, pawLocationY);
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.orange);
		Drawing.pen().fillRoundRect(locationX, locationY, width, height, width * 1/2, height * 1/4);
		firstPaw.draw(Color.white);
		secondPaw.draw(Color.white);
		thirdPaw.draw(Color.white);
		fourthPaw.draw(Color.white);
	}
	
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		int x = RandomNumber.between(minColorLimit, maxColorLimit);
		int y = RandomNumber.between(minColorLimit, maxColorLimit);
		int z = RandomNumber.between(minColorLimit, maxColorLimit);
		Drawing.pen().setColor(new Color(x, y, z));
		Drawing.pen().fillRoundRect(locationX, locationY, width, height, width * 1/2, height * 1/4);
		firstPaw.draw(Color.white);
		secondPaw.draw(Color.white);
		thirdPaw.draw(Color.white);
		fourthPaw.draw(Color.white);
	}
}
