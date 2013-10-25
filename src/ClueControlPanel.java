import java.awt.BorderLayout;

import javax.swing.JPanel;

public class ClueControlPanel extends JPanel {
	public ClueControlPanel(){
		SuggestionAccusationPanel suggestions = new SuggestionAccusationPanel();
		add(suggestions, BorderLayout.CENTER); //so it's given the room it needs
		
		WhoseTurnPanel turn = new WhoseTurnPanel();
		add(turn, BorderLayout.WEST);
	}
	
}
