package edu.escuelaing.arem.ASE.linecounter;

import java.io.* ;

/**
* Cuenta las lineas que hay en un archivo ya sea si desea que se incluyan lineas documentadas o no.
*
* @author Cesar Gonzalez
*/
public class LineCounter {

	public static void main (String[] args){
		Counter counter;
		String type = args[0];
		File file = new File(args[1]);
		if (type.equals("phy")) {
			counter = new PHYLineCounter();
			System.out.println("El numero de lineas físicas que contiene el archivo son: "+counter.countLines(FReader.readFile(file,counter)));
		}
		else if (type.equals("loc")) {
			counter = new LOCLineCounter();
			System.out.println("El numero de lineas de codigo que contiene el archivo son: "+counter.countLines(FReader.readFile(file,counter)));
		}
	}
}