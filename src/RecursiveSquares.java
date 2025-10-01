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
		
		if (n==0) {
			return;
		}
		//The if statement is the base case that ensures there will not be infinite recursion.
		
		/* Otherwise, the recursive case
		 * 
		 * Step 1: draw the square with:
		 * 
		 *      g.draw(new Rectangle2D.Double(xPosition, yPosition, length, length));
		 *      
		 * Step 2: make recursive calls to draw 4 smaller squares next time.
		 * */
		
		g.draw(new Rectangle2D.Double(xPosition, yPosition, length, length));
		//g.draw(...) will draw the base square.
		
		
		drawSquare(g, xPosition-(length/4), yPosition-(length/4), length/2, n-1);
		//This line of code will draw the smaller square at the top left corner of the larger square.
		drawSquare(g, xPosition+(3*length/4), yPosition-(length/4), length/2, n-1);
		//This line of code will draw the smaller square at the top right corner of the larger square.
		drawSquare(g, xPosition-(length/4), yPosition+(3*length/4), length/2, n-1);
		//This line of code will draw the smaller square at the bottom left corner of the larger square.
		drawSquare(g, xPosition+(3*length/4), yPosition+(3*length/4), length/2, n-1);
		//This line of code will draw the smaller square at the bottom right corner of the larger square.
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// recursive pattern of order n
		int n = 2;
		drawSquare(g2, 100, 100, 100, n);
	}

	public static void main(String[] args) {
		RecursiveSquares squaresGUI = new RecursiveSquares();
		squaresGUI.setVisible(true);
	}
}
