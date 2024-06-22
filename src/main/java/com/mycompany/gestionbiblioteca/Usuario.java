/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author Nathalie
 */
//Cree una clase llamada Usuario
public class Usuario {
    //Cree atributos (nombre, apellido, direccion, telefono, numeroIdentificacion), dentro de la clase Usuario.
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String numeroDeIdentificacion;
    
    //Cree un constructor para inicializar el objeto, establecer sus propiedades y valores

    public Usuario(String nombre, String apellido, String direccion, String telefono, String numeroDeIdentificacion) {
        this.nombre = nombre; //Asigna el valor del parametro nombre al atributo libro de esta clase
        this.apellido = apellido;//Asigna el valor del parametro apellido al atributo libro de esta clase
        this.direccion = direccion;//Asigna el valor del parametro telefono al atributo libro de esta clase
        this.telefono = telefono;//Asigna el valor del parametro numeroIdentificacion al atributo libro de esta clase
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }
    //Método get para obtener el valor del atributo

    public String getNombre() {
        return nombre;//Return: Me devuelve el valor actual 
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }
    //Método set para establecer el valor de los atributos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;//Se le asigna el valor del parametro al atributo de la clase
    }

    @Override
    //Devuelve una representación en cadena de texto del objeto Usuario.
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", numeroDeIdentificacion=" + numeroDeIdentificacion + '}';
    }
     
}
