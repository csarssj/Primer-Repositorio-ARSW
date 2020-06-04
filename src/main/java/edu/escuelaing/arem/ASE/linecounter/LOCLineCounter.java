package edu.escuelaing.arem.ASE.linecounter;

import java.io.IOException;
import java.io.LineNumberReader;

/**
* Cuenta las lineas de un archivo excluyendo lineas comentadas y lineas en blanco.
* 
* @author Cesar Gonzalez
*/
public class LOCLineCounter implements Counter {
	
    /**
     * Cuenta las lineas de un archivo tipo "loc"
     *
     * @param ln texto del archivo a contar
     * @return lineas del archivo
     */
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

