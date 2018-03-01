/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_proyectolab_fabio_katherine;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class Usuario_comun extends Usuario{
    private String direccion;
    private ArrayList<Correos> correos=new ArrayList();
    private ArrayList<Candidatos> candidatos=new ArrayList();
    private String Archivo;//cambiar
    private ArrayList<Amigos> amigos=new ArrayList();

    public Usuario_comun() {
    }

    public Usuario_comun(String direccion, String Archivo, String nombre_usuario, String contraseña, Date fecha_nacimiento, String correo, String sexo, String nombre) {
        super(nombre_usuario, contraseña, fecha_nacimiento, correo, sexo, nombre);
        this.direccion = direccion;
        this.Archivo = Archivo;
    }

    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Correos> getCorreos() {
        return correos;
    }

    public void setCorreos(ArrayList<Correos> correos) {
        this.correos = correos;
    }

    public ArrayList<Candidatos> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidatos> candidatos) {
        this.candidatos = candidatos;
    }

    public String getArchivo() {
        return Archivo;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    public ArrayList<Amigos> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Amigos> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Usuario_comun{" + "direccion=" + direccion + ", correos=" + correos + ", candidatos=" + candidatos + ", Archivo=" + Archivo + ", amigos=" + amigos + '}';
    }

   
    
    
    
}
