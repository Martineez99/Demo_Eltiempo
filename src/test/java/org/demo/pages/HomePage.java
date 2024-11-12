package org.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private final By searchBox = By.id("term");
    private final By suggestionListLasRozas = By.xpath("//p[@class='poi-title' and text()='Las Rozas de Madrid']");
    private final By acceptCookiesButton = By.xpath("//a[text()='Aceptar y continuar gratis']"); // Ajusta el selector según sea necesario


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchCity(String city) {
        WebElement searchCity = waitForElement(searchBox);
        searchCity.sendKeys(city);
    }

    public void clickLasRozasResult() {
        WebElement result = waitForVisibility(suggestionListLasRozas);
        result.click();
    }

    public void acceptCookies() {
        try {
            WebElement cookiesButton = waitForVisibility(acceptCookiesButton);
            cookiesButton.click();
        } catch (Exception e) {
            System.out.println("Botón de cookies no encontrado o ya fue aceptado.");
        }
    }

}

