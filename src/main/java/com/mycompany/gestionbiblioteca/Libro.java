/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author Nathalie
 */
//Cree una clase llamada Libro.
public class Libro {
    //Cree atributos (titulo, autor, fecha de publicación, genero, disponibilidad y tipo de libro), dentro de la clase Libro.
    private String titulo;//Atributo tipo texto cuando trae String
    private Autor autor;
    private String fecha;
    private String genero;
    private boolean disponibilidad;//Atributo que me da un valor de verdad (true o false)cuando trae boolean
    private String tipoLibro;// Revistas, Mangas, Libros de literatura, Libros de ciencia, Comics, entre otros.
    
    //Cree un constructor para inicializar el objeto, establecer sus propiedades y valores

    public Libro(String titulo, Autor autor, String fecha, String genero, boolean disponibilidad, String tipoLibro) {
        this.titulo = titulo;//Asigna el valor del parametro titulo al atributo libro de esta clase
        this.autor = autor;//Asigna el valor del parametro autor al atributo libro de esta clase
        this.fecha = fecha;//Asigna el valor del parametro fecha al atributo libro de esta clase
        this.genero = genero;//Asigna el valor del parametro genero al atributo libro de esta clase
        this.disponibilidad = disponibilidad;//Asigna el valor del parametro disponibilidad al atributo libro de esta clase
        this.tipoLibro = tipoLibro;//Asigna el valor del parametro tipolibro al atributo libro de esta clase
    }
    
    //Método get para obtener el valor de los atributos

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    //Este metodo es un get solo que el prefijo se utiliza con is por ser valor booleano
    public String getTipoLibro() {
        return tipoLibro;
    }
    
    //Método set para establecer el valor de los atributos

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    //Método set para establecer o modificar el valor de la disponibilidad
    public void setTipoLibro(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }
    //Indica que estamos sobrescribiendo un método de la clase objeto

    @Override
    //Puede ser accesible por cualquier otra clase y defini el nombre toString para el metodo
    public String toString() {//El método construye y devuelve una cadena de texto que tiene info sobre el libro
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor.getNombre() + ", fecha=" + fecha + ", genero=" + genero + ", disponibilidad=" + disponibilidad + ", tipoLibro=" + tipoLibro + '}'; //Le puse getNombre para que el atributo autor solo me seleccione el Nombre
    }
   
}
