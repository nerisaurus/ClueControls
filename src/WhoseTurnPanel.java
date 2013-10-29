import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class WhoseTurnPanel extends JPanel {
	private JTextArea currentPlayer;
	
	WhoseTurnPanel(){
		setLayout(new GridLayout(2, 1));
		setBorder(new TitledBorder (new EtchedBorder(), "Turn"));

		currentPlayer = new JTextArea(2, 10);
		currentPlayer.setEditable(false);
		currentPlayer.setWrapStyleWord(true);
		currentPlayer.setLineWrap(true);
		updateDisplay();
		add(currentPlayer);
		
		JButton nextPlayer = new JButton("End Turn");
		add(nextPlayer);
		
	}
	
	private void updateDisplay()
	{
		currentPlayer.setText(" ... ");
	}
}
