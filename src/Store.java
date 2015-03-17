
import javax.swing.JFrame;

public class Store {

	public static void main(String[] args){
		new Store(1);
	}

	public Store(int indentifier){
		JFrame frame = new JFrame("Store #"+indentifier);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StoreLayoutPanel panel = new StoreLayoutPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}
}