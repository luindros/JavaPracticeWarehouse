/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import mainprogram.Modelo;

/**
 *
 * @author nombre
 */
public abstract class Accion{

    private Modelo modelo;

    public Accion() {
        modelo = null;
    }

    /**
     * @return the modelo
     */
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo _m) {
        modelo = _m;
    }

    public abstract void run();
}
