/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

import acciones.Accion;
import acciones.AccionClientesAltas;
import acciones.AccionClientesBajas;
import acciones.AccionClientesListado;
import acciones.AccionClientesModificaciones;
import acciones.AccionCompra;
import acciones.AccionFabricacion;
import acciones.AccionListadoCompras;
import acciones.AccionListadoStock;
import acciones.AccionListadoVentas;
import acciones.AccionProveedoresAltas;
import acciones.AccionProveedoresBajas;
import acciones.AccionProveedoresListado;
import acciones.AccionProveedoresModificaciones;
import acciones.AccionVenta;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * TRABAJO REALIZADO POR:
 * 
 * Luis Iglesias Muñoz con DNI: 53736017J del SUBGRUPO: A3
 * Alba Miguel Morcillo con DNI: 53267518R del SUBGRUPO: A3
 * 
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] opciones = {
            "C:Altas", "C:Bajas", "C:Listado", "C:Modificaciones",
            "P:Altas", "P:Bajas", "P:Listado", "P:Modificaciones",
            "Compra", "Venta", "Fabricacion",
            "L:Compras", "L:Ventas", "L:Stock"
        };

        Accion[] acciones = {
            new AccionClientesAltas(), new AccionClientesBajas(), new AccionClientesListado(), new AccionClientesModificaciones(),
            new AccionProveedoresAltas(), new AccionProveedoresBajas(), new AccionProveedoresListado(), new AccionProveedoresModificaciones(),
            new AccionCompra(), new AccionVenta(), new AccionFabricacion(),
            new AccionListadoCompras(), new AccionListadoVentas(), new AccionListadoStock()
        };

        RGBApplication app = new RGBApplication(opciones, acciones);
        app.run();
        app.theEnd();
        System.out.printf("%nTerminacion normal a las ");
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);

    }
}
