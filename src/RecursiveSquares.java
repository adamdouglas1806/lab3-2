import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;

public class RecursiveSquares extends Frame {

	public RecursiveSquares() {
		setSize(300, 300);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}

	private void drawSquare(Graphics2D g, int xPosition, int yPosition, int length, int n) {
		/* Check to see if the base case has been reached */
		
		/* Otherwise, the recursive case
		 * 
		 * Step 1: draw the square with:
		 * 
		 *      g.draw(new Rectangle2D.Double(xPosition, yPosition, length, length));
		 *      
		 * Step 2: make recursive calls to draw 4 smaller squares next time.
		 * */
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// recursive pattern of order n
		int n = 4;
		drawSquare(g2, 100, 100, 100, n);
	}

	public static void main(String[] args) {
		RecursiveSquares squaresGUI = new RecursiveSquares();
		squaresGUI.setVisible(true);
	}
}
