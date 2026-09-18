# Sistema de Inventario

**Estudiante:** Francisco Castellón
**Curso:** Programación Orientada a Objetos
**Proyecto:** ACA Final — Mi primera aplicación orientada a objetos

## Descripción

Aplicación de consola en Java que simula el inventario de una pequeña tienda. Permite registrar productos, mostrarlos con el valor total del inventario, y buscarlos por código, aplicando los conceptos fundamentales de la Programación Orientada a Objetos.

## Funcionalidades

1. Registrar producto
2. Mostrar productos (incluye el valor total del inventario)
3. Buscar producto por código
4. Salir

## Clases utilizadas

- **Producto**: representa un producto individual, con sus atributos privados, constructor, getters/setters y método para mostrar su información.
- **Inventario**: contiene la lista de productos (ArrayList), y los métodos para agregar, mostrar y buscar productos.
- **ProductoNoEncontradoException**: excepción personalizada que se lanza cuando se busca un producto con un código que no existe.
- **Main**: contiene el menú principal por consola y la lógica de interacción con el usuario.

## Conceptos de POO aplicados

- Clases y objetos
- Atributos y métodos
- Encapsulamiento (atributos privados con getters/setters)
- Relación entre clases (Inventario contiene Producto)
- Arreglos (categorías del inventario)
- Listas y recorrido de listas (ArrayList<Producto>)
- Manejo de excepciones (try-catch y excepción personalizada)
- Menú por consola

## Instrucciones para ejecutar

1. Clonar o descargar este repositorio.
2. Abrir la carpeta del proyecto en un editor con soporte para Java (por ejemplo, VS Code con la extensión "Extension Pack for Java").
3. Ejecutar el archivo `Main.java`.
4. Seguir las instrucciones del menú en la consola.