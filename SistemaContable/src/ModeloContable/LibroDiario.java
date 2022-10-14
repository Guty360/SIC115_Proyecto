/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloContable;

import java.util.List;
import java.time.LocalDate;
/**
 *
 * @author pc
 */
public class LibroDiario extends Serializacion{
    private List<Asiento> asientos;

    public LibroDiario(List<Asiento> asientos, LocalDate fechaLocal) {
        this.asientos = asientos;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibroDiario{");
        sb.append("asientos=").append(asientos);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
