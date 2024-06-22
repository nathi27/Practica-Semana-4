/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionbiblioteca;

/**
 *
 * @author Nathalie
 */
import java.util.Scanner;
import java.util.List;

//cree una clase llamada GestionBiblioteca
public class GestionBiblioteca {
    //Defini atributos para la clase
    private Biblioteca biblioteca; // Metodo de la clase Biblioteca para gestionar libros,usuarios y préstamos
    private Scanner scanner; //Scanner para leer la entrada del usuario
    
    //Constructor de la clase GestionBiblioteca

    public GestionBiblioteca() {
        biblioteca = new Biblioteca(); //Inicializa una nueva instancia de Biblioteca
        scanner = new Scanner(System.in);// Inicializa el Scanner para leer la entrada del usuario
    }
    
    //Muestra el menu principal de opciones para la gestión de la biblioteca
    //Permite al usuario realizar diversas operaciones como agregar libros, autores, usuarios, entre otras.
    public void menuPrincipal(){
        int opcion;
        do{
            System.out.println("1.Agregar libro");
            System.out.println("2.Agregar autor");
            System.out.println("3.Agregar usuario");
            System.out.println("4.Realizar préstamo");
            System.out.println("5.Lista de libros");
            System.out.println("6.Lista de autores");
            System.out.println("7.Lista de usuarios");
            System.out.println("8.Lista de préstamos");
            System.out.println("0.Salir");
            
            System.out.println("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();//Limpia el buffer de entrada
            
            switch (opcion){
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    agregarAutor();
                    break;
                case 3:
                    agregarUsuario();
                    break;
                case 4:
                    realizarPrestamo();
                    break;
                case 5:
                    mostrarListadoLibros();
                    break;
                case 6:
                    mostrarListadoAutores();
                    break;
                case 7:
                    mostrarListadoUsuarios();
                    break;
                case 8:
                    mostrarListadoPrestamos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa Gestion de Biblioteca...");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion !=0);
    }
    
    //Permite al usaurio ingresar info para agregar un nuevo libro a la biblioteca
    //Solicita y registra el tipo de libro, titulo, nombre de autor, fecha de publicacion, genero y disponibilidad del libro
    //Despues de crear el llibro, lo agrega a la biblioteca y muestra un mensaje de confirmacion
    private void agregarLibro(){
        System.out.println("Ingrese el tipo de libro(Revistas, Mangas, Literatura, Ciencia, Comics):");
        String tipoLibro = scanner.nextLine();
        
        System.out.println("Ingrese el título: ");
        String titulo = scanner.nextLine();
        
        System.out.println("Ingrese el nombre del autor: ");
        String nombreAutor = scanner.nextLine();
        Autor autor = new Autor(nombreAutor); // Crea un metodo de autor con el nombre proporcionado
        
        System.out.println("Ingrese la fecha de publicación: ");
        String fecha = scanner.nextLine();
        
        System.out.println("Ingrese el género;");
        String genero = scanner.nextLine();
        
        System.out.println("El libro está disponible? (true/flase):");
        boolean disponibilidad = scanner.nextBoolean();
        scanner.nextLine();
        
        //Crea una nueva instancia de libro con la info proporcionada
        Libro libro = new Libro(titulo, autor, fecha, genero, disponibilidad,tipoLibro);
        //Agrega el libro creado a la biblioteca utlizando el método agregarLibro de la clase Biblioteca
        biblioteca.agregarLibro(libro);
        System.out.println("Libro agregado correctamente");
    }
    //Permite al usuario ingresar información para agregar un nuevo autor a la biblioteca.
    //Solicita y registra el nombre, apellido, nacionalidad y fecha de nacimiento del autor.
    //Después de crear el autor, lo agrega a la biblioteca y muestra un mensaje de confirmación.
    private void agregarAutor() {
        System.out.println("Ingrese el nombre del autor:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del autor:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la nacionalidad del autor:");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento del autor:");
        String fechaNacimiento = scanner.nextLine();
        
        // Crea una nueva instancia de Autor con la información proporcionada.
        Autor autor = new Autor(nombre, apellido, nacionalidad, fechaNacimiento);
        // Agrega el autor creado a la biblioteca utilizando el método agregarAutor de la clase Biblioteca.
        biblioteca.agregarAutor(autor);
        System.out.println("Autor agregado correctamente.");
    }
    //Permite al usuario ingresar información para agregar un nuevo usuario a la biblioteca.
    //Solicita y registra el nombre, apellido, dirección, teléfono y número de identificación del usuario.
    //Después de crear el usuario, lo agrega a la biblioteca y muestra un mensaje de confirmación.
    private void agregarUsuario() {
        System.out.println("Ingrese el nombre del usuario:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del usuario:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la dirección del usuario:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el teléfono del usuario:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese el número de identificación del usuario:");
        String numIdentificacion = scanner.nextLine();
        
        // Crea una nueva instancia de Usuario con la información proporcionada.
        Usuario usuario = new Usuario(nombre, apellido, direccion, telefono, numIdentificacion);
        // Agrega el usuario creado a la biblioteca utilizando el método agregarUsuario de la clase Biblioteca.
        biblioteca.agregarUsuario(usuario);
        System.out.println("Usuario agregado correctamente.");
    }

        //Permite al usuario realizar un préstamo de un libro.
    //Muestra el listado de libros disponibles, solicita la selección de un libro por su índice,solicita el número de identificación del usuario que realizará el préstamo, y registra el préstamo en la biblioteca.
    //Si el libro está disponible y se encuentra el usuario con el número de identificación ingresado, se realiza el préstamo.
    //En caso contrario, muestra un mensaje de error apropiado.
    private void realizarPrestamo() {
        mostrarListadoLibrosDisponibles();

        System.out.println("Ingrese el índice del libro que desea prestar:");
        int indexLibro = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        List<Libro> disponibles = biblioteca.obtenerLibrosDisponibles();
        if (indexLibro < 0 || indexLibro >= disponibles.size()) {
            System.out.println("Índice de libro no válido.");
            return;
        }

        Libro libroSeleccionado = disponibles.get(indexLibro);

        System.out.println("Ingrese el número de identificación del usuario que realizará el préstamo:");
        String numIdentificacionUsuario = scanner.nextLine();

        Usuario usuarioSeleccionado = null;
        for (Usuario usuario : biblioteca.obtenerListaUsuarios()) {
            if (usuario.getNumeroDeIdentificacion().equals(numIdentificacionUsuario)) {
                usuarioSeleccionado = usuario;
                break;
            }
        }

        if (usuarioSeleccionado == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        // Fecha de préstamo y fecha de devolución estimada (podría ser ingresada por el usuario o generada automáticamente).
        System.out.println("Ingrese la fecha de préstamo (dd/mm/yyyy):");
        String fechaPrestamo = scanner.nextLine();

        System.out.println("Ingrese la fecha de devolución estimada (dd/mm/yyyy):");
        String fechaDevolucionEstimada = scanner.nextLine();
        
        // Intenta realizar el préstamo del libro seleccionado por el usuario seleccionado.
        biblioteca.realizarPrestamo(libroSeleccionado, usuarioSeleccionado, fechaPrestamo, fechaDevolucionEstimada);
        System.out.println("Préstamo registrado correctamente.");
    }
    //Muestra el listado completo de libros disponibles en la biblioteca.
    //Itera a través de la lista de libros obtenida de la biblioteca y muestra cada libro.
    //Cada libro se muestra utilizando su representación en formato de cadena (método toString()).
    private void mostrarListadoLibros() {
        System.out.println("Listado de libros:");
        for (Libro libro : biblioteca.obtenerListaLibros()) {
            System.out.println(libro);
        }
    }
    /**
     * Muestra el listado completo de autores registrados en la biblioteca.
     * Itera a través de la lista de autores obtenida de la biblioteca y muestra cada autor.
     * Cada autor se muestra utilizando su representación en formato de cadena (método toString()).
     */
    private void mostrarListadoAutores() {
        System.out.println("Listado de autores:");
        for (Autor autor : biblioteca.obtenerListaAutores()) {
            System.out.println(autor);
        }
    }
    /**
     * Muestra el listado completo de usuarios registrados en la biblioteca.
     * Itera a través de la lista de usuarios obtenida de la biblioteca y muestra cada usuario.
     * Cada usuario se muestra utilizando su representación en formato de cadena (método toString()).
     */
    private void mostrarListadoUsuarios() {
        System.out.println("Listado de usuarios:");
        for (Usuario usuario : biblioteca.obtenerListaUsuarios()) {
            System.out.println(usuario);
        }
    }
    /**
     * Muestra el listado completo de préstamos registrados en la biblioteca.
     * Itera a través de la lista de préstamos obtenida de la biblioteca y muestra cada préstamo.
     * Cada préstamo se muestra utilizando su representación en formato de cadena (método toString()).
     */
    private void mostrarListadoPrestamos() {
        System.out.println("Listado de préstamos:");
        for (Prestamo prestamo : biblioteca.obtenerListaPrestamos()) {
            System.out.println(prestamo);
        }
    }
    /**
     * Muestra el listado de libros disponibles en la biblioteca.
     * Itera a través de la lista de libros disponibles obtenida de la biblioteca y muestra cada libro con su título y nombre del autor.
     * Cada libro se muestra en formato indexado, seguido de su título y nombre del autor.
     * Utiliza la lista de libros disponibles obtenida de la biblioteca.
     */
    private void mostrarListadoLibrosDisponibles() {
        System.out.println("Listado de libros disponibles:");
        List<Libro> disponibles = biblioteca.obtenerLibrosDisponibles();
        for (int i = 0; i < disponibles.size(); i++) {
            System.out.println(i + ". " + disponibles.get(i).getTitulo() + " - " + disponibles.get(i).getAutor().getNombre());
        }
    }

    public static void main(String[] args) {
        GestionBiblioteca interfaz = new GestionBiblioteca();
        interfaz.menuPrincipal();
    }
}
