package mainprogram;

import java.io.Serializable;
import java.util.Scanner;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nombre
 */
public class Cliente implements Serializable {

    private String nombre;
    private String razonSocial;
    private String dni;
    private String email;
    private String telefono;

    public Cliente() {
        nombre = "Desconocido";
        razonSocial = "Desconocido";
        dni = "Desconocido";
        email = "Desconocido";
        telefono = "Desconocido";
    }

    @Override
    public String toString() {
        String resultado = nombre + "\t"
                + razonSocial + "\t"
                + dni + "\t"
                + email + "\t"
                + telefono + "\n";
        return resultado;
    }

    public void leerDeTeclado() {
        Scanner sc = new Scanner(System.in);
        String temp;
        System.out.println("\n<-------------DATOS DEL CLIENTE:-------------->\n");
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
            System.out.print("Escriba el dni: ");
            temp = sc.nextLine();
            if (!temp.isEmpty()) {
                dni = temp;
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
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
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
