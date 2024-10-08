package drawingTool;

import java.awt.Color;

public class Beach {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	private Tree tree1; //aggregate
	private Tree tree2; //aggregate

	public Beach(int width, int height, int locationX, int locationY) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
		int treeWidth = width * 1/10;
		int treeHeight = height * 1/2;
		int tree1LocationX = locationX + 70;
		int tree1LocationY = locationY + 50;
		int tree2LocationX = locationX + 180;
		int tree2LocationY = locationY + 120;
		tree1 = new Tree (treeWidth, treeHeight, tree1LocationX, tree1LocationY);
		tree2 = new Tree (treeWidth, treeHeight, tree2LocationX, tree2LocationY);
	}

	public void draw() {
		Drawing.pen().setColor(Color.green);
		Drawing.pen().fillRect(locationX, locationY, width, height);
		tree1.draw();
		tree2.draw();
	}

}
