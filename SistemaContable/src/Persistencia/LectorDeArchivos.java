/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;
import com.google.gson.Gson;
/**
 *
 * @author pc
 */
public class LectorDeArchivos {
    private String ruta;
    private Gson lector;

    public LectorDeArchivos(String ruta, Gson lector) {
        this.ruta = ruta;
        this.lector = lector;
    }
    
 
}
