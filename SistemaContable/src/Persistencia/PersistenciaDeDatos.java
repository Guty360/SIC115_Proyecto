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
import java.util.List;


/**
 *
 * @author pc
 * 
 */
public class PersistenciaDeDatos {
    private InformacionContable contexto;
    private static PersistenciaDeDatos persistenciaDeDatos;
    
    //Almacenamiento de la informacion contable
    private ObjectOutputStream objectOutputStream;
    private FileOutputStream fileOutputStream;
    
    //Recuperacion de la informacion contable
    private ObjectInputStream objectInputStream;
    private FileInputStream fileInputStream;
    
    private File archivo;
    private URI ruta;

   
    private PersistenciaDeDatos(){}
    
    public static PersistenciaDeDatos getPersistenciaDeDatos(){
        return persistenciaDeDatos;
    }
    
    
}
