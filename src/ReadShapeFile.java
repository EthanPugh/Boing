
/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;

public class ReadShapeFile {

	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * 
	 * @param in the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue<ClosedShape> readDataFile(Scanner in) {
		Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();

		while (in.hasNext()) {
			String name = in.next();
			String s = in.nextLine();
			if (name.equals("circle")) { // Run methods specific to each shape.
				shapeQueue.enqueue(readCircle(s));
			} else if (name.equals("oval")) {
				shapeQueue.enqueue(readOval(s));
			} else if (name.equals("rect")) {
				shapeQueue.enqueue(readRect(s));
			} else if (name.equals("square")) {
				shapeQueue.enqueue(readSquare(s));
			} else if (name.equals("semi-circle")) {
				shapeQueue.enqueue(readSemiCircle(s));
			}
		}

		return shapeQueue;
	}

	/**
	 * Method to read the file and return a queue of shapes from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue<ClosedShape> readDataFile(String filename) {
		File file = new File(filename);
		Scanner in = null;

		try {
			in = new Scanner(file);
		} catch (Exception FileNotFoundException) {
			System.out.println("The file " + file.getName() + " could not be found.");
			System.exit(0);
		}

		return ReadShapeFile.readDataFile(in);
	}

	/**
	 * Generates a Circle object based on values from the input file.
	 * 
	 * @param s The line of the file containing the specifications.
	 * @return Circle object based on input values.
	 */
	private static Circle readCircle(String s) {
		Scanner line = new Scanner(s);

		int x = line.nextInt();
		int y = line.nextInt();
		int vx = line.nextInt();
		int vy = line.nextInt();
		boolean isFilled = line.nextBoolean();
		int diameter = line.nextInt();
		Color colour = Color.rgb(line.nextInt(), line.nextInt(), line.nextInt());
		int insertionTime = line.nextInt();
		boolean willPulse = line.nextBoolean();
		line.close();

		return new Circle(insertionTime, x, y, vx, vy, diameter, colour, isFilled, willPulse);
	}

	/**
	 * Generates an Oval object based on values from the input file.
	 * 
	 * @param s The line of the file containing the specifications.
	 * @return Oval object based on input values.
	 */
	private static Oval readOval(String s) {
		Scanner line = new Scanner(s);

		int x = line.nextInt();
		int y = line.nextInt();
		int vx = line.nextInt();
		int vy = line.nextInt();
		boolean isFilled = line.nextBoolean();
		int width = line.nextInt();
		int height = line.nextInt();
		Color colour = Color.rgb(line.nextInt(), line.nextInt(), line.nextInt());
		int insertionTime = line.nextInt();
		boolean willPulse = line.nextBoolean();
		line.close();

		return new Oval(insertionTime, x, y, vx, vy, width, height, colour, isFilled, willPulse);
	}

	/**
	 * Generates a Rect (rectangle) object based on values from the input file.
	 * 
	 * @param s The line of the file containing the specifications.
	 * @return Rect object based on input values.
	 */
	private static Rect readRect(String s) {
		Scanner line = new Scanner(s);

		int x = line.nextInt();
		int y = line.nextInt();
		int vx = line.nextInt();
		int vy = line.nextInt();
		boolean isFilled = line.nextBoolean();
		int width = line.nextInt();
		int height = line.nextInt();
		Color colour = Color.rgb(line.nextInt(), line.nextInt(), line.nextInt());
		int insertionTime = line.nextInt();
		boolean willPulse = line.nextBoolean();
		line.close();

		return new Rect(insertionTime, x, y, vx, vy, width, height, colour, isFilled, willPulse);
	}

	/**
	 * Generates a Square object based on values from the input file.
	 * 
	 * @param s The line of the file containing the specifications.
	 * @return Square object based on input values.
	 */
	private static Square readSquare(String s) {
		Scanner line = new Scanner(s);

		int x = line.nextInt();
		int y = line.nextInt();
		int vx = line.nextInt();
		int vy = line.nextInt();
		boolean isFilled = line.nextBoolean();
		int side = line.nextInt();
		Color colour = Color.rgb(line.nextInt(), line.nextInt(), line.nextInt());
		int insertionTime = line.nextInt();
		boolean willPulse = line.nextBoolean();
		line.close();

		return new Square(insertionTime, x, y, vx, vy, side, colour, isFilled, willPulse);
	}

	/**
	 * Generates a SemiCircle object based on values from the input file.
	 * 
	 * @param s The line of the file containing the specifications.
	 * @return SemiCircle object based on input values.
	 */
	private static SemiCircle readSemiCircle(String s) {
		Scanner line = new Scanner(s);

		int x = line.nextInt();
		int y = line.nextInt();
		int vx = line.nextInt();
		int vy = line.nextInt();
		boolean isFilled = line.nextBoolean();
		int width = line.nextInt();
		int height = line.nextInt();
		Color colour = Color.rgb(line.nextInt(), line.nextInt(), line.nextInt());
		int insertionTime = line.nextInt();
		boolean willPulse = line.nextBoolean();
		line.close();

		return new SemiCircle(insertionTime, x, y, vx, vy, width, height, colour, isFilled, willPulse);
	}

}
