/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import ModeloContable.InformacionContable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;


/**
 *
 * @author pc
 * 
 */
public class Escritor {
    private String ruta;
    private InformacionContable contexto;
    private static Escritor escritor;
    
    private ObjectOutputStream objectOutputStream;
    private FileOutputStream fileOutputStream;
    
    
    private Escritor(){
    
    }
    
    public static Escritor getEscritor(){
        if(escritor==null) escritor = new Escritor();
        
        return escritor;
    }

    public String getRuta() {
        return ruta;
    }

    public Escritor setRuta(String ruta) throws FileNotFoundException{
        this.ruta = ruta;
        fileOutputStream = new FileOutputStream(new File(ruta));
        return this;
    }

    public InformacionContable getContexto() {
        return contexto;
    }

    public Escritor setContexto(InformacionContable contexto){
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
        try {
        objectOutputStream.writeObject(contexto);
        objectOutputStream.flush();
        objectOutputStream.close();  
        } catch (IOException e) {
            datosGuardadosCorrectamente = false;
        }
        return datosGuardadosCorrectamente;
    }
    
    

    
    
    
    
}
