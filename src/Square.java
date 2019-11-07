
/**
 * Square.java
 * 
 * @version 1.0
 * @author Ethan Pugh
 */

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Square is a shape that can be drawn to the screen, either filled with colour
 * or opaque. Its position is determined by the upper left corner of the square.
 * It may also pulse on a fixed interval.
 */
public class Square extends ClosedShape {
	// The side length of the square.
	private int side;

	/**
	 * Creates a square.
	 * 
	 * @param x         The display component's x position.
	 * @param y         The display component's y position.
	 * @param vx        The display component's x velocity.
	 * @param vy        The display component's y velocity.
	 * @param side      The side length of the square.
	 * @param colour    The line colour or fill colour.
	 * @param isFilled  True if the square is filled with colour, false if opaque.
	 * @param willPulse True if the shape will pulse on a fixed interval.
	 */
	public Square(int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled,
			boolean willPulse) {
		super(insertionTime, x, y, vx, vy, colour, isFilled, willPulse);
		this.side = side;
	}

	/**
	 * Method to convert a square to a string.
	 * 
	 * @return result The string describing the square.
	 */
	public String toString() {
		String result = "This a square\n";
		result += super.toString();
		result += "Its side length is " + this.side + "\n";
		return result;
	}
	
	/**
	 * Sets the side length of the square.
	 * 
	 * @param side The side length of the square.
	 */
	public void setSide(int side) {
		this.side = side;
	}

	/**
	 * Gets the side length of the square.
	 * 
	 * @return side The side length of the square.
	 */
	public int getSide() {
		return side;
	}

	/**
	 * Gets the width (side length) of the square.
	 * 
	 * @return side The side length of the square.
	 */
	public int getWidth() {
		return side;
	}

	/**
	 * Gets the height (side length) of the square.
	 * 
	 * @return side The side length of the square.
	 */
	public int getHeight() {
		return side;
	}

	/**
	 * Draw the square on the screen.
	 * 
	 * @param g The graphics object of the scene component.
	 */
	public void draw(GraphicsContext g) {
		g.setFill(colour);
		g.setStroke(colour);
		if (isFilled) {
			g.fillRect(x, y, side, side);
		} else {
			g.strokeRect(x, y, side, side);
		}
	}

}
