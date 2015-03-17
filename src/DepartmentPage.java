
import javax.swing.JFrame;

public class DepartmentPage {

	public static void main(String[] args){
		new Store(1);
	}

	public DepartmentPage(int indentifier){
		JFrame frame = new JFrame("Store #" + indentifier);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DepartmentLayoutPanel panel = new DepartmentLayoutPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}
}