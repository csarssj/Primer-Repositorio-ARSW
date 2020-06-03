package edu.escuelaing.arem.ASE.linecounter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
* File reads a file from the hard drive
*
* @author Cesar Gonzalez
*/
public class FReader {
	public static  LineNumberReader readFile(File file, Counter c) {
		LineNumberReader  ln = null;
		try {
			FileReader f = new FileReader (file);
			ln = new LineNumberReader(f);
			return ln;
			
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
		return ln;
		
	}

}
