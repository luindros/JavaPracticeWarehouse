/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.Scanner;
import mainprogram.Cliente;

/**
 *
 * @author nombre
 */
public class AccionClientesAltas extends Accion {

    public AccionClientesAltas() {
        super();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String temp;
    	
        this.getModelo().cargarFicheroClientes(new File("clientes.bin"));
        
        Cliente c = new Cliente();
        c.leerDeTeclado();
        System.out.println("\nLos datos introducidos son:\n");
        System.out.println(c);
        
        this.getModelo().getClientes().add(c);
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();

        this.getModelo().guardarFicheroClientes(new File("clientes.bin"));

    }
}
