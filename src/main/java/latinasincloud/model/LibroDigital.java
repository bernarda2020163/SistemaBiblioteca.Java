package latinasincloud.model;


// Clase LibroDigital: Hereda Libro y añade atributo formato
//(String). Sobrescribe mostrarInfo() para incluir el formato.

public class LibroDigital extends Libro {

    private String formato;

    // generar el cosntructor con los atributos que hereda del padre llamando desde la clase hija con super

    public LibroDigital(String isbn, String titulo, String autor, int anoPublicacion,String formato) {
        super(isbn,titulo, autor, anoPublicacion);
        this.formato = formato;

    }
    // generar los getter and setter para el atributo formato


    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    //sobreescribe el metodo mostrarInfo para incluir el formato

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // se llama método de la clase padre para la información base del libro
        System.out.println("\n FORMATO DIGITAL: " + formato); // se agrega la información específica del libro digital
    }
}
