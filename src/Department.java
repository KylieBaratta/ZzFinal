import javax.swing.JFrame;

public class Department {
	
	public Inventory inventory;

	public Department(String name){
		JFrame frame = new JFrame(name+"Department");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DepartmentLayoutPanel panel = new DepartmentLayoutPanel(this);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setLocation(615, 0);
		frame.setVisible(true);
	}
}
