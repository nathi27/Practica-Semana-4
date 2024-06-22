/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author Nathalie
 */

import java.util.ArrayList;
import java.util.List;

//Creo una clase llamada Biblioteca
public class Biblioteca {
    private List<Libro> listaLibros;//Declara una lista que almacena objetos de tipo Libro y contendra todos los libros que estan en biblioteca
    private List<Autor> listaAutores;//Declara una lista que almacena objetos de tipo Autor y contendra todos los autores que estan en biblioteca
    private List<Usuario> listaUsuarios;//Declara una lista que almacena objetos de tipo Usuario y contendra todos los usuarios que estan en biblioteca
    private List<Prestamo> listaPrestamos;//Declara una lista que almacena objetos de tipo Prestamo y contendra todos los prestamos que estan en biblioteca
    
    public Biblioteca(){
        listaLibros = new ArrayList<>();//Cree un ArrayList para almacenar objetos de tipo libro. OJO listaLibros será una lista vacía lista para almacenar libros
        listaAutores = new ArrayList<>();//Cree un ArrayList para almacenar objetos de tipo autor. OJO listaAutores será una lista vacía lista para almacenar autores
        listaUsuarios = new ArrayList<>();//Cree un ArrayList para almacenar objetos de tipo usuario. OJO listaUsuarios será una lista vacía lista para almacenar usuarios
        listaPrestamos = new ArrayList<>();//Cree un ArrayList para almacenar objetos de tipo prestamos. OJO listaPrestamos será una lista vacía lista para almacenar prestamos
    }
    
    //Agrega libros a la lista de libros de la biblioteca
    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }
    
    //Agrega autores a la lista de autores de la biblioteca
    public void agregarAutor(Autor autor){
        listaAutores.add(autor);
    }
    
    //Agrega usuarios a la lista de usuarios de la biblioteca
    public void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    public void realizarPrestamo(Libro libro, Usuario usuario, String fechaPrestamo, String fechaDevolucionEstimada){
        if(libro.isDisponibilidad()){//Verifica si el libro está disponible para préstamo
            libro.setDisponibilidad(false);//Se marca  el libro como no disponible
            Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucionEstimada);//Se crea un nuevo objeto Prestamo con los parámetros proporcionados
            listaPrestamos.add(prestamo);//Se agrega el objeto prestamo a la lista listaPrestamos de la biblioteca.   
        } else {
            System.out.println("El libro no está dispoible para prestamo");
        }
    }
    
    //Cree una lista que contiene todos los libros almacenados
    public List<Libro> obtenerListaLibros(){
        return listaLibros;
    }
    //Cree una lista que contiene todos los autores almacenadados en la biblioteca
    public List<Autor> obtenerListaAutores(){
        return listaAutores;
    }
    //Cree una lista que contiene todos los usuarios almacenadados en la biblioteca
    public List<Usuario> obtenerListaUsuarios() {
        return listaUsuarios;
    }
    //Cree una lista que contiene todos los usuarios almacenadados en la biblioteca
    public List<Prestamo> obtenerListaPrestamos(){
        return listaPrestamos;
    }
    //Cree una lista que contiene todos los prestamos almacenadados en la biblioteca
    public List<Libro> obtenerLibrosDisponibles(){
        List<Libro> disponibles = new ArrayList<>();//nueva lista disponibles que contendrá los libros disponibles.
        for(Libro libro : listaLibros){ // Itera a través de cada objeto Libro en la lista listaLibros.
            if (libro.isDisponibilidad()){ //Verifica si el libro está disponible llamando al método isDisponibilidad() del objeto Libro. Si es así, agrega el libro a la lista disponibles.
                disponibles.add(libro);
            }
        }
        return disponibles;// me devuelve el valor actual de libros disponibles
    }
    public List<Libro> obtenerLibrosPrestados(){
        List<Libro> prestados = new ArrayList<>();//nueva lista disponibles que contendrá los libros prestados.
        for(Prestamo prestamo : listaPrestamos){// Itera a través de cada objeto Libro en la lista listaPrestamos.
            prestados.add(prestamo.getLibro());//Obtiene el libro asociado al préstamo actual mediante prestamo.getLibro() y lo agrega a la lista prestados.
        }
        return prestados; // me devuelve el valor actual de libros prestados
    }
}
