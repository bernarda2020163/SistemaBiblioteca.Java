## PROYECTO TAREA 5 : SISTEMA DE BIBLIOTECA 

### Desarrollado por  Valentina Cartagena , Romina Parra y Bernarda Rodríguez.
### Desarrollar un sistema de gestión de biblioteca en Java.

📌 Requisitos:

* Estructura de Clases (POO)

* Clase Libro. Atributos: titulo (String), autor (String), añoPublicacion (int). Métodos: Constructor, getters/setters y mostrarInfo().
* Clase LibroDigital: Hereda Libro y añade atributo formato (String). Sobrescribe mostrarInfo() para incluir el formato.
* Clase Biblioteca: Lista de libros (List<Libro>).
Métodos:
agregarLibro(Libro libro), buscarLibro(String titulo): Lanza
LibroNoEncontradoException si no existe.
* Excepción Personalizada: LibroNoEncontradoException (extiende Exception).
  
💼 Funcionalidades Obligatorias: 
* Crear al menos 2 libros (1 normal y 1 digital).
* Agregarlos a la biblioteca.
* Buscar un libro por título: Si no existe, capturar la * excepción y mostrar un mensaje claro

 📖 Documentación web: 

* api libros : https://isbndb.com/isbndb-api-documentation-v2
* Estructura del ISBN: https://camaradellibro.cl/estructura-isbn/

