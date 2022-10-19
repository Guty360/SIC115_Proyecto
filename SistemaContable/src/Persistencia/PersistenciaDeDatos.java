/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import ModeloContable.InformacionContable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pc
 * 
 */
public class PersistenciaDeDatos {
    private static PersistenciaDeDatos persistenciaDeDatos = new PersistenciaDeDatos();
    
    //Almacenamiento de la informacion contable
    private ObjectOutputStream objectOutputStream;
    private FileOutputStream fileOutputStream;
    
    //Recuperacion de la informacion contable
    private ObjectInputStream objectInputStream;
    private FileInputStream fileInputStream;
    
    private File archivo;
    private URI ruta;

   
    private PersistenciaDeDatos(){
      
        try {
            ruta = new URI(getClass().getResource("/Persistencia/Datos/Persistencia.txt").toString());
            System.out.println(ruta.getPath());
        } catch (URISyntaxException ex) {
            Logger.getLogger(PersistenciaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        archivo = new File(ruta);
        System.out.println(archivo.canRead());
        System.err.println(archivo.canWrite());

    }
    
    public static PersistenciaDeDatos getPersistenciaDeDatos(){
        return persistenciaDeDatos;
    }
    
   
    
    public void guardarDatos(InformacionContable informacionContable) throws FileNotFoundException, IOException{
        
        fileOutputStream = new FileOutputStream(archivo);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(informacionContable);
        objectOutputStream.close();
        objectOutputStream.flush();
        
    }
    
    public InformacionContable recuperarDatos() throws FileNotFoundException, IOException, ClassNotFoundException{
        fileInputStream = new FileInputStream(archivo);
        objectInputStream = new ObjectInputStream(fileInputStream);
        
        InformacionContable info = (InformacionContable) objectInputStream.readObject();
        
        return info;
    }
    
    
    
}
