/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.util.Comparator;
import mainprogram.Cliente;

/**
 *
 * @author nombre
 */
public class CompararPorDniCliente implements Comparator<Cliente>{
    
    @Override
    public int compare(Cliente c1, Cliente c2) {
	
	String dni1 = c1.getDni();
	String dni2 = c2.getDni();
	return dni1.compareTo(dni2); 
	
    }
    
}
