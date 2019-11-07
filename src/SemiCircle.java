
/**
 * SemiCircle.java
 * 
 * @version 1.0
 * @author Ethan Pugh
 */

import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.canvas.GraphicsContext;

/**
 * SemiCircle is a shape that can be drawn to the screen, either filled with
 * colour or opaque. Its position is determined by the upper left corner of the
 * bounding rectangle. It may also pulse on a fixed interval.
 */
public class SemiCircle extends ClosedShape {
	// The width and height of the semi circle.
	private int width, height;

	/**
	 * Creates a semi circle.
	 * 
	 * @param x         The display component's x position.
	 * @param y         The display component's y position.
	 * @param vx        The display component's x velocity.
	 * @param vy        The display component's y velocity.
	 * @param width     The width of the semi circle.
	 * @param height    The adjusted height of the semi circle.
	 * @param colour    The line colour or fill colour.
	 * @param isFilled  True if the semi circle is filled with colour, false if
	 *                  opaque.
	 * @param willPulse True if the shape will pulse on a fixed interval.
	 */
	public SemiCircle(int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour,
			boolean isFilled, boolean willPulse) {
		super(insertionTime, x, y, vx, vy, colour, isFilled, willPulse);
		this.width = width;
		this.height = height / 2; // Adjusts height so it doesn't act like a circle.
	}

	/**
	 * Method to convert a semi circle to a string.
	 * 
	 * @return result The string describing the semi circle.
	 */
	public String toString() {
		String result = "This is semi-circle\n";
		result += super.toString();
		result += "Its width is " + this.width + " and its height is " + this.height + "\n";
		return result;
	}

	/**
	 * Sets the width of the semi circle.
	 * 
	 * @param width The width of the semi circle.
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Sets the height of the semi circle.
	 * 
	 * @param height The height of the semi circle.
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Gets the width of the semi circle.
	 * 
	 * @return width The width of the semi circle.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Gets the height of the semi circle.
	 * 
	 * @return height The height of the semi circle.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Draw the semi circle on the screen. The height here is doubled in both cases
	 * so that the bottom half of the 'circle' that gets drawn is ignored, giving
	 * the shape the true hitbox of a semi circle.
	 * 
	 * @param g The graphics object of the scene component.
	 */
	public void draw(GraphicsContext g) {
		g.setFill(colour);
		g.setStroke(colour);
		if (isFilled) {
			g.strokeArc(x, y, width, height * 2, 0, 180, ArcType.ROUND);
		} else {
			g.fillArc(x, y, width, height * 2, 0, 180, ArcType.ROUND);
		}
	}
}
