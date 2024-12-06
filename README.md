# 🌦️ Demo Eltiempo

Este proyecto es una aplicación de automatización de pruebas usando **Selenium**, **TestNG** y **Java**, que interactúa con el sitio web **Eltiempo.es** para realizar diversas validaciones de la predicción del clima. Como resultado final guardara una captura de Las Rozas a las 19:00.

## 🌟 Funcionalidades

- **Validaciones en la página de Eltiempo**:
  - Verificación de la información mostrada en el sitio web.
  - Automatización de pruebas en la interfaz de usuario.
  
- **Pruebas de la API de Eltiempo**:
    - Validación de las respuestas de la API.
    - Uso de **Postman** para realizar solicitudes a la API y validar respuestas.

## 💻 Tecnologías Utilizadas

- **Java 17**
- **Selenium WebDriver**
- **TestNG**
- **WebDriverManager**
- **Maven** (gestor de dependencias)
- **Postman** (para pruebas de API)
- **Newman** (para ejecutar colecciones de Postman desde la línea de comandos)

## 📋 Requisitos

Para ejecutar el proyecto, necesitas tener instalados:

- **Java 17+**
- **Maven 3.8+**
- **Newman 6.2+**
- **Newman-reporter-htmlextra@1.23.1+**

## 🚀 Ejecución de Pruebas

1. Clona el repositorio:
   git clone https://github.com/Martineez99/Demo_Eltiempo.git
2. Navega al directorio del proyecto
   cd Demo_Eltiempo
3. Asegúrate de tener Java 17 y Maven instalados y configurados correctamente.
4. Ejecuta las pruebas utilizando Maven
   mvn test


## 🚀 Ejecución de Pruebas API con Newman

1. Asegurese de tener installado Newman y Newman-reporter-htmlextra:

   - npm install -g newman
   - npm install -g newman-reporter-htmlextra
 2. Utilice las colecciones y los enviroments de postman
    - Colección: API_Eltiempo.postman_collection.json
    - Entorno: Provincias.postman_environment.json
3. Ejecute el comando para las pruebas:
    - newman run API_Eltiempo.postman_collection.json -e Provincias.postman_environment.json -r htmlextra --reporter-htmlextra-export ./reportes/htmlextra_{{DATE:yyyyMMdd_HHmmss}}.html

