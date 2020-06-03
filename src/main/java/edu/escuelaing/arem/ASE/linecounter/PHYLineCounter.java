package edu.escuelaing.arem.ASE.linecounter;

import java.io.IOException;
import java.io.LineNumberReader;


/**
* Count the lines in files of type Physical
* 
* @author Cesar Gonzalez
*/
public class PHYLineCounter implements Counter{

	@Override
	public int countLines(LineNumberReader ln) {
		try {
			String line = null;
			int count = 0;
			while ((line = ln.readLine())!=null) {
				count++;
			}
			return count;
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
		return 0;
	}
}
