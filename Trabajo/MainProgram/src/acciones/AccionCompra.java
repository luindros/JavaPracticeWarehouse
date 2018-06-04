/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.Scanner;
import mainprogram.OrdenDeCompra;

/**
 *
 * @author nombre
 */
public class AccionCompra extends Accion{
    
    public AccionCompra() {
        super();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String temp;

        this.getModelo().cargarFicheroOrdenDeCompra(new File("compras.bin"));
        this.getModelo().cargarFicheroAlmacen(new File("almacen.bin"));
        
        OrdenDeCompra o = new OrdenDeCompra();
        if (o.leerDeTeclado(this.getModelo().getProveedores())) {
        	System.out.println(o);
            this.getModelo().getAlmacen().setToneladasMaderaDisponibles(this.getModelo().getAlmacen().getToneladasMaderaDisponibles()+o.getToneladasMaderaPedidas());
            this.getModelo().getOrdCompras().add(o);
        }
        else {
            System.out.println("\nEl Nif introducido no pertenece a ninguno de los proveedores almacenados\n");
        }
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();

        this.getModelo().guardarFicheroOrdenDeCompra(new File("compras.bin"));
        this.getModelo().guardarFicheroAlmacen(new File("almacen.bin"));
    }
    
}
