/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.Scanner;
import mainprogram.FacturaDeVenta;

/**
 *
 * @author nombre
 */
public class AccionVenta extends Accion{
    
    public AccionVenta() {
        super();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String temp;
        
        this.getModelo().cargarFicheroFacturaDeVenta(new File("ventas.bin"));
        this.getModelo().cargarFicheroAlmacen(new File("almacen.bin"));
        
        FacturaDeVenta f = new FacturaDeVenta();
        if (f.leerDeTeclado(this.getModelo().getClientes())) {
        	System.out.println(f);
        
        	if (f.getNumeroDePales()<=this.getModelo().getAlmacen().getNumeroPalesDisponibles()) {
        		this.getModelo().getFacturas().add(f);
        		this.getModelo().getAlmacen().setNumeroPalesDisponibles(this.getModelo().getAlmacen().getNumeroPalesDisponibles()-f.getNumeroDePales());
        	}
        	else {
        		System.out.println("No se puede realizar la venta, no hay pales disponibles en el almacen");
        		System.out.println("Es necesario fabricar "+(f.getNumeroDePales()-this.getModelo().getAlmacen().getNumeroPalesDisponibles())+" pales mas");
        	}
        }
        else {
            System.out.println("\nEl Dni introducido no pertenece a ninguno de los clientes almacenados\n");
        }
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();

        this.getModelo().guardarFicheroFacturaDeVenta(new File("ventas.bin"));
        this.getModelo().guardarFicheroAlmacen(new File("almacen.bin"));
        
    }
    
}
