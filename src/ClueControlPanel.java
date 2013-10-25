import java.awt.BorderLayout;

import javax.swing.JPanel;

public class ClueControlPanel extends JPanel {
	public ClueControlPanel(){
		SuggestionLogPanel log = new SuggestionLogPanel();
		add(log, BorderLayout.CENTER); //so it's given the room it needs
		
		WhoseTurnPanel turn = new WhoseTurnPanel();
		add(turn, BorderLayout.WEST);
	}
	
}
