/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloContable;

import java.util.List;

/**
 *
 * @author pc
 */
public class LibroMayor {
   List<Cuenta> cuentas;
   List<Asiento> ajustes;

   public LibroMayor(){}
   
   
    public LibroMayor(List<Cuenta> cuentas, List<Asiento> ajustes) {
        this.cuentas = cuentas;
        this.ajustes = ajustes;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public List<Asiento> getAjustes() {
        return ajustes;
    }

    public void setAjustes(List<Asiento> ajustes) {
        this.ajustes = ajustes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibroMayor{");
        sb.append("cuentas=").append(cuentas);
        sb.append(", ajustes=").append(ajustes);
        sb.append('}');
        return sb.toString();
    }
   
   
   
}
