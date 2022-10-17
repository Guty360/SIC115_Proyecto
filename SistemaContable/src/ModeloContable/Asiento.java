/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloContable;

import java.util.Map;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pc
 */
public class Asiento extends Serializacion{
    
    //Cada lista interna representa un asiento
    private List<List<Registro>> asientos;
    private boolean esAjuste;
    private boolean incluyeIVA;
    private String descripcion;
    private Date fechaRegistro;
    private int numRegistros;



    public boolean isEsAjuste() {
        return esAjuste;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
    public void setEsAjuste(boolean esAjuste) {
        this.esAjuste = esAjuste;
    }

    public boolean isIncluyeIVA() {
        return incluyeIVA;
    }

    public void setIncluyeIVA(boolean incluyeIVA) {
        this.incluyeIVA = incluyeIVA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asiento{");
        sb.append(", esAjuste=").append(esAjuste);
        sb.append(", incluyeIVA=").append(incluyeIVA);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    
}
