/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloContable;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Registro extends Serializacion{
    private LocalDate fechaRegistro;
    private Cuenta cuenta;
    private Tipo tipo;
    private double valor;

    public Registro(){}

    /***
     * 
     * @param fechaRegistro
     * @param cuenta
     * @param tipo
     * @param valor 
     */
    public Registro(LocalDate fechaRegistro, Cuenta cuenta, Tipo tipo, double valor) {
        this.fechaRegistro = fechaRegistro;
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registro{");
        sb.append("tipo=").append(tipo);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
