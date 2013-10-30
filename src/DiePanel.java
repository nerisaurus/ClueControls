import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class DiePanel extends JPanel {
	DiePanel() { 	
		setBorder(new TitledBorder (new EtchedBorder(), "Roll"));
	    ImageIcon dieFace = new ImageIcon("two.png"); 
	    JLabel dieFrame = new JLabel(); 
	    dieFrame.setIcon(dieFace); 
	    add(dieFrame, BorderLayout.CENTER);
	}
}
