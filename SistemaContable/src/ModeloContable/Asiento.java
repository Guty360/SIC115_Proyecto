/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloContable;

import java.util.Map;

/**
 *
 * @author pc
 */
public class Asiento extends Serializacion{
    private Map<Integer,Registro> registros;
    private boolean esAjuste;
    private boolean incluyeIVA;
    private String descripcion;

    public Asiento(Map<Integer, Registro> registros, boolean esAjuste, boolean incluyeIVA, String descripcion) {
        this.registros = registros;
        this.esAjuste = esAjuste;
        this.incluyeIVA = incluyeIVA;
        this.descripcion = descripcion;
    }

    public Map<Integer, Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(Map<Integer, Registro> registros) {
        this.registros = registros;
    }

    public boolean isEsAjuste() {
        return esAjuste;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asiento{");
        sb.append("registros=").append(registros);
        sb.append(", esAjuste=").append(esAjuste);
        sb.append(", incluyeIVA=").append(incluyeIVA);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    
}
