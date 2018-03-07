
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

public class RawRunner extends NeoEngine {
	private static final long serialVersionUID = 1L;

	boolean app = true;
	
	Point2D mouse = new Point2D.Float();
	
	@Override
	public void first(Graphics2D g) {
		setDelay(2);
		
		
		
	}

	@Override
	public void loop(Graphics2D g) {
		
	}

	@Override
	public void delay(Graphics2D g) {
		
	}

	@Override
	public void debug(Graphics2D g) {
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		mouse = e.getPoint();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	
}