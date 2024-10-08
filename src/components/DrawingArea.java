/**
 * Provides a panel which can be used for drawing.
 * 
 * @author Björn Gottfried
 * @version 1.0
 */

package drawingTool;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private Holiday mallorca = new Holiday(this);
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		Drawing.set(pen);
		mallorca.draw();
	}

	public Holiday getHoliday() {
		return mallorca;
	}
}