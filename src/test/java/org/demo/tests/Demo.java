package org.demo.tests;

import org.demo.pages.CityWeatherPage;
import org.demo.pages.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {

    private WebDriver driver;
    private HomePage homePage;
    private String urlTiempo = "https://www.eltiempo.es/";

    @BeforeClass
    public void setUp() {
        // Configurar y descargar automáticamente el ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximizar ventana
        // Establecer la posición de la ventana en la pantalla principal (coordenadas 0,0)
        driver.manage().window().setPosition(new Point(0, 0));
        // Establecer el tamaño de la ventana
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get(urlTiempo);   // Navegar a la página web

        homePage = new HomePage(driver);

        homePage.acceptCookies();

    }

    @Test
    public void testSearchMadrid() throws InterruptedException {

        homePage.searchCity("Madrid");
        homePage.clickLasRozasResult();

        // Accede a la página de la ciudad y realiza las acciones
        CityWeatherPage cityWeatherPage = new CityWeatherPage(driver);

        cityWeatherPage.selectHoursTab();
        cityWeatherPage.scrollToTime19();
        cityWeatherPage.clickDropdownButton19();
        cityWeatherPage.takeScreenshot("Las_Rozas");

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Cerrar el navegador y limpiar el WebDriver
        }
    }
}
