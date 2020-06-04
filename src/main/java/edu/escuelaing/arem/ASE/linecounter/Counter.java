package edu.escuelaing.arem.ASE.linecounter;

 

import java.io.LineNumberReader;

/**
* Interfaz para contar las lineas de un archivo 
*
* @author Cesar Gonzalez
*/
public interface  Counter {
	
	public abstract int countLines(LineNumberReader ln );
	 

}