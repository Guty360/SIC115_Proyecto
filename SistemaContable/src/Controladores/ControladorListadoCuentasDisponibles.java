/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import ModeloContable.Cuenta;
import java.util.List;
import static java.util.stream.Collectors.toList;
import javax.swing.DefaultListModel;

/**
 *
 * @author pc
 */
public class ControladorListadoCuentasDisponibles extends DefaultListModel<String>{
    List<Cuenta> listadoCuentas;
    
    public ControladorListadoCuentasDisponibles(List<Cuenta> cuentas){
        this.listadoCuentas = cuentas;
        this.addAll(nombresCuentas(listadoCuentas));
        
        
    }
    
    public final List<String> nombresCuentas(List<Cuenta> cuentas){
        return cuentas.stream().map( c -> c.getNombre()).collect(toList());
    }

    public List<Cuenta> getListadoCuentas() {
        return listadoCuentas;
    }

    public void setListadoCuentas(List<Cuenta> listadoCuentas) {
        this.listadoCuentas = listadoCuentas;
    }
    
    
}
