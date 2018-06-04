/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

import acciones.CompararPorNifProveedor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nombre
 */
public class OrdenDeCompra implements Serializable {

    private String nifProveedor;
    private float toneladasMaderaPedidas;
    private float precioTonelada;
    private float baseImponible;
    private float iva;
    private String fecha;

    public OrdenDeCompra() {
        nifProveedor = "Desconocido";
        toneladasMaderaPedidas = 0f;
        precioTonelada = 0f;
        baseImponible = 0f;
        iva = 0f;
        fecha = "Desconocida";
    }

    @Override
    public String toString() {
        String resultado = getProveedor().toString() + "\t"
                + toneladasMaderaPedidas + "\t"
                + precioTonelada + "\t"
                + baseImponible + "\t"
                + fecha + "\n";
        return resultado;
    }

    public boolean leerDeTeclado(ArrayList<Proveedor> proveedores) {
    	
    	boolean encontrado = false;
    	
        Scanner sc = new Scanner(System.in);
        String nif;
        String temp;
        float f;

        System.out.println("\n<-------------DATOS DE UNA NUEVA ORDEN DE COMPRA:-------------->\n");        
        
        System.out.print("Escriba el nif del proveedor: ");
        nif = sc.nextLine();
        nifProveedor = nif;
        
        Proveedor buscado = new Proveedor();
        buscado.setNif(nif); 
        Comparator<Proveedor> c = new CompararPorNifProveedor();
        for (int i = 0; i < proveedores.size(); i++) {
            if(c.compare((Proveedor)proveedores.get(i), (Proveedor)buscado) == 0){
               encontrado = true;
               break;
            }
        }

        if (encontrado) {
        	System.out.print("Escriba las toneladas de madera pedidas: ");
        	f = sc.nextFloat();
        	toneladasMaderaPedidas = f;

        	System.out.print("Escriba el precio por tonelada: ");
        	f = sc.nextFloat();
        	precioTonelada = f;

        	System.out.print("Escriba la base imponible: ");
        	f = sc.nextFloat();
        	baseImponible = f;
        	
        	do {
        		System.out.print("Escriba la fecha(dd/mm/aaaa): ");
        		temp = sc.nextLine();
        		if (!temp.isEmpty()) {
        			fecha = temp;
        		}
        	} while (temp.isEmpty());

        }
        
        return(encontrado);
    }

    /**
     * @return the toneladasMaderaPedidas
     */
    public float getToneladasMaderaPedidas() {
        return toneladasMaderaPedidas;
    }

    /**
     * @param toneladasMaderaPedidas the toneladasMaderaPedidas to set
     */
    public void setToneladasMaderaPedidas(float toneladasMaderaPedidas) {
        this.toneladasMaderaPedidas = toneladasMaderaPedidas;
    }

    /**
     * @return the precioTonelada
     */
    public float getPrecioTonelada() {
        return precioTonelada;
    }

    /**
     * @param precioTonelada the precioTonelada to set
     */
    public void setPrecioTonelada(float precioTonelada) {
        this.precioTonelada = precioTonelada;
    }

    /**
     * @return the iva
     */
    public float getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(float iva) {
        this.iva = iva;
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
     * @return the proveedor
     */
    public String getProveedor() {
        return nifProveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    
    public void setProveedor(String nifProveedor) {
        this.nifProveedor = nifProveedor;
    }
}
