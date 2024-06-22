/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author Nathalie
 */
//Cree una clase llamada Autor.
public class Autor {
    //Cree atributos (nombre, apellido, nacionalidad y fecha de nacimiento), dentro de la clase Autor.
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String fechaDeNacimiento;
    
    //Cree este constructor para que me lo reconozca el metodo de ´agregarLibro()´ para que solo me muestre el nombre del autor
    public Autor (String nombre){
        this.nombre = nombre;
    }
    
    //Cree un constructor para inicializar el objeto, establecer sus propiedades y valores

    public Autor(String nombre, String apellido, String nacionalidad, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    //Método get para obtener el valor de los atributos

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
     //Método set para establecer el valor de los atributos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    //Indica que estamos sobrescribiendo un método de la clase objeto
    @Override
    //Puede ser accesible por cualquier otra clase y defini el nombre toString para el metodo
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
    
}
