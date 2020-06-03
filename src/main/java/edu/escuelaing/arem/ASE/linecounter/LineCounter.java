package edu.escuelaing.arem.ASE.linecounter;

import java.io.* ;

/**
* Count the lines in files of type Physical or LOC
*
* @author Cesar Gonzalez
*/
public class LineCounter {
	public static void main (String [] arg){
		Counter counter;
		if (arg[0] == "phy") {
			File file = new File ("src/main/java/edu/escuelaing/arem/ASE/app/App.java"); 
			counter = new PHYLineCounter();
			System.out.println("El numero de lineas físicas que contiene el archivo son: "+counter.countLines(FReader.readFile(file,counter)));
		}
		else if (arg[0] == "loc") {
			counter = new LOCLineCounter();
			File file = new File ("src/main/java/edu/escuelaing/arem/ASE/app/App.java"); 
			System.out.println("El numero de lineas físicas que contiene el archivo son: "+counter.countLines(FReader.readFile(file,counter)));
		}
	}
}
