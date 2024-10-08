package drawingTool;

public class Boat{
	private BoatBody boatBody; //composite
	private BoatPole boatPole; //composite
	private BoatSail boatSail; //composite

	public Boat(int width, int height, int locationX, int locationY) {
		int boatBodyWidth = width;
		int boatBodyHeight = height;
		int boatPoleWidth = width * 1/10;
		int boatPoleHeight = height;
		int boatSailWidth = width * 1/2;
		int boatSailHeight = height * 2;
		int boatBodyLocationX = locationX;
		int boatBodyLocationY = locationY;
		int boatPoleLocationX = locationX + boatBodyWidth * 1/2;
		int boatPoleLocationY = locationY - boatPoleHeight;
		int boatSailLocationX = locationX + boatBodyWidth * 1/2 - boatSailWidth * 1/4;
		int boatSailLocationY = locationY - boatBodyHeight - 2 * boatPoleHeight;


		boatBody = new BoatBody(boatBodyWidth, boatBodyHeight, boatBodyLocationX, boatBodyLocationY);
		boatPole = new BoatPole(boatPoleWidth, boatPoleHeight, boatPoleLocationX, boatPoleLocationY);
		boatSail = new BoatSail(boatSailWidth, boatSailHeight, boatSailLocationX, boatSailLocationY);
	}

	public int width() {
		return boatBody.width();
	}

	public int height() {
		return boatBody.height() + boatPole.height() + boatSail.height();
	}

	public void draw() {
		boatBody.draw();
		boatPole.draw();
		boatSail.draw();
	}


}
