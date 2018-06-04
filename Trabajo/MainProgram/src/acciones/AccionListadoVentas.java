/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import mainprogram.FacturaDeVenta;

/**
 *
 * @author nombre
 */
public class AccionListadoVentas extends Accion {

    public AccionListadoVentas() {
        super();
    }

    @Override
    public void run() {
    	Scanner sc = new Scanner(System.in);
    	String temp;
    	
        this.getModelo().cargarFicheroFacturaDeVenta(new File("ventas.bin"));
        
        ArrayList<FacturaDeVenta> lista = this.getModelo().getFacturas();

        System.out.println("\n<-------------LISTADO DE VENTAS:-------------->\n");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();
    }
}