/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

import acciones.CompararPorDniCliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nombre
 */
public class FacturaDeVenta implements Serializable {

    private String dniCliente;
    private int numeroDePales;
    private float precioUnitario;
    private float baseImponible;
    private float precioFinal;
    private String fecha;

    public FacturaDeVenta() {
        dniCliente = "Desconocido";
        numeroDePales = 0;
        precioUnitario = 0f;
        baseImponible = 0f;
        precioFinal = 0f;
        fecha = "Desconocido";
    }

    @Override
    public String toString() {
        String resultado = dniCliente + "\t"
                + numeroDePales + "\t"
                + precioUnitario + "\t"
                + baseImponible + "\t"
                + precioFinal + "\t"
                + fecha + "\n";
        return resultado;
    }

    public boolean leerDeTeclado(ArrayList<Cliente> clientes) {
    	
    	boolean encontrado = false;
    	
        Scanner sc = new Scanner(System.in);
        String temp;
        int i;
        float f;

        System.out.println("\n<-------------DATOS DE UNA NUEVA FACTURA DE VENTA:-------------->\n");
        
        System.out.print("Escriba el dni clienLte: ");
        temp = sc.nextLine();
        dniCliente = temp;

        Cliente buscado = new Cliente();
        buscado.setDni(dniCliente);
        Comparator<Cliente> c = new CompararPorDniCliente();
        for (int j = 0; j < clientes.size(); j++) {
            if(c.compare((Cliente)clientes.get(j), (Cliente)buscado) == 0){
               encontrado = true;
               break;
            }
        }

        if (encontrado) {
        	System.out.print("Escriba el numero de pales vendidos: ");
        	i = sc.nextInt();
        	numeroDePales = i;

        	System.out.print("Escriba el precio unitario: ");
        	f = sc.nextFloat();
        	precioUnitario = f;

        	System.out.print("Escriba la base imponible: ");
        	f = sc.nextFloat();
        	baseImponible = f;

        	System.out.print("Escriba el precio final: ");
        	f = sc.nextFloat();
        	precioFinal = f;
        	
        	do {
        		System.out.print("Escriba la fecha(dd/mm/aaaa): ");
        		temp = sc.nextLine();
        		if (!temp.isEmpty()) {
        			fecha = temp;
        		}
        	} while (temp.isEmpty());
        }
        return (encontrado);
    }

    /**
     * @return the numeroDePales
     */
    public int getNumeroDePales() {
        return numeroDePales;
    }

    /**
     * @param numeroDePales the numeroDePales to set
     */
    public void setNumeroDePales(int numeroDePales) {
        this.numeroDePales = numeroDePales;
    }

    /**
     * @return the precioUnitario
     */
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the precioFinal
     */
    public float getPrecioFinal() {
        return precioFinal;
    }

    /**
     * @param precioFinal the precioFinal to set
     */
    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the baseImponible
     */
    public float getBaseImponible() {
        return baseImponible;
    }

    /**
     * @param baseImponible the baseImponible to set
     */
    public void setBaseImponible(float baseImponible) {
        this.baseImponible = baseImponible;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return dniCliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }
}
