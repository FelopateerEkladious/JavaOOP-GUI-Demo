package drawingTool;

import java.awt.Color;

public class LionTail {
	private LionTailBody tailBody; //composite
	private LionTailTuft tailTuft; //composite
	
	public LionTail(int width, int height, int locationX, int locationY) {
		int tailBodyLength = width * 3/4;
		int tailTuftWidth = width * 1/4;
		int tailTuftHeight = height;
		int tailTuftLocationX = locationX + tailBodyLength;
		int tailTuftLocationY = locationY - tailTuftHeight * 1/2;
		int tailBodyLocationX = locationX;
		int tailBodyLocationY = locationY;
		tailBody = new LionTailBody(tailBodyLength, tailBodyLocationX, tailBodyLocationY);
		tailTuft = new LionTailTuft(tailTuftWidth, tailTuftHeight, tailTuftLocationX, tailTuftLocationY);
	}
	
	public void draw() {
		tailBody.draw();
		tailTuft.draw(Color.orange);
	}
	
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		int x = RandomNumber.between(minColorLimit, maxColorLimit);
		int y = RandomNumber.between(minColorLimit, maxColorLimit);
		int z = RandomNumber.between(minColorLimit, maxColorLimit);
		tailBody.draw();
		tailTuft.draw(new Color(x, y, z));
	}
}
