import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class ApplicationRunner extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		ApplicationRunner a = new ApplicationRunner();
		a.run();
	}
	
	@Override
	public void run() {
		JFrame j = new JFrame("Adventure Online");
		j.setSize(1200,1200);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RawRunner e = new RawRunner();
		e.app = true;
		j.add(e);
		e.init();
		j.setLayout( new BorderLayout() );
		j.getContentPane().add(e, BorderLayout.CENTER);
		j.setVisible(true);
	}
	
}
