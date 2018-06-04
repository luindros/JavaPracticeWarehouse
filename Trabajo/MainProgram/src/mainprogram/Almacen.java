/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author nombre
 */
public class Almacen implements Serializable {

    private float toneladasMaderaDisponibles;
    private int numeroPalesDisponibles;

    public Almacen() {
        toneladasMaderaDisponibles = 0f;
        numeroPalesDisponibles = 0;
    }

    @Override
    public String toString() {
        String resultado = toneladasMaderaDisponibles + "\t"
                + numeroPalesDisponibles + "\n";
        return resultado;
    }

    public void leerDeTeclado() {
        Scanner sc = new Scanner(System.in);
        float f;
        int i;
        System.out.println("\n<-------------DATOS NUEVOS DEL ALMACEN:-------------->\n");

        System.out.print("Escriba las toneladas de madera disponibles: ");
        f = sc.nextFloat();
        toneladasMaderaDisponibles = f;


        System.out.print("Escriba el numero de pales disponibles: ");
        i = sc.nextInt();
        numeroPalesDisponibles = i;

    }

    /**
     * @return the toneladasMaderaDisponibles
     */
    public float getToneladasMaderaDisponibles() {
        return toneladasMaderaDisponibles;
    }

    /**
     * @param toneladasMaderaDisponibles the toneladasMaderaDisponibles to set
     */
    public void setToneladasMaderaDisponibles(float toneladasMaderaDisponibles) {
        this.toneladasMaderaDisponibles = toneladasMaderaDisponibles;
    }

    /**
     * @return the numeroPalesDisponibles
     */
    public int getNumeroPalesDisponibles() {
        return numeroPalesDisponibles;
    }

    /**
     * @param numeroPalesDisponibles the numeroPalesDisponibles to set
     */
    public void setNumeroPalesDisponibles(int numeroPalesDisponibles) {
        this.numeroPalesDisponibles = numeroPalesDisponibles;
    }
}
