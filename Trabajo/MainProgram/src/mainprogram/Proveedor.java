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
public class Proveedor implements Serializable {

    private String nombre;
    private String razonSocial;
    private String nif;
    private String email;
    private String telefono;

    public Proveedor() {
        nombre = "Desconocido";
        razonSocial = "Desconocido";
        nif = "Desconocido";
        email = "Desconocido";
        telefono = "Desconocido";
    }

    @Override
    public String toString() {
        String resultado = nombre + "\t"
                + razonSocial + "\t"
                + nif + "\t"
                + email + "\t"
                + telefono + "\n";
        return resultado;
    }

    public void leerDeTeclado() {
        Scanner sc = new Scanner(System.in);
        String temp;
        System.out.println("\n<-------------DATOS DEL PROVEEDOR:-------------->\n");
        do {
            System.out.print("Escriba el nombre: ");
            temp = sc.nextLine();
            if (!temp.isEmpty()) {
                nombre = temp;
            }
        } while (temp.isEmpty());
        do {
            System.out.print("Escriba la razon social: ");
            temp = sc.nextLine();
            if (!temp.isEmpty()) {
                razonSocial = temp;
            }
        } while (temp.isEmpty());
        do {
            System.out.print("Escriba el nif: ");
            temp = sc.nextLine();
            if (!temp.isEmpty()) {
                nif = temp;
            }
        } while (temp.isEmpty());
        do {
            System.out.print("Escriba el email: ");
            temp = sc.nextLine();
            if (!temp.isEmpty()) {
                email = temp;
            }
        } while (temp.isEmpty());
        do {
            System.out.print("Escriba el telefono: ");
            temp = sc.nextLine();
            if (!temp.isEmpty()) {
                telefono = temp;
            }
        } while (temp.isEmpty());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
