
/**
 * Rect.java
 * 
 * @version 1.0
 * @author Ethan Pugh
 */

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Rect is a shape that can be drawn to the screen, either filled with colour or
 * opaque. Its position is determined by the upper left corner of the rectangle.
 * It may also pulse on a fixed interval.
 */
public class Rect extends ClosedShape {
	// The width and height of the rectangle.
	private int width, height;

	/**
	 * Creates a rectangle.
	 * 
	 * @param x         The display component's x position.
	 * @param y         The display component's y position.
	 * @param vx        The display component's x velocity.
	 * @param vy        The display component's y velocity.
	 * @param width     The width of the rectangle.
	 * @param height    The height of the rectangle.
	 * @param colour    The line colour or fill colour.
	 * @param isFilled  True if the rectangle is filled with colour, false if opaque.
	 * @param willPulse True if the shape will pulse on a fixed interval.
	 */
	public Rect(int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled,
			boolean willPulse) {
		super(insertionTime, x, y, vx, vy, colour, isFilled, willPulse);
		this.width = width;
		this.height = height;
	}

	/**
	 * Method to convert a rectangle to a string.
	 * 
	 * @return result The string describing the rectangle.
	 */
	public String toString() {
		String result = "This a rectangle\n";
		result += super.toString();
		result += "Its width is " + this.width + " and its height is " + this.height + "\n";
		return result;
	}

	/**
	 * Sets the width of the rectangle.
	 * 
	 * @param width The width of the rectangle.
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Sets the height of the rectangle.
	 * 
	 * @param height The height of the rectangle.
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Gets the width of the rectangle.
	 * 
	 * @return width The width of the rectangle.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Gets the height of the rectangle.
	 * 
	 * @return height The height of the rectangle.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Draw the rectangle on the screen.
	 * 
	 * @param g The graphics object of the scene component.
	 */
	public void draw(GraphicsContext g) {
		g.setFill(colour);
		g.setStroke(colour);
		if (isFilled) {
			g.fillRect(x, y, width, height);
		} else {
			g.strokeRect(x, y, width, height);
		}
	}
}
