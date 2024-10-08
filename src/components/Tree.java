package drawingTool;

import java.awt.Color;

public class Tree {
	private TreeRoot treeRoot; //composite
	private TreeHead treeHead; //composite
	
	public Tree (int width, int height, int locationX, int locationY) {
		int treeRootWidth = width * 1/5;
		int treeRootHeight = height;
		int treeHeadWidth = width;
		int treeHeadHeight = height * 1/2;
		int treeRootLocationX = locationX;
		int treeRootLocationY = locationY;
		int treeHeadLocationX = locationX - treeRootWidth * 2;
		int treeHeadLocationY = locationY - treeHeadHeight;
		treeRoot = new TreeRoot (treeRootWidth, treeRootHeight, treeRootLocationX, treeRootLocationY);
		treeHead = new TreeHead (treeHeadWidth, treeHeadHeight, treeHeadLocationX, treeHeadLocationY);
	}
	
	public void draw() {
		treeRoot.draw();
		treeHead.draw(Color.magenta);
	}

}
