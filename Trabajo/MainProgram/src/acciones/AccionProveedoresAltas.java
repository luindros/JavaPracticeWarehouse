/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.Scanner;
import mainprogram.Proveedor;

/**
 *
 * @author nombre
 */
public class AccionProveedoresAltas extends Accion {

    public AccionProveedoresAltas() {
        super();
    }

    @Override
    public void run() {
    	Scanner sc = new Scanner(System.in);
        String temp;
        
        this.getModelo().cargarFicheroProveedores(new File("proveedores.bin"));
        
        Proveedor p = new Proveedor();
        p.leerDeTeclado();
        System.out.println("\nLos datos introducidos son:\n");
        System.out.println(p);
        
        this.getModelo().getProveedores().add(p);
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();
   
        this.getModelo().guardarFicheroProveedores(new File("proveedores.bin"));

    }
}
