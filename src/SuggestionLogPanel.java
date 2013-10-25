
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class SuggestionLogPanel extends JPanel {
	private JTextArea log;
	
	SuggestionLogPanel(){
		//We add a scrolling text area for
		//all previous suggestions and
		//their results
		log = new JTextArea(10, 40);
		log.setEditable(false);
		log.setWrapStyleWord(true);
		log.setLineWrap(true);
		add(log);
		setBorder(new TitledBorder (new EtchedBorder(), "Previous Suggestions"));	
	}

}
