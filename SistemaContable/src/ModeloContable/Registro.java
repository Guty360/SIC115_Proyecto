/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloContable;

/**
 *
 * @author pc
 */
public class Registro {
    private Tipo tipo;
    private double valor;

    public Registro(Tipo tipo, double valor) {
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
