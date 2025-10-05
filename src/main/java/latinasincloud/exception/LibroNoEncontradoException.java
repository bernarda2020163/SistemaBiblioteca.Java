package latinasincloud.exception;
// esta clase hereda desde la clase RuntimeException

public class LibroNoEncontradoException extends RuntimeException {
    // aqui esta el constructor y la palabra super
    public LibroNoEncontradoException(String message) {
        super(message);
    }
}
