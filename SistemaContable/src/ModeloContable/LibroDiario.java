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
    private LocalDate fechaLocal;

    public LibroDiario(List<Asiento> asientos, LocalDate fechaLocal) {
        this.asientos = asientos;
        this.fechaLocal = fechaLocal;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }

    public LocalDate getFechaLocal() {
        return fechaLocal;
    }

    public void setFechaLocal(LocalDate fechaLocal) {
        this.fechaLocal = fechaLocal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibroDiario{");
        sb.append("asientos=").append(asientos);
        sb.append(", fechaLocal=").append(fechaLocal);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
