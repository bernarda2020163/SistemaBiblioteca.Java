## PROYECTO TAREA 5 : SISTEMA DE BIBLIOTECA 

### Desarrollado por  Valentina Cartagena , Romina Parra y Bernarda Rodríguez.
### Desarrollar un sistema de gestión de biblioteca en Java.

📌 Requisitos:

El repositorio de GitHub SistemaBiblioteca.Java contiene un Sistema de Gestión de Biblioteca simple desarrollado en Java, utilizando los principios de la Programación Orientada a Objetos (POO) y manejo de excepciones personalizadas.

Las funcionalidades y la estructura del programa son las siguientes:

* Estructura de Clases (POO)
El sistema se organiza en las siguientes clases para modelar los componentes de una biblioteca:

#### Clase Libro

*  Atributos: titulo (String), autor (String), añoPublicacion (int).

*  Métodos: Constructor, getters y setters, y mostrarInfo() para mostrar los detalles del libro.

#### Clase LibroDigital

* Herencia: Hereda de la clase Libro.

* Atributo Adicional: formato (String).

* Métodos: Sobrescribe el método mostrarInfo() para incluir la información del formato digital.

#### Clase Biblioteca

* Atributo: Una lista de libros (List<Libro>) para almacenar el inventario.

* Métodos Clave:

* agregarLibro(Libro libro): Añade un libro (físico o digital) a la lista de la biblioteca.

* buscarLibro(String titulo): Busca un libro por su título.

* Excepción Personalizada LibroNoEncontradoException

* Una excepción que extiende de Exception para ser lanzada específicamente cuando un libro solicitado no se encuentra en la biblioteca.

💼 Funcionalidades Obligatorias del Programa
El sistema está diseñado para realizar las siguientes operaciones mínimas de gestión:

* Creación de Libros	Permite crear al menos dos tipos de libros: uno normal (Libro) y uno digital (LibroDigital).
* Gestión de Inventario	La clase Biblioteca permite agregar estos libros a su lista de inventario.
* Búsqueda de Libros	Implementa la función de buscar un libro por su título.
* Manejo de Errores	Si el libro buscado no existe, el método buscarLibro lanza la excepción LibroNoEncontradoException. El programa principal debe capturar esta excepción y mostrar un mensaje claro al usuario (ej: "Libro no encontrado").

Este proyecto educativo esta enfocado en aplicar conceptos básicos y esenciales de Java como POO (herencia, encapsulamiento) y manejo avanzado de excepciones para simular la gestión de un pequeño inventario bibliotecario.


 📖 Documentación web: 

* api libros : https://isbndb.com/isbndb-api-documentation-v2
* Estructura del ISBN: https://camaradellibro.cl/estructura-isbn/

