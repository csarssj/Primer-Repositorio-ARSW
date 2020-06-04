package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.Test;

import edu.escuelaing.arem.ASE.linecounter.Counter;
import edu.escuelaing.arem.ASE.linecounter.FReader;
import edu.escuelaing.arem.ASE.linecounter.LOCLineCounter;
import edu.escuelaing.arem.ASE.linecounter.LineCounter;
import edu.escuelaing.arem.ASE.linecounter.PHYLineCounter;

public class CounterTest {
	 Counter counter;
	
    @Test
    public void deberiaLeerelArchivo(){
        try{
            String[] args = {"phy","src/main/java/edu/escuelaing/arem/ASE/app/App.java"};
            LineCounter.main(args);
            assertTrue(true);
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void deberiaLeerelArchivo2(){
        try{
            String[] args = {"phy","src/main/java/edu/escuelaing/arem/ASE/linecounter/LineCounter.java"};
            LineCounter.main(args);
            assertTrue(true);
        }catch(Exception e){
            fail();
        }
    }
    @Test
    public void deberiaLeerelArchivo3(){
        try{
            String[] args = {"loc","src/main/java/edu/escuelaing/arem/ASE/app/App.java"};
            LineCounter.main(args);
            assertTrue(true);
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void deberiaLeerelArchivo4(){
        try{
            String[] args = {"loc","src/main/java/edu/escuelaing/arem/ASE/linecounter/LineCounter.java"};
            LineCounter.main(args);
            assertTrue(true);
        }catch(Exception e){
            fail();
        }
    }
    @Test
    public void deberiaContarLineasDelArchivoPHY(){
            String[] args = {"phy","src/main/java/edu/escuelaing/arem/ASE/linecounter/LineCounter.java"};
            File file = new File (args[1]);
            counter = new PHYLineCounter();
			counter.countLines(FReader.readFile(file,counter));
			assertEquals(counter.countLines(FReader.readFile(file,counter)),25);

    }
    @Test
    public void deberiaContarLineasDelArchivoPHY2(){
            String[] args = {"phy","src/main/java/edu/escuelaing/arem/ASE/app/App.java"};
            File file = new File (args[1]);
            counter = new PHYLineCounter();
			counter.countLines(FReader.readFile(file,counter));
			assertEquals(counter.countLines(FReader.readFile(file,counter)),13);

    }
    @Test
    public void deberiaContarLineasDelArchivoLOC(){
            String[] args = {"loc","src/main/java/edu/escuelaing/arem/ASE/app/App.java"};
            File file = new File (args[1]);
            counter = new LOCLineCounter();
			assertEquals(counter.countLines(FReader.readFile(file,counter)),8);

    }
    @Test
    public void deberiaContarLineasDelArchivoLOC2(){
            String[] args = {"loc","src/main/java/edu/escuelaing/arem/ASE/linecounter/LineCounter.java"};
            File file = new File (args[1]);
            counter = new LOCLineCounter();
            assertEquals(counter.countLines(FReader.readFile(file,counter)),17);

    }
    @Test
    public void noDeberiaContarLineasDelArchivoPHY(){
            String[] args = {"phy","src/main/java/edu/escuelaing/arem/ASE/linecounter/LineCounter.java"};
            File file = new File (args[1]);
            counter = new PHYLineCounter();
            boolean var = (counter.countLines(FReader.readFile(file,counter)) == 19);
            assertFalse(var);

    }
    @Test
    public void noDeberiaContarLineasDelArchivoPHY2(){
            String[] args = {"phy","src/main/java/edu/escuelaing/arem/ASE/app/App.java"};
            File file = new File (args[1]);
            counter = new PHYLineCounter();
            boolean var = (counter.countLines(FReader.readFile(file,counter)) == 19);
            assertFalse(var);

    }
    @Test
    public void noDeberiaContarLineasDelArchivoLOC(){
            String[] args = {"loc","src/main/java/edu/escuelaing/arem/ASE/app/App.java"};
            File file = new File (args[1]);
            counter = new LOCLineCounter();
            boolean var = (counter.countLines(FReader.readFile(file,counter)) == 19);
            assertFalse(var);
    }
    @Test
    public void noDeberiaContarLineasDelArchivoLOC2(){
            String[] args = {"loc","src/main/java/edu/escuelaing/arem/ASE/linecounter/LineCounter.java"};
            File file = new File (args[1]);
            counter = new LOCLineCounter();
            boolean var = (counter.countLines(FReader.readFile(file,counter)) == 19);
            assertFalse(var);

    }
}
