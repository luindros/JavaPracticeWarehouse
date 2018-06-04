/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import mainprogram.OrdenDeCompra;

/**
 *
 * @author nombre
 */
public class AccionListadoCompras extends Accion {

    public AccionListadoCompras() {
        super();
    }

    @Override
    public void run() {
    	Scanner sc = new Scanner(System.in);
    	String temp;

        this.getModelo().cargarFicheroOrdenDeCompra(new File("compras.bin"));
        
        ArrayList<OrdenDeCompra> lista = this.getModelo().getOrdCompras();
        
        System.out.println("\n<-------------LISTADO DE COMPRAS:-------------->\n");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();

    }
}