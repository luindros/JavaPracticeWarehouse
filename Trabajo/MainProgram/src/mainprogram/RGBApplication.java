/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

import acciones.Accion;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author nombre
 */
public class RGBApplication {

    private String menu;
    private HashMap<String, Accion> h;
    private Modelo m;

    public RGBApplication(String[] opciones, Accion[] acciones) {
        h = new HashMap<>();
        menu = "";
        m = new Modelo();
        for (int i = 0; i < opciones.length; i++) {
            menu += opciones[i] + "\n";
            h.put(opciones[i].toUpperCase(), acciones[i]);
            acciones[i].setModelo(m);
        }
        menu += "Salir\n";
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String opcionLeida;
        Accion accionEscogida;
        while (true) {
            System.out.printf("Opciones:%n%n");
            System.out.printf("%s%n", menu);
            System.out.print("Escriba una opcion: ");
            opcionLeida = sc.nextLine().toUpperCase();

            if (opcionLeida.equalsIgnoreCase("SALIR")) {
                break;
            }
            accionEscogida = h.get(opcionLeida);
            if (accionEscogida != null) {
                accionEscogida.run();
            } else {
                System.out.println("\nOpcion desconocida\n");
            }
        }
    }

    public void theEnd() {
    }
}
