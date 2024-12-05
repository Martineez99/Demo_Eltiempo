# 🌦️ Demo Eltiempo

Este proyecto es una aplicación de automatización de pruebas usando **Selenium**, **TestNG** y **Java**, que interactúa con el sitio web **Eltiempo.es** para realizar diversas validaciones de la predicción del clima. Como resultado final guardara una captura de Las Rozas a las 19:00.

### 🌟 Descripción de las Pruebas Automatizadas

Este proyecto incluye una automatización que simula las siguientes acciones en la página [El Tiempo](https://www.eltiempo.es/):

1. **Acceder a la página principal** de El Tiempo.
2. **Buscar "Madrid"** en el cuadro de búsqueda y seleccionar **"Las Rozas de Madrid"**.
3. **Acceder a la página del tiempo** y seleccionar la vista por horas.
4. **Hacer scroll** hasta llegar a la hora **19:00** del día.
5. **Hacer clic** en el desplegable de la fila de las 19:00.
6. **Captura de pantalla** del resultado, que se guarda en `src/test/resources/screenshots`.

## 💻 Tecnologías Utilizadas

- **Java 17**
- **Selenium WebDriver**
- **TestNG**
- **WebDriverManager**
- **Maven** 

## 📋 Requisitos

Para ejecutar el proyecto, necesitas tener instalados:

- **Java 17+**
- **Maven 3.8+**

## 🚀 Ejecución de Pruebas

1. Clona el repositorio:
   git clone https://github.com/Martineez99/Demo_Eltiempo.git
2. Navega al directorio del proyecto
   cd Demo_Eltiempo
3. Asegúrate de tener Java 17 y Maven instalados y configurados correctamente.
4. Ejecuta las pruebas utilizando Maven
   mvn test


