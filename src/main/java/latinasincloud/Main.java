package latinasincloud;

import latinasincloud.exception.LibroNoEncontradoException;
import java.util.Scanner;

import latinasincloud.model.Biblioteca;
import latinasincloud.model.Libro;
import latinasincloud.model.LibroDigital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//Funcionalidades Obligatorias
// crear al menos 2 libros (1 normal y 1 digital).
// Agregarlos a la biblioteca.
// Buscar un libro por título: Si no existe, capturar la
// excepción y mostrar un mensaje claro.


public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==== BIENVENIDO AL SISTEMA DE BIBLIOTECA ====");

        int opcion;
        Biblioteca miBiblioteca;
        miBiblioteca = new Biblioteca();

        // --- 1. Crear al menos 2 libros (1 normal y 1 digital) ---
        Libro libroFisico = new Libro("9569961848", "Sobredosis", "Alberto Fuguet", 1990);
        LibroDigital ebook = new LibroDigital("9780307589750", "Vida Sin Limites", "Nick Vujicic", 2010, "epub");
        Libro libroNormal = new Libro("9789968411226 ", "Cien Años de Soledad", "Gabriel García Márquez", 1967);
        LibroDigital libroDigital = new LibroDigital("8482398725", "El Código Da Vinci", "Dan Brown", 2003, "PDF");

        // --- 2. AAgregarlos a la biblioteca.---
        System.out.println("\n--- Agregando libros a la Biblioteca ---");
        miBiblioteca.agregarLibro(libroFisico);
        miBiblioteca.agregarLibro(ebook);
        miBiblioteca.agregarLibro(libroNormal);
        miBiblioteca.agregarLibro(libroDigital);

        /*
        // -----------------------------------------------------------------
        // --- 3. Buscar y manejar la excepción ----------------------------
        // -----------------------------------------------------------------

        // A) Caso de búsqueda EXITOSA  Libro Existente
        String tituloA = "Sobredosis";
        System.out.println("\n--- Búsqueda del libro '" + tituloA + "' ---");
        try {
            Libro encontrado = miBiblioteca.buscarLibro(tituloA);
            System.out.println("¡Búsqueda Exitosa! Información del libro encontrado:");
            encontrado.mostrarInfo();
        } catch (LibroNoEncontradoException e) {
            System.err.println("¡Error! La búsqueda falló para: " + tituloA);
            System.err.println("Mensaje: " + e.getMessage());
        }

        // B) Caso de búsqueda FALLIDA (captura de la excepción obligatoria) Libro Inexistente
        String tituloB = "Caballo de Troya";
        System.out.println("\n--- Búsqueda del libro '" + tituloB + "' ---");
        try {
            Libro encontrado = miBiblioteca.buscarLibro(tituloB);
            // Esto solo se ejecuta si NO hay excepción
            encontrado.mostrarInfo();
        } catch (LibroNoEncontradoException e) {
            // Se captura la excepción y se muestra un mensaje CLARO al usuario.
            System.err.println("ERROR: El libro no se pudo encontrar en la biblioteca.");
            System.err.println("MENSAJE CLARO: " + e.getMessage());
        }
        System.out.println("  "); */

        //  --- *. Despliegue de menú para interacción con el usuario

        do {
            mostrarMenu();// el menú se define como un método mas abajo

            // Usar try-catch para manejar entradas no numéricas
            // haciendo uso de Manejo de excepciones (try y catch)
            // para errores y para parsear el ingreso de la opcion en entero con la limpieza de buffer
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el ISBN del libro que desea insertar: ");
                        String isbn = sc.nextLine();

                        System.out.print("Ingrese el título del libro que desea insertar: ");
                        String titulo = sc.nextLine();

                        System.out.print("Ingrese el nombre del autor del libro: ");
                        String autor = sc.nextLine();

                        System.out.print("Ahora, ingrese el año de publicación del libro: ");
                        int publicacion = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Finalmente, ingrese la opción de formato del libro:");
                        System.out.println("1. Recurso Electrónico");
                        System.out.println("2. Recurso Físico");

                        int opcionRecurso;
                        opcionRecurso = sc.nextInt();
                        sc.nextLine(); // Dejamos el nextLine() si después vamos a leer Strings

                        if (opcionRecurso == 1) {
                            String formato;
                            System.out.println("Ingrese el formato del libro (EPUB, PDF, MOBI, AZW):");
                            formato = sc.nextLine();
                            miBiblioteca.agregarLibro(new LibroDigital(isbn, titulo, autor, publicacion, formato));
                        } else {
                            miBiblioteca.agregarLibro(new Libro(isbn, titulo, autor, publicacion));
                        }
                        break;
                    case 2:
                        miBiblioteca.mostrarTodosLosLibros();
                        System.out.println(" ");
                        break;
                    case 3:
                        // -----------------------------------------------------------------
                        // --- 3. Buscar y manejar la excepción ----------------------------
                        // -----------------------------------------------------------------

                        //
                        System.out.print("Ingrese el titulo del libro que necesita buscar: ");
                        titulo = sc.nextLine();

                        System.out.println("\n--- Búsqueda del libro '" + titulo + "' ---");
                        try {
                            Libro encontrado = miBiblioteca.buscarLibro(titulo);
                            System.out.println("¡Búsqueda Exitosa! Información del libro encontrado:");
                            encontrado.mostrarInfo();
                        } catch (LibroNoEncontradoException e) {
                            System.err.println("¡Error! La búsqueda falló para: " + titulo);
                            System.err.println("Mensaje: " + e.getMessage());
                        }
                        System.out.println("  ");
                        break;
                    case 4:
                        System.out.print("Ingrese el titulo del libro que necesite eliminar del sistema: ");
                        titulo = sc.nextLine();

                        System.out.println("\n--- Búsqueda del libro a eliminar '" + titulo + "' ---");
                        try {
                            Libro encontrado = miBiblioteca.buscarLibro(titulo);
                            System.out.println("¡Búsqueda Exitosa! Información del libro a eliminar:");
                            encontrado.mostrarInfo();
                            miBiblioteca.borrarLibro(titulo);
                        } catch (LibroNoEncontradoException e) {
                            System.err.println("¡Error! El libro no se encuentra registrado");
                            System.err.println("Mensaje: " + e.getMessage());
                        }
                        System.out.println("  ");
                        break;
                    case 5:
                        System.out.println("¡Gracias por utilizar nuestros servicios!");
                        break;
                    default:
                        System.out.println("Opción incorrecta. Vuelva a intentar.");
                }
            } catch (NumberFormatException e) { //por si ingresa una letra o palabra
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                opcion = 0; // Para que el bucle continúe
            }
        } while (opcion != 5);
        sc.close();//buena práctica para ahorrar recursos

        System.out.println("\n==== FIN DEL SISTEMA DE BIBLIOTECA====");
    }


    // definiendo método menú de opciones Sistema de Gestión de Biblioteca
    private static void mostrarMenu() {
        System.out.println("\n-------- SISTEMA DE BIBLIOTECA ----------");
        System.out.println("[1] Añadir libro");
        System.out.println("[2] Mostrar libros disponibles");
        System.out.println("[3] Buscar libro");
        System.out.println("[4] Eliminar libro");
        System.out.println("[5] Salir de la biblioteca");
        System.out.println("> Ingrese una opción:");
    }


}