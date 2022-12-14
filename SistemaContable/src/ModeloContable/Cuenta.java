/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloContable;

/**
 *
 * @author pc
 */
public class Cuenta extends Serializacion{
    private int codCuenta;
    private String nombre;
    private double totalDebe;
    private double totalHaber;
    private double saldo;
    private Tipo naturaleza;

    public Cuenta(int codCuenta, String nombre, double totalDebe, double totalHaber, double saldo, Tipo naturaleza) {
        this.codCuenta = codCuenta;
        this.nombre = nombre;
        this.totalDebe = totalDebe;
        this.totalHaber = totalHaber;
        this.saldo = saldo;
        this.naturaleza = naturaleza;
    }

    public int getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(int codCuenta) {
        this.codCuenta = codCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalDebe() {
        return totalDebe;
    }

    public void setTotalDebe(double totalDebe) {
        this.totalDebe = totalDebe;
    }

    public double getTotalHaber() {
        return totalHaber;
    }

    public void setTotalHaber(double totalHaber) {
        this.totalHaber = totalHaber;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Tipo getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(Tipo naturaleza) {
        this.naturaleza = naturaleza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("codCuenta=").append(codCuenta);
        sb.append(", nombre=").append(nombre);
        sb.append(", totalDebe=").append(totalDebe);
        sb.append(", totalHaber=").append(totalHaber);
        sb.append(", saldo=").append(saldo);
        sb.append(", naturaleza=").append(naturaleza);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
