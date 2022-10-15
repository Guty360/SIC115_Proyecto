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
import java.util.List;


/**
 *
 * @author pc
 * 
 */
public class PersistenciaDeDatos {
    private String ruta;
    private InformacionContable contexto;
    private static PersistenciaDeDatos persistenciaDeDatoss;
    
    //Almacenamiento de la informacion contable
    private ObjectOutputStream objectOutputStream;
    private FileOutputStream fileOutputStream;
    
    //Recuperacion de la informacion contable
    private ObjectInputStream objectInputStream;
    private FileInputStream fileInputStream;
    
    private PersistenciaDeDatos(){
    
    }
    
    public static PersistenciaDeDatos getPersistenciaDeDatoss(){
        if(persistenciaDeDatoss==null) persistenciaDeDatoss = new PersistenciaDeDatos();
        
        return persistenciaDeDatoss;
    }

    public String getRuta() {
        return ruta;
    }

    public PersistenciaDeDatos setRuta(String ruta) throws FileNotFoundException{
        this.ruta = ruta;
        fileOutputStream = new FileOutputStream(new File(ruta));
        return this;
    }

    public InformacionContable getContexto() {
        return contexto;
    }

    public PersistenciaDeDatos setContexto(InformacionContable contexto){
        this.contexto = contexto;
        
        try {
          objectOutputStream = new ObjectOutputStream(this.fileOutputStream);  
        } catch (IOException e) {
            
        }
        
        return this;
    }
    
    /**
    * @return Devuelve verdadero si los datos se guardaron correctamente 
    */
    public boolean guardarDatos(){
        boolean datosGuardadosCorrectamente = true;
        if(contextoNoVacio()){
            try {
                objectOutputStream.writeObject(contexto);
                objectOutputStream.flush();
                objectOutputStream.close();  
            } catch (IOException e) {
            datosGuardadosCorrectamente = false;
            }
            
        }else{
            datosGuardadosCorrectamente = false;
        }

        return datosGuardadosCorrectamente;
    }
    
    public InformacionContable recuperarInformacionContable() throws FileNotFoundException,IOException,ClassNotFoundException{
        
       
        fileInputStream = new FileInputStream(new File(ruta));
        objectInputStream = new ObjectInputStream(fileInputStream);
            
        contexto = (InformacionContable)objectInputStream.readObject();
            
        return contexto;
    }
    
    public boolean contextoNoVacio(){
        return !(contexto == null);
    }

    
    
    
    
}
