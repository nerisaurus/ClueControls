import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ClueControlFrame extends JFrame{
	
	public ClueControlFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,300);			
		SuggestionAccusationPanel suggestions = new SuggestionAccusationPanel();
		add(suggestions, BorderLayout.CENTER); //so it's given the room it needs
		WhoseTurnPanel turn = new WhoseTurnPanel();
		add(turn, BorderLayout.WEST);
		DiePanel coolDicePanel = new DiePanel();
		add(coolDicePanel, BorderLayout.EAST);
	}

	public static void main(String[] args) {
		ClueControlFrame gui = new ClueControlFrame();	
		gui.setVisible(true);
		
	}

}

