package org.demo.pages;

import org.demo.utils.ConfigLoader;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void scrollIntoView(org.openqa.selenium.WebElement element) {
        ((JavascriptExecutor) driver).executeScript("var element = arguments[0];" +
                "var rect = element.getBoundingClientRect();" +
                "window.scrollBy(0, rect.top + window.pageYOffset - window.innerHeight / 2);", element);
    }

    protected WebElement waitForElement (By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private String getCurrentTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        return now.format(formatter);
    }


    public void takeScreenshot(String screenshotName) {
        try {
            String timestamp = getCurrentTimestamp();

            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Obtener la ruta del archivo de configuración
            ConfigLoader configReader = new ConfigLoader();
            String screenshotPath = ConfigLoader.getProperty("screenshot.path");

            // Crear la ruta y guardar la captura
            File destination = new File(screenshotPath + screenshotName + "_" + timestamp + ".png");
            FileHandler.copy(source, destination);
            System.out.println("Captura de pantalla guardada en: " + destination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
