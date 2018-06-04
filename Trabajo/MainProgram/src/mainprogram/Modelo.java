/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author nombre
 */
public class Modelo {

    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<FacturaDeVenta> facturas;
    private ArrayList<OrdenDeCompra> ordCompras;
    private Almacen almacen;

    public Modelo() {

        clientes = new ArrayList<>();
        proveedores = new ArrayList<>();
        facturas = new ArrayList<>();
        ordCompras = new ArrayList<>();
        almacen = new Almacen();

        if (!this.cargarFicheroClientes(new File("clientes.bin"))) {
            System.out.printf("Se ha creado una tabla clientes vacia%n%n");
        }

        if (!this.cargarFicheroProveedores(new File("proveedores.bin"))) {
            System.out.printf("Se ha creado una tabla proveedores vacia%n%n");
        }

        if (!this.cargarFicheroFacturaDeVenta(new File("ventas.bin"))) {
            System.out.printf("Se ha creado una tabla facturas vacia%n%n");
        }

        if (!this.cargarFicheroOrdenDeCompra(new File("compras.bin"))) {
            System.out.printf("Se ha creado una tabla compras vacia%n%n");
        }

        if (!this.cargarFicheroAlmacen(new File("almacen.bin"))) {
            System.out.printf("Se ha creado una tabla almacen vacia%n%n");
        }
    }

    public final boolean cargarFicheroClientes(File f) {

        if (!f.exists()) {
            return false;
        }
        ObjectInputStream ois;
        try {
            InputStream is = Files.newInputStream(f.toPath());
            BufferedInputStream bis = new BufferedInputStream(is);
            ois = new ObjectInputStream(bis);
            Object c = ois.readObject();

            clientes = (ArrayList<Cliente>) c;

            ois.close();
        } catch (Exception ex) {
            System.out.println("Modelo:cargarFicheroClientes" + ex);
            return false;
        }
        return true;
    }

    public final boolean cargarFicheroProveedores(File f) {

        if (!f.exists()) {
            return false;
        }
        ObjectInputStream ois;
        try {
            InputStream is = Files.newInputStream(f.toPath());
            BufferedInputStream bis = new BufferedInputStream(is);
            ois = new ObjectInputStream(bis);
            Object c = ois.readObject();

            proveedores = (ArrayList<Proveedor>) c;

            ois.close();
        } catch (Exception ex) {
            System.out.println("Modelo:cargarFicheroProveedores" + ex);
            return false;
        }
        return true;
    }

    public final boolean cargarFicheroFacturaDeVenta(File f) {

        if (!f.exists()) {
            return false;
        }
        ObjectInputStream ois;
        try {
            InputStream is = Files.newInputStream(f.toPath());
            BufferedInputStream bis = new BufferedInputStream(is);
            ois = new ObjectInputStream(bis);
            Object fdv = ois.readObject();

            facturas = (ArrayList<FacturaDeVenta>) fdv;

            ois.close();
        } catch (Exception ex) {
            System.out.println("Modelo:cargarFicheroFacturaDeVenta" + ex);
            return false;
        }
        return true;
    }

    public final boolean cargarFicheroOrdenDeCompra(File f) {

        if (!f.exists()) {
            return false;
        }
        ObjectInputStream ois;
        try {
            InputStream is = Files.newInputStream(f.toPath());
            BufferedInputStream bis = new BufferedInputStream(is);
            ois = new ObjectInputStream(bis);
            Object o = ois.readObject();

            ordCompras = (ArrayList<OrdenDeCompra>) o;

            ois.close();
        } catch (Exception ex) {
            System.out.println("Modelo:cargarFicheroOrdenDeCompra" + ex);
            return false;
        }
        return true;
    }

    public final boolean cargarFicheroAlmacen(File f) {

        if (!f.exists()) {
            return false;
        }
        ObjectInputStream ois;
        try {
            InputStream is = Files.newInputStream(f.toPath());
            BufferedInputStream bis = new BufferedInputStream(is);
            ois = new ObjectInputStream(bis);
            Object a = ois.readObject();

            almacen = (Almacen) a;

            ois.close();
        } catch (Exception ex) {
            System.out.println("Modelo:cargarFicheroAlmacen" + ex);
            return false;
        }
        return true;
    }

    public boolean guardarFicheroClientes(File f) {

        try {
            OutputStream os = Files.newOutputStream(f.toPath());
            BufferedOutputStream bos = new BufferedOutputStream(os);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(clientes);

            oos.close();
        } catch (Exception ex) {
            System.out.println("Modelo:guardarFicheroClientes" + ex);
            return false;
        }
        return true;
    }

    public boolean guardarFicheroProveedores(File f) {

        try {
            OutputStream os = Files.newOutputStream(f.toPath());
            BufferedOutputStream bos = new BufferedOutputStream(os);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(proveedores);

            oos.close();
        } catch (Exception ex) {
            System.out.println("Modelo:guardarFicheroProveedores" + ex);
            return false;
        }
        return true;
    }

    public boolean guardarFicheroFacturaDeVenta(File f) {

        try {
            OutputStream os = Files.newOutputStream(f.toPath());
            BufferedOutputStream bos = new BufferedOutputStream(os);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(facturas);

            oos.close();
        } catch (Exception ex) {
            System.out.println("Modelo:guardarFicheroFacturaDeVenta" + ex);
            return false;
        }
        return true;
    }

    public boolean guardarFicheroOrdenDeCompra(File f) {

        try {
            OutputStream os = Files.newOutputStream(f.toPath());
            BufferedOutputStream bos = new BufferedOutputStream(os);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(ordCompras);

            oos.close();
        } catch (Exception ex) {
            System.out.println("Modelo:guardarFicheroOrdenDeCompra" + ex);
            return false;
        }
        return true;
    }

    public boolean guardarFicheroAlmacen(File f) {

        try {
            OutputStream os = Files.newOutputStream(f.toPath());
            BufferedOutputStream bos = new BufferedOutputStream(os);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(almacen);

            oos.close();
        } catch (Exception ex) {
            System.out.println("Modelo:guardarFicheroAlmacen" + ex);
            return false;
        }
        return true;
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the proveedores
     */
    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    /**
     * @param proveedores the proveedores to set
     */
    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    /**
     * @return the facturas
     */
    public ArrayList<FacturaDeVenta> getFacturas() {
        return facturas;
    }

    /**
     * @param facturas the facturas to set
     */
    public void setFacturas(ArrayList<FacturaDeVenta> facturas) {
        this.facturas = facturas;
    }

    /**
     * @return the ordCompras
     */
    public ArrayList<OrdenDeCompra> getOrdCompras() {
        return ordCompras;
    }

    /**
     * @param ordCompras the ordCompras to set
     */
    public void setOrdCompras(ArrayList<OrdenDeCompra> ordCompras) {
        this.ordCompras = ordCompras;
    }

    /**
     * @return the almacen
     */
    public Almacen getAlmacen() {
        return almacen;
    }

    /**
     * @param almacen the almacen to set
     */
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
}
