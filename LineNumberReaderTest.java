/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
 
public class LineNumberReaderTest {
    public static void main(String[] args) {
        int totalLines = new LineNumberReaderTest().countLineNumber();
        System.out.println("Total Number Lines " + totalLines);
    }
 
    public int countLineNumber() {
        int lines = 0;
 
        try {
 
            File file = new File("E:/yago1.nt");
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            lineNumberReader.skip(Long.MAX_VALUE);
            lines = lineNumberReader.getLineNumber();
            lineNumberReader.close();
 
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Occurred" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException Occurred" + e.getMessage());
        }
 
        return lines;
    }
}