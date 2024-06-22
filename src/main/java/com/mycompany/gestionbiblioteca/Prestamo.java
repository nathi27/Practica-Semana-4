/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author Nathalie
 */
//Cree una clase llamada Prestamo.
public class Prestamo {
    //Cree atributos (Libro,Usuario, fecha de prestamo, fecha de devolucion), dentro de la clase Prestamo
    private Libro libro; //Declaro 2 veces libro ya que estoy llamando a la clase libro del otro archivo y creando un nuevo atributo en esta clase con el atributo llamado Libro
    private Usuario usuario;//Pasa lo mismo que el atributo Libro, solo que con el nombre Usuario
    private String fechaPrestamo;
    private String fechaDevolucion;
    
    //Cree un constructor para inicializar el objeto, establecer sus propiedades y valores
    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo, String fechaDevolucion) {
        this.libro = libro;//Asigna el valor del parametro libro al atributo libro de esta clase
        this.usuario = usuario;//Asigna el valor del parametro usuario al atributo libro de esta clase
        this.fechaPrestamo = fechaPrestamo;//Asigna el valor del parametro fechaPrestamo al atributo libro de esta clase
        this.fechaDevolucion = fechaDevolucion;//Asigna el valor del parametro FechaDevolucion al atributo libro de esta clase
    }
    //Método get para obtener el valor del atributo 
    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
    //Método set para establecer el valor del atributo
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    //Puede ser accesible por cualquier otra clase y defini el nombre toString para el metodo
    public String toString() {
        return "Prestamo{" + "libro=" + libro + ", usuario=" + usuario + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
    
    
    
}
