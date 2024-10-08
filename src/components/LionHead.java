package drawingTool;

public class LionHead {
	private LionMane mane; //aggregate
	private LionFace face; //composite
	
	public LionHead(int width, int height, int locationX, int locationY) {
		int maneWidth = width;
		int maneHeight = height;
		int faceWidth = width * 3/4;
		int faceHeight = height * 5/8;
		int maneLocationX = locationX;
		int maneLocationY = locationY;
		int faceLocationX = locationX + maneWidth * 1/8;
		int faceLocationY = locationY + maneHeight * 1/4;
		mane = new LionMane(maneWidth, maneHeight, maneLocationX, maneLocationY);///////////////
		face = new LionFace(faceWidth, faceHeight, faceLocationX, faceLocationY);///////////////
	}
	
	public int width() {
		return mane.width();
	}
	
	public int height() {
		return mane.height();
	}
	
	public int lionStartX() {
		return face.lionStartX();
	}
	
	public int lionEndX() {
		return face.lionEndX();
	}
	
	public int lionStartY() {
		return mane.lionStartY();
	}
	
	public int lionWidth() {
		return face.width();
	}
	
	public void draw() {
		mane.draw();
		face.draw();
	}
	
	public void draw(int minColorLimit, int maxColorLimit) { //overloading
		mane.draw(minColorLimit, maxColorLimit);
		face.draw(minColorLimit, maxColorLimit);
	}
}
