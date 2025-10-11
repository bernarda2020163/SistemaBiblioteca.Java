## PROYECTO TAREA 5 : SISTEMA DE BIBLIOTECA 

### Desarrollado por  Valentina Cartagena , Romina Parra y Bernarda Rodríguez.
### Desarrollar un sistema de gestión de biblioteca en Java.

📌 Requisitos:

El repositorio de GitHub SistemaBiblioteca.Java contiene un Sistema de Gestión de Biblioteca simple desarrollado en Java, utilizando los principios de la Programación Orientada a Objetos (POO) con herencia, polimorfismo y manejo de excepciones personalizadas.

Las funcionalidades y la estructura del programa son las siguientes:

* Estructura de Clases (POO)
El sistema se organiza en las siguientes clases para modelar los componentes de una biblioteca:

#### Clase Libro

*  Atributos: isbn (String) ,titulo (String), autor (String), añoPublicacion (int).

*  Métodos: Constructor, getters y setters, y mostrarInfo() para mostrar los detalles del libro.

#### Clase LibroDigital

* Herencia: Hereda de la clase Libro.

* Atributo Adicional: formato (String).

* Métodos: Sobrescribe el método mostrarInfo() para incluir la información del formato digital.

#### Clase Biblioteca

* Atributo: Una lista de libros (List<Libro>) para almacenar el inventario.

* Métodos Clave:

* agregarLibro(Libro libro): Añade un libro (físico o digital) a la lista de la biblioteca.

* mostrarTodosLosLibros() : muestra todos los libros de la biblioteca con su informacion mediante el comportamiento (mostrarInfo() para mostrar los detalles del libro)

* buscarLibro(String titulo): Busca un libro por su título.

* borrarLibro(String titulo) : elimina un libro por titulo. 

* Excepción Personalizada LibroNoEncontradoException

* Una excepción que extiende de Exception para ser lanzada específicamente cuando un libro solicitado no se encuentra en la biblioteca.

 ### Funcionalidades Obligatorias del Programa 💼
El sistema está diseñado para realizar las siguientes operaciones mínimas de gestión:

* Creación de Libros	Permite crear al menos dos tipos de libros: uno normal (Libro) y uno digital (LibroDigital).
* Gestión de Inventario	La clase Biblioteca permite agregar estos libros a su lista de inventario.
* Búsqueda de Libros	Implementa la función de buscar un libro por su título.
* Extra: eliminar libro por su titulo.
* Manejo de Errores	Si el libro buscado no existe, el método buscarLibro lanza la excepción LibroNoEncontradoException. El programa principal debe capturar esta excepción y mostrar un mensaje claro al usuario (ej: "Libro no encontrado").

Este proyecto educativo esta enfocado en aplicar conceptos básicos y esenciales de Java como POO (herencia, encapsulamiento) y manejo avanzado de excepciones para simular la gestión de un pequeño inventario bibliotecario.

  ### Documentación web 📖: 

  ISBN (Número Estándar Internacional de Libro) es un código único de 13 dígitos que identifica un libro y su edición específica a nivel mundial, permitiendo su localización y gestión en catálogos y sistemas de ventas. Este código codifica información sobre el país,
  la editorial y el título del libro, y es esencial para la producción, circulación y comercialización editorial de una publicación.
  
* api libros : https://isbndb.com/isbndb-api-documentation-v2  
* Estructura del ISBN: https://camaradellibro.cl/estructura-isbn/ 

### USO :

1) Ejecutar la clase Main.java. Por defecto tiene cargado un inventario pequeño de 4 libros.
   
2) Interactuar con el menú del Sistema de biblioteca. (agregarLibro, mostrarTodosLosLibros, buscarLibro , borrarLibro, salir)
   
3) Validación de datos mediante excepciones personalizadas.

A continuación se muestra un ejemplo de la ejecución del programa Main.java, que inicia la biblioteca, agrega algunos libros predefinidos y luego presenta un menú de opciones para interactuar con el sistema.

### Ejecución de Ejemplo del Programa
La ejecución comienza con la inicialización del sistema y la carga de los libros iniciales:

__1) Inicio y Carga Inicial de Libros__:
Se crean y agregan cuatro libros predefinidos (Sobredosis, Vida Sin Límites, Cien Años de Soledad, El Código Da Vinci) a la biblioteca.

##### Salida de la Consola al Inicio:

==== BIENVENIDO AL SISTEMA DE BIBLIOTECA ====

--- Agregando libros a la Biblioteca ---
El libro ha sido agregado: SOBREDOSIS  
El libro ha sido agregado: VIDA SIN LIMITES  
El libro ha sido agregado: CIEN AÑOS DE SOLEDAD  
El libro ha sido agregado: EL CÓDIGO DA VINCI   

-------- SISTEMA DE BIBLIOTECA ----------  
[1] Añadir libro  
[2] Mostrar libros disponibles  
[3] Buscar libro  
[4] Salir de la biblioteca  
> Ingrese una opción:  

__2) Opción 2: Mostrar libros disponibles__:

El usuario ingresa 2 para ver el inventario.

##### Entrada del Usuario: 2

##### Salida de la Consola:

--- Libros en la Biblioteca (4) ---

Libro Libro:   
ISBN: 9569961848   
TITULO: SOBREDOSIS   
AUTOR: ALBERTO FUGUET   
AÑO DE PUBLICACION: 1990  

Libro LibroDigital:   
ISBN: 9780307589750   
TITULO: VIDA SIN LIMITES   
AUTOR: NICK VUJICIC   
AÑO DE PUBLICACION: 2010  
FORMATO DIGITAL: epub  

Libro Libro:   
ISBN: 9789968411226    
TITULO: CIEN AÑOS DE SOLEDAD   
AUTOR: GABRIEL GARCÍA MÁRQUEZ   
AÑO DE PUBLICACION: 1967  

Libro LibroDigital:   
ISBN: 8482398725   
TITULO: EL CÓDIGO DA VINCI   
AUTOR: DAN BROWN   
AÑO DE PUBLICACION: 2003  
FORMATO DIGITAL: PDF  


-------- SISTEMA DE BIBLIOTECA ----------  
[1] Añadir libro  
[2] Mostrar libros disponibles  
[3] Buscar libro  
[4] Salir de la biblioteca  
> Ingrese una opción:  

__3) Opción 3: Buscar libro (Búsqueda exitosa)__

El usuario ingresa 3 y busca un libro existente, como "SOBREDOSIS" (la búsqueda no distingue mayúsculas/minúsculas debido al uso de equalsIgnoreCase en Biblioteca.java).

##### Entrada del Usuario: 3
sobredosis

##### Salida de la Consola:

Ingrese el titulo del libro que necesita buscar : sobredosis

--- Búsqueda del libro 'sobredosis' ---  
¡Búsqueda Exitosa! Información del libro encontrado:

Libro Libro:   
ISBN: 9569961848   
TITULO: SOBREDOSIS   
AUTOR: ALBERTO FUGUET   
AÑO DE PUBLICACION: 1990  


-------- SISTEMA DE BIBLIOTECA ----------  
[1] Añadir libro  
[2] Mostrar libros disponibles  
[3] Buscar libro  
[4] Salir de la biblioteca  
> Ingrese una opción:  

__4) Opción 3: Buscar libro (Búsqueda fallida y manejo de excepción)__

El usuario ingresa 3 y busca un libro inexistente, lo que dispara la excepción LibroNoEncontradoException.

##### Entrada del Usuario: 3
Caballo de Troya

##### Salida de la Consola:

Ingrese el titulo del libro que necesita buscar : Caballo de Troya

--- Búsqueda del libro 'Caballo de Troya' ---  
¡Error! La búsqueda falló para: Caballo de Troya  
Mensaje: El libro de titulo Caballo de Troya no ha sido encontrado en la biblioteca.  


-------- SISTEMA DE BIBLIOTECA ----------  
[1] Añadir libro  
[2] Mostrar libros disponibles  
[3] Buscar libro  
[4] Salir de la biblioteca  
> Ingrese una opción:  

#### 5) Opción 1: Añadir un nuevo libro (Recurso Electrónico)

El usuario ingresa 1 para agregar un nuevo LibroDigital.

##### Entrada del Usuario: 1  
1234567890123 (ISBN)  
Dune (título)  
Frank Herbert (autor)  
1965 (año de publicación)  
1 (opción para Recurso Electrónico)  

##### Salida de la Consola: 

Ingrese el ISBN del libro que desea insertar: 1234567890123  
Ingrese el título del libro que desea insertar: Dune  
Ingrese el nombre del autor del libro: Frank Herbert  
Ahora, ingrese el año de publicación del libro: 1965  
Finalmente, ingrese la opción de formato del libro:  
1. Recurso Electrónico  
2. Recurso Físico  
1
El libro ha sido agregado: DUNE  

-------- SISTEMA DE BIBLIOTECA ----------  
[1] Añadir libro  
[2] Mostrar libros disponibles  
[3] Buscar libro  
[4] Salir de la biblioteca  
> Ingrese una opción:  

#### 6) Opción 4: Salir del programa

##### El usuario ingresa 4.

##### Entrada del Usuario: 4

##### Salida de la Consola:

¡Gracias por utilizar nuestros servicios!

==== FIN DEL SISTEMA DE BIBLIOTECA====


