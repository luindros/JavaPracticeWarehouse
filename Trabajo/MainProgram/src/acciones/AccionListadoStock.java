/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.Scanner;
import mainprogram.Almacen;

/**
 *
 * @author nombre
 */
public class AccionListadoStock extends Accion {

    public AccionListadoStock() {
        super();
    }

    @Override
    public void run() {
    	Scanner sc = new Scanner(System.in);
    	String temp;

        this.getModelo().cargarFicheroAlmacen(new File("almacen.bin"));
        Almacen almacen = this.getModelo().getAlmacen();
        
        System.out.println("\n<-------------INFORMACI�N DEL ALMACEN:-------------->\n");        
        System.out.println("El almacen dispone de "+almacen.getToneladasMaderaDisponibles()+" toneladas de madera");
        System.out.println("El almacen dispone de "+almacen.getNumeroPalesDisponibles()+" pales de madera");
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();

    }
}