import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class SuggestionAccusationPanel extends JPanel {
	SuggestionAccusationPanel(){
		setLayout(new BorderLayout());

		SuggestionLogPanel log = new SuggestionLogPanel();
		add(log, BorderLayout.CENTER);
		JButton makeAccusation = new JButton("MAKE AN ACCUSATION!");
		add(makeAccusation, BorderLayout.SOUTH);
	}

}
