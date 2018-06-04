/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import mainprogram.Proveedor;

/**
 *
 * @author nombre
 */
public class AccionProveedoresModificaciones extends Accion{
    
    public AccionProveedoresModificaciones() {
        super();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner (System.in);
        String nif,temp;
        
        this.getModelo().cargarFicheroProveedores(new File("proveedores.bin"));
        
        System.out.println("Introduzca el nif del proveedor que desea modificar: ");
        
        nif = sc.nextLine();
        Proveedor buscado = new Proveedor();
        buscado.setNif(nif);
        
        ArrayList<Proveedor> lista = this.getModelo().getProveedores();
        Comparator<Proveedor> c = new CompararPorNifProveedor();
        
        boolean encontrado = false;
        for (int i = 0; i < lista.size(); i++) {
            if(c.compare((Proveedor)lista.get(i), (Proveedor)buscado) == 0){
               lista.get(i).leerDeTeclado();
               encontrado = true;
               break;
            }
        }
        
        if (!encontrado) {
            System.out.println("\nNo existe ningun proveedor con ese nif\n ");
        }
        else {
            this.getModelo().guardarFicheroProveedores(new File("proveedores.bin"));
        }
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();

    }
    
}
