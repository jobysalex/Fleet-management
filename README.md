# Fleet Management Software API

## Índice

- [1. Preámbulo](#1-preámbulo)
- [2. Resumen del Proyecto](#2-resumen-del-proyecto)
- [3. Objetivos de Aprendizaje](#3-objetivos-de-aprendizaje)
- [4. Documentacion de Referencia](#4-documentacion-de-referencia)


---

## 1. Preámbulo

Aqui se espera explorar nuevas alternativas y técnicas para almacenar y consultar 
información, asegurando una experiencia óptima para el usuario en la API REST. 

Se aprovechará la Internet de las Cosas (IoT) para mejorar la gestión de Vehiculos, 
permitiendo el monitoreo en tiempo real de la ubicación y condiciones de los vehículos. 
Aunque se enfrentan desafíos en el manejo de grandes volúmenes de datos, se busca 
aprovechar al máximo el potencial de la IoT y contribuir al avance tecnológico con 
experiencia y conocimientos.


![FLEET MANAGEMENT](https://camo.githubusercontent.com/05ca6daefc29d67cd22b0a88c55c3b8cd59a097cfa7b1c95e98240bed5bc407c/68747470733a2f2f666972656261736573746f726167652e676f6f676c65617069732e636f6d2f76302f622f6c61626f7261746f7269612d39343565612e61707073706f742e636f6d2f6f2f666c6565742d6d616e6167656d656e742d6170692d6a6176612532467468756d622e6a70673f616c743d6d65646961)

## 2. Resumen del Proyecto

Este proyecto implica la creación de una API REST para un software de gestión de 
vehiculos. La API permitirá consultar las ubicaciones de los vehículos 
en tiempo real.

El proyecto tiene dos partes principales: 

- Primero, cargar información de archivos SQL en una base de datos PostgreSQL para 
facilitar su consulta y análisis. 
- Segundo, desarrollar una API REST que permita a los usuarios realizar consultas 
sobre esta información almacenada en la base de datos a través de peticiones HTTP. 

Los usuarios podrán acceder a tres endpoints específicos: uno para listar todos los taxis, 
otro para consultar todas las ubicaciones de un taxi dado su identificador y una fecha 
específica, y otro para obtener la última ubicación reportada por cada taxi. Además, se 
proporcionará una documentación clara y detallada en Swagger que describirá cómo utilizar 
estos endpoints, incluyendo métodos HTTP, URL, parámetros, encabezados, códigos de respuesta 
y ejemplos de cuerpo de solicitud y respuesta.

![FLEET MANAGEMENT ENDPOINTS](https://camo.githubusercontent.com/72765d4c2e0501900518846114f6069f8c5da05edef6eb0f0748d9339dc508a4/68747470733a2f2f666972656261736573746f726167652e676f6f676c65617069732e636f6d2f76302f622f6c61626f7261746f7269612d39343565612e61707073706f742e636f6d2f6f2f666c6565742d6d616e6167656d656e742d6170692d6a6176612532466578616d706c652d656e64706f696e742d6170692d726573742e706e673f616c743d6d65646961)


## 3. Objetivos de Aprendizaje

### Java
- Datos primitivos vs no primitivos
- Cadenas
- Arreglos
- Modificadores de acesso (public, private, protected)
- Uso de condicionales
- Uso de bucles (Loops)
- ArrayList
- Beans
- Anotaciones
- Initializr
- Spring Boot
- Controladores
- Servicios
- Spring Data JPA
- Entidad
- Repositorio
- RestController
- RequestMapping
- Esquema
- Asociaciones
- Programación Orientada a Objetos (OOP)
- Clases
- Objetos
- Métodos
- Atributos
- Constructores
- Encapsulamiento
- Abstracción
- Composición
- Interfaces
- Herencia (super, extends, override)
- Lenguaje de Modelado Unificado (UML, class diagrams)
- SQL
- Creacion y modificacion de Tablas.
- Operaciones CRUD
- Bases de Datos
- PostgreSQL


## 4. Documentacion de Referencia

Para mas informacion puedes consultar:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#using.devtools)


