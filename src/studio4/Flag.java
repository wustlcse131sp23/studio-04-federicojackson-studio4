package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(0.3, 0.8, 1, 0.15);
		StdDraw.setPenColor(235,216,52);
		StdDraw.filledRectangle(0.3, 0.5, 1, 0.15);
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0.3, 0.2, 1, 0.15);
		StdDraw.setPenColor(200,10,110);
		double [] x= {0.4, 0.5, 0.6, 0.5, 0.2, 0.43, 0.1};
		double [] y= {0.6, 0.7, 0.6, 0.5, 0.45, 0.7, 0.8};
		StdDraw.filledPolygon(x, y);
	}
}