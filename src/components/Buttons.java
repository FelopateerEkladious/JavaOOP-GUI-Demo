package drawingTool;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons {
	private JButton lionsButton = new JButton("Lions");
	private JButton oneLionButton = new JButton("One Lion");
	private JButton humansButton = new JButton("Humans");
	private JButton oneHumanButton = new JButton("One Human");
	private JButton randomDaytimeButton = new JButton("Random Daytime");
	private JButton morningButton = new JButton("Morning");
	private JButton eveningButton = new JButton("Evening");
	private JButton nightButton = new JButton("Night");
	private JButton lionsAndHumansButton = new JButton("Lions And Humans");
	private JButton clearButton = new JButton("Clear");

	public void addActionListener(ActionListener listener) {
		lionsButton.addActionListener(listener);
		oneLionButton.addActionListener(listener);
		humansButton.addActionListener(listener);
		oneHumanButton.addActionListener(listener);
		randomDaytimeButton.addActionListener(listener);
		morningButton.addActionListener(listener);
		eveningButton.addActionListener(listener);
		nightButton.addActionListener(listener);
		lionsAndHumansButton.addActionListener(listener);
		clearButton.addActionListener(listener);
	}

	public void addButtonsToAPanel(JFrame frame) {
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(18, 1, 15, 20));

		menu.add(lionsButton);
		menu.add(oneLionButton);
		menu.add(humansButton);
		menu.add(oneHumanButton);
		menu.add(randomDaytimeButton);
		menu.add(morningButton);
		menu.add(eveningButton);
		menu.add(nightButton);
		menu.add(lionsAndHumansButton);
		menu.add(clearButton);


		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}

	public JButton getLionsButton() {
		return lionsButton;
	}

	public JButton getOneLionButton() {
		return oneLionButton;
	}

	public JButton getHumansButton() {
		return humansButton;
	}

	public JButton getOneHumanButton() {
		return oneHumanButton;
	}

	public JButton getRandomDaytimeButton() {
		return randomDaytimeButton;
	}
	
	public JButton getMorningButton() {
		return morningButton;
	}
	
	public JButton getEveningButton() {
		return eveningButton;
	}
	
	public JButton getNightButton() {
		return nightButton;
	}

	public JButton getLionsAndHumansButton() {
		return lionsAndHumansButton;
	}

	public JButton getClearButton() {
		return clearButton;
	}
}
