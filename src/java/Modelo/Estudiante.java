/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JORGE HOYOS
 */
public class Estudiante {
    private int idestudiante;
    private String nombre;
    private String apellidos;
    private String dni;
    private String codigo;
    private String estado;
    
    public Estudiante() {
    }

    public Estudiante(int idestudiante, String nombre, String apellidos, String dni, String codigo, String estado) {
        this.idestudiante = idestudiante;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.codigo = codigo;
        this.estado = estado;
    }

    
    

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}