/**
 * Provides a test application window with a panel.
 * 
 * @author Björn Gottfried
 * 
 * @version 1.0
 */

package drawingTool;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame implements ActionListener {
	private DrawingArea drawing;
	private Buttons buttons = new Buttons();

	public DrawingTool(String title) {
		super(title);

		setLayout(new BorderLayout());

		constructButtonMenu();
		constructDrawingArea();

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);

		setVisible(true);
	}

	private void constructButtonMenu() {
		buttons.addButtonsToAPanel(this);
		buttons.addActionListener(this);
	}

	private void constructDrawingArea() {
		drawing = new DrawingArea();
		add(drawing, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons.getLionsButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().setLions();
		} else if (e.getSource() == buttons.getOneLionButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().setOneLion();
		} else if (e.getSource() == buttons.getHumansButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().setHumans();
		} else if (e.getSource() == buttons.getOneHumanButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().setOneHuman();
		} else if (e.getSource() == buttons.getRandomDaytimeButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().setRandomDaytime();
		} else if (e.getSource() == buttons.getMorningButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().generateMorningState();
		} else if (e.getSource() == buttons.getEveningButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().generateEveningState();
		} else if (e.getSource() == buttons.getNightButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().generateNightState();
		} else if (e.getSource() == buttons.getLionsAndHumansButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().setLionsAndHumans();
		} else if (e.getSource() == buttons.getClearButton()) {
			tidyUpDrawingArea();
			drawing.getHoliday().clear();
		}
	}

	private void tidyUpDrawingArea() {
		drawing.removeAll();
		drawing.revalidate();
		drawing.repaint();		
	}

	public static void main(String[] args) {
		new DrawingTool("Draw a Holiday");
	}
}
