/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import ModeloContable.Asiento;
import ModeloContable.Registro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class ControladorTablaLibroDiario extends AbstractTableModel {
    private List<Asiento> asientos;
    private List<List<Registro>> listadoTotalDeRegistros; 
    
    public ControladorTablaLibroDiario(List<List<Registro>> asientos) {
        this.listadoTotalDeRegistros = asientos;
    }
    
    

    @Override
    public int getRowCount() {
        return listadoTotalDeRegistros.parallelStream()
                .mapToInt(registros -> registros.size())
                .sum();
    }
    
    
    @Override
    public int getColumnCount() {
        return 4;
    }

    //Este metodo va estar dificil de implementar, dios me ha abandonado
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
     
        
        return null;
    }
    
}
