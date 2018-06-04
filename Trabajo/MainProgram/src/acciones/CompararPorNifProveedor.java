/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.util.Comparator;
import mainprogram.Proveedor;

/**
 *
 * @author nombre
 */
public class CompararPorNifProveedor implements Comparator<Proveedor>{
    
    @Override
    public int compare(Proveedor p1, Proveedor p2) {
	
	String nif1 = p1.getNif();
	String nif2 = p2.getNif();
	return nif1.compareTo(nif2); 
	
    }
    
}
