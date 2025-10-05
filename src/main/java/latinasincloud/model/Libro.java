package latinasincloud.model;

// Clase Libro.
// Atributos: titulo (String), autor (String),
//añoPublicacion (int). Métodos: Constructor, getters/setters
//y mostrarInfo().

public class Libro { // creo la clase publica Libro clase Padre
    // define tres atributos  privados
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public Libro() {
    }  // contructor vacio por defecto

    // generar un contructor con todos los parámetros

    public Libro(String isbn, String titulo, String autor, int anoPublicacion) {
        // En el constructor también aplicamos la conversión a mayúsculas
        this.isbn = isbn;
        this.titulo = titulo.toUpperCase(); // <-- Aplicado aquí
        this.autor = autor.toUpperCase();   // <-- Aplicado aquí
        this.anoPublicacion = anoPublicacion;
    }

    //  ISBN (Número Estándar Internacional de Libro) es un código único de 13 dígitos que identifica un libro y su edición específica a nivel mundial,
    //  permitiendo su localización y gestión en catálogos y sistemas de ventas. Este código codifica información sobre el país,
    //  la editorial y el título del libro, y es esencial para la producción, circulación y comercialización editorial de una publicación.

    // aplicar getters and Setters para encapsulamiento de todos los parámetros

    // --- Getters ---

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    // --- Setters (con la mejora para mayúsculas) ---

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Método mejorado: convierte el título a mayúsculas antes de asignarlo
    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase(); // <-- ¡La clave está aquí!
    }

    // Método mejorado: convierte el autor a mayúsculas antes de asignarlo
    public void setAutor(String autor) {
        this.autor = autor.toUpperCase();   // <-- ¡La clave está aquí!
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }


    //definir un comportamiento que es un método mostrarInfo() considerando los atributos de la clase

    @Override
    public String toString() {
        /*return "---- Muestra información del libro ----" +
                "\n ISBN: " + isbn +
                "\n TITULO: " + titulo +
                "\n AUTOR: " + autor +
                "\n AÑO DE PUBLICACION: " + anoPublicacion;*/
        return String.format("\nLibro %s: \nISBN: %s \nTITULO: %s \nAUTOR: %s \nAÑO DE PUBLICACION: %d", getClass().getSimpleName(), isbn, titulo, autor,anoPublicacion);
    }

    // agregando a método de comportamiento 'mostrarInfo()'
    public void mostrarInfo() {
        // Al imprimir el objeto con System.out.println(), Java llama automáticamente a toString()  System.out.println(this);
        System.out.println(this.toString());
    }



    /* public void mostrarInfo() {
        System.out.println("---- Muestra información del libro ----");
        System.out.println("\n ISBN: " + isbn);
        System.out.println("\n TITULO " + titulo);
        System.out.println("\n AUTOR: " + autor);
        System.out.println("\n AÑO DE PUBLICACION: " + anoPublicacion);

     */

    }

