package by.ITAcademy.MPA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(LoginXpath.BUTTON_LOGIN_XPATH)).click();
    }

    public String getErrorEmptyNickOrEmailMessage() {
        return driver.findElement(By.xpath(LoginXpath.OUTPUT_ERROR_EMPTY_NICK_OR_EMAIL_XPATH)).getText();
    }

    public String getErrorEmptyPasswordMessage() {
        return driver.findElement(By.xpath(LoginXpath.OUTPUT_ERROR_EMPTY_PASSWORD_XPATH)).getText();
    }
}
