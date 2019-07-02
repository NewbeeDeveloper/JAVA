/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardoecheverria
 */
public class FileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        FileInputStream in = null;
        
        int c;
        
        String cadena = "";

        try {
            in = new FileInputStream("Ruta de tu archivo");
            while ((c = in.read()) != -1) {
                cadena = cadena + (char)c;
            }
        } catch (IOException ex) {
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        }     
        System.out.println(cadena);  
    }
}
