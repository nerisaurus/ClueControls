import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class WhoseTurnPanel extends JPanel {
	
	WhoseTurnPanel(){
		JButton nextPlayer = new JButton("Finished Turn");
		add(nextPlayer);
	}

}
