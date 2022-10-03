/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author pc
 */
public class PruebaSe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Juan","Montano");
        String ruta = "C:/Users/pc/OneDrive/Escritorio/prueba.txt";
        
        try{
        FileOutputStream fos = new FileOutputStream(ruta);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(p);
        os.flush();
        os.close();
            
        FileInputStream fis = new FileInputStream(ruta);
        ObjectInputStream is = new ObjectInputStream(fis);
        Persona a =(Persona)is.readObject();
        System.out.println(a.nombre);
        
        }
        catch(Exception e){
            
        }
    }
    
}
