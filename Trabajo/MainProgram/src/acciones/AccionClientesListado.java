
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import mainprogram.Cliente;

/**
 *
 * @author nombre
 */
public class AccionClientesListado extends Accion {

    public AccionClientesListado() {
        super();
    }

    @Override
    public void run() {
        
        Scanner sc = new Scanner (System.in);
        String temp;
        
        this.getModelo().cargarFicheroClientes(new File("clientes.bin"));
        
        ArrayList<Cliente> lista = this.getModelo().getClientes();
        
        System.out.println("\n<-------------LISTADO DE CLIENTES:-------------->\n");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("\nPulse Enter para continuar\n");
        temp = sc.nextLine();

    }
}
