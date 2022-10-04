/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import ModeloContable.LibroMayor;
import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Escritor {
    private LibroMayor libroMayor;
    private Gson escritor;
    private String ruta;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    public Escritor(LibroMayor libroMayor,String ruta) {
        this.libroMayor = libroMayor;
        this.ruta = ruta;
        escritor = new Gson();
        
        try {
            fileWriter = new FileWriter(new File(ruta));
        } catch (IOException ex) {
            Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public LibroMayor escribir(){
        
        
        
        return null;
    }
    
    
    
    
    
}
