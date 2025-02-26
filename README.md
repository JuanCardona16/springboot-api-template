# 📚 Plantilla API REST con Spring Boot (Borrador)

Esta es una plantilla para construir una API REST utilizando **Spring Boot**, siguiendo una metodología y arquitectura de trabajo eficiente y escalable.

## 🏗️ Arquitectura del Proyecto

El proyecto sigue la arquitectura estándar de **Spring Boot**, organizada de la siguiente manera:

### 📂 `src/main/java` - Código fuente principal

```
com.tuapp  # Paquete base de la aplicación
├── config       # Configuraciones generales (seguridad, CORS, etc.)
├── controllers  # Controladores REST que manejan las solicitudes HTTP
├── exceptions   # Definición de excepciones personalizadas y su manejo global
├── models       # Definición de las entidades y modelos de datos
├── repositories # Interfaces que extienden JpaRepository para interactuar con la base de datos
├── services     # Lógica de negocio y servicios que interactúan con los repositorios
└── utils        # Clases utilitarias y helpers
```

### 📂 `src/main/resources` - Recursos de la aplicación

```
application.properties / application.yml  # Archivo de configuración principal de Spring Boot
static/          # Archivos estáticos (HTML, CSS, JavaScript, etc.)
templates/       # Plantillas Thymeleaf u otros motores de plantillas
mappings/        # Archivos de mapeo para ORMs como Hibernate
```

## 🗂️ Descripción de Carpetas y Archivos

- **`.mvn/`**: Archivos relacionados con Maven Wrapper.
- **`src/`**: Código fuente y recursos principales.
- **`.env`**: Archivo de variables de entorno para configuración sensible.
- **`.gitattributes`**: Configuración para manejo de archivos en Git.
- **`.gitignore`**: Lista de archivos y carpetas ignorados por Git.
- **`mvnw` y `mvnw.cmd`**: Scripts para ejecutar Maven Wrapper.
- **`pom.xml`**: Archivo de configuración de Maven con dependencias y plugins.

## 🚀 Cómo Empezar

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/JuanCardona16/plantilla-api-rest-sprint-boot.git
cd plantilla-api-rest-sprint-boot
```

### 2️⃣ Configurar el entorno

- Renombra el archivo `.env.example` a `.env` y ajusta las variables necesarias.

### 3️⃣ Construir y ejecutar la aplicación

#### 🔹 Usando Maven Wrapper:
```bash
./mvnw clean install
./mvnw spring-boot:run
```

#### 🔹 O directamente con Maven:
```bash
mvn clean install
mvn spring-boot:run
```

## 🛠️ Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Spring Boot**: Framework para facilitar la creación de APIs REST.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.
- **JPA/Hibernate**: Para la persistencia y manejo de datos.
- **Lombok**: Librería para reducir código boilerplate.

## 📄 Licencia

Este proyecto está bajo la **Licencia MIT**. Consulta el archivo `LICENSE` para más detalles.



