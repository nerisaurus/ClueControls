import java.awt.BorderLayout;

import javax.swing.JFrame;


public class ClueControlFrame extends JFrame{
	
	public ClueControlFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,300);
		ClueControlPanel controls = new ClueControlPanel();
		add(controls);
		//all of the actual panel logic is in ClueControlPanel
		//for greater portability once we actually want to move this
		//to the main Clue game.
	}

	public static void main(String[] args) {
		ClueControlFrame gui = new ClueControlFrame();	
		gui.setVisible(true);
		
	}

}

