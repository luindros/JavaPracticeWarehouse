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
public class AccionFabricacion extends Accion{
    
    public AccionFabricacion() {
        super();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String temp;
    	
        this.getModelo().cargarFicheroAlmacen(new File("almacen.bin"));
        Almacen almacen = this.getModelo().getAlmacen();
        
        int numPales;
        float maderaNecesaria;
        
        System.out.println("\n<-------------DATOS DE UNA NUEVA ORDEN DE FABRICACION:-------------->\n");        
        
        System.out.print("Escriba el numero de pales que quiere fabricar: ");
        numPales = sc.nextInt();
        
        System.out.print("Escriba las toneladas de madera necesarias: ");
        maderaNecesaria = sc.nextFloat();
        
        if (maderaNecesaria<=almacen.getToneladasMaderaDisponibles()) {
        	almacen.setToneladasMaderaDisponibles(almacen.getToneladasMaderaDisponibles()-maderaNecesaria);
        	almacen.setNumeroPalesDisponibles(almacen.getNumeroPalesDisponibles()+numPales);
        	System.out.println("El almacen tiene ahora "+almacen.getNumeroPalesDisponibles()+" pales disponbiles");
        }
        else {
        	System.out.println("La orden de fabricacion no es posible");
        	System.out.println("Es necesario realizar una orden de compra de "+(maderaNecesaria-almacen.getToneladasMaderaDisponibles())+" toneladas de madera");
        }
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();
        
        this.getModelo().guardarFicheroAlmacen(new File("almacen.bin"));
    }
    
}
