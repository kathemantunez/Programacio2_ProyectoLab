/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_proyectolab_fabio_katherine;

import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class Amigos {
    private Amigos nombre;

    public Amigos() {
    }

//    public ArrayList<Usuario> getAmigos() {
//        return amigos;
//    }
//
//    public void setAmigos(ArrayList<Usuario> amigos) {
//        this.amigos = amigos;
//    }
//    

    public Amigos(Amigos nombre) {
        this.nombre = nombre;
    }

    public Amigos getNombre() {
        return nombre;
    }

    public void setNombre(Amigos nombre) {
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "Amigos{"+ nombre + '}';
    }
    
}
