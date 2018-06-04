/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import mainprogram.Proveedor;

/**
 *
 * @author nombre
 */
public class AccionProveedoresListado extends Accion {

    public AccionProveedoresListado() {
        super();
    }

    @Override
    public void run() {
    	
        Scanner sc = new Scanner (System.in);
        String temp;

        this.getModelo().cargarFicheroProveedores(new File("proveedores.bin"));
        
        ArrayList<Proveedor> lista = this.getModelo().getProveedores();
        
        System.out.println("\n<-------------LISTADO DE PROVEEDORES:-------------->\n");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();

    }
}
