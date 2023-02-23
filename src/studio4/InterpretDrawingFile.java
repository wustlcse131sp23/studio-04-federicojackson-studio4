package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		boolean fill = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfwidth = in.nextDouble();
		double halfheight = in.nextDouble();
		StdDraw.setPenColor(R,G,B);
		if (fill=true) {
		StdDraw.filledRectangle(x, y, halfwidth, halfheight);
		}
		else {
		StdDraw.rectangle(x, y, halfwidth, halfheight);
		}
	}
	}
