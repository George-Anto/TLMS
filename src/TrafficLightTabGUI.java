import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TrafficLightTabGUI {
	
	private JFrame frame;
	private JPanel panel;
	private JButton btnSortType, btnSortId, btnShowDetails, btnShowTrafficLight, btnBack;
	private JList trafficLightList; 
	private JScrollPane scrollPane;
	
	public TrafficLightTabGUI() {
		
		frame = new JFrame();
		panel = new JPanel();
		btnSortType = new JButton("Sort by Type");
		btnSortId = new JButton("Sort by Id");
		btnShowDetails = new JButton("Show Details"); /*Να το βαζαμε μονο στο ShowTrafficLightGUI; (για να μπορεις να πας στο ShowDetails μονο εφοσον εισαι στο ShowTrafficLight*/
		btnShowTrafficLight = new JButton("Show Traffic Light");
		btnBack = new JButton("Back to Start Menu");
		trafficLightList = new JList(); /*Καναμε λιστα με το σκεπτικο οτι θα γεμισουμε με ολες τις εγγραφες του Registry και θα φαινονται 
ολα τα φαναρια συνεχως, ομως δεν μπορουμε να τα βαλουμε σαν ολοκληρα αντικειμενα(??) γιατι θα ηταν καλυτερο να βαζαμε καποια βασικα attributes
να εμφανιζονται ωστε να εχουν νοημα και τα υπολοιπα gui*/
		scrollPane = new JScrollPane(trafficLightList);/*το βαλαμε για να εμφανιζονται σε περιορισμενο χωρο και να κανει scroll (ο χρηστης)
για να δει τα φαναρια(αν ειναι οντως πολλα)*/
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//κανονας για να εμφανιζει μπαρα 
		
		panel.add(scrollPane);
		panel.add(btnSortType);
		panel.add(btnSortId);
		panel.add(btnShowDetails);
		panel.add(btnShowTrafficLight);
		panel.add(btnBack);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setSize(800,550);
		frame.setTitle("Traffic Light Managment System - Traffic Light Tab");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}