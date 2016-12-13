/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal4;

import java.util.ArrayList;
/**
 *
 * @author pc
 */
public class Usuario {
    private String user;
    private String pass;
    private String nombre;
    private String fecha;
    private String Genero;
    private String Raza;
    private String Observaciones;
    private  ArrayList<Grafo> graphicar = new ArrayList();

    public Usuario() {
    }

    public Usuario(String user, String pass, String nombre, String fecha, String Genero, String Raza, String Observaciones, ArrayList<Grafo> graphicar) {
        this.user = user;
        this.pass = pass;
        this.nombre = nombre;
        this.fecha = fecha;
        this.Genero = Genero;
        this.Raza = Raza;
        this.Observaciones = Observaciones;
        this.graphicar = graphicar;
    }

    public ArrayList<Grafo> getGraphicar() {
        return graphicar;
    }

    public void setGraphicar(ArrayList<Grafo> graphicar) {
        this.graphicar = graphicar;
    }

   

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
    
    
}
