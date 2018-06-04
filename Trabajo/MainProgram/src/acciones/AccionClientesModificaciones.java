/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import mainprogram.Cliente;

/**
 *
 * @author nombre
 */
public class AccionClientesModificaciones extends Accion{
    
    public AccionClientesModificaciones() {
        super();
    }

    @Override
    public void run() {
    	
        Scanner sc = new Scanner (System.in);
        String dni,temp;

        this.getModelo().cargarFicheroClientes(new File("clientes.bin"));
        
        System.out.println("Introduzca el dni del cliente que desea modificar: ");

        dni = sc.nextLine();
        Cliente buscado = new Cliente();
        buscado.setDni(dni);
        
        ArrayList<Cliente> lista = this.getModelo().getClientes();
        Comparator<Cliente> c = new CompararPorDniCliente();
        
        boolean encontrado = false;
        for (int i = 0; i < lista.size(); i++) {
            if(c.compare((Cliente)lista.get(i), (Cliente)buscado) == 0){
               lista.get(i).leerDeTeclado();
               encontrado = true;
               break;
            }
        }
        
        if (!encontrado) {
            System.out.println("\nNo existe ningun cliente con ese dni\n ");
        }
        else {
            this.getModelo().guardarFicheroClientes(new File("clientes.bin"));
        }
        
        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();
  
    }
    
}
