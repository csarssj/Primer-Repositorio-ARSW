package edu.escuelaing.arem.ASE.linecounter;

import java.io.IOException;
import java.io.LineNumberReader;

/**
* Count the lines in files of type LOC
* 
* @author Cesar Gonzalez
*/
public class LOCLineCounter implements Counter {
	
	@Override
	public int countLines(LineNumberReader ln) {
		try {
			String line = null;
			int count = 0;
			while ((line = ln.readLine())!=null) {
				if (line.length() > 0) {	
					line =line.trim();
					if ( line.charAt(0) != '/' && line.charAt(0) != '*'){
						count++;
					}						
				}
			}
			return count;
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
		return 0;
	}

}

