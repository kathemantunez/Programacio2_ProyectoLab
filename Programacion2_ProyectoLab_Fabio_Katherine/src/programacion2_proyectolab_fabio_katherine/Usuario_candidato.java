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
public class Usuario_candidato extends Usuario{
    private ArrayList<Certificaciones> certificaciones=new ArrayList();
    private ArrayList<Publicaciones> publicaciones=new ArrayList();
    private ArrayList<Seguidores> seguidores=new ArrayList();

    public Usuario_candidato() {
    }

    public Usuario_candidato(String nombre_usuario, String contraseña, Date fecha_nacimiento, String correo, String sexo, String nombre) {
        super(nombre_usuario, contraseña, fecha_nacimiento, correo, sexo, nombre);
    }

    public ArrayList<Certificaciones> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(ArrayList<Certificaciones> certificaciones) {
        this.certificaciones = certificaciones;
    }

    public ArrayList<Publicaciones> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicaciones> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<Seguidores> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Seguidores> seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public String toString() {
        return "Usuario_candidato{" + "certificaciones=" + certificaciones + ", publicaciones=" + publicaciones + ", seguidores=" + seguidores + '}';
    }
    
}
