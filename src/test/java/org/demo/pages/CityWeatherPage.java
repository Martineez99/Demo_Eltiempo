package org.demo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CityWeatherPage extends BasePage {

    // Selector del cuadro de horas
    private final By hoursTab = By.xpath("//a[contains(@href, 'por_hora') and text()='Horas']");

    // Selector de la fila de las 19:00
    private final By time19Row = By.xpath("//p[@class='time' and text()='19:00']/following::i[1]");

    public CityWeatherPage(WebDriver driver) {
        super(driver);
    }

    public void selectHoursTab() {
        WebElement hoursTabElement = waitForVisibility(hoursTab);
        hoursTabElement.click();
    }

    public void scrollToTime19() {
        WebElement time19Element = waitForVisibility(time19Row);
        scrollIntoView(time19Element);
    }

    public void clickDropdownButton19() {
        WebElement dropdownButton = waitForVisibility(time19Row);
        dropdownButton.click();
    }
}
