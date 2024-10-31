package by.ITAcademy.MPA;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.onliner.by/");
        loginPage.clickButtonEnterLoginPage();
    }

    @Test
    public void noCredentialsTest(){
        loginPage.clickButtonLogin();

        Assertions.assertEquals(LoginMessage.EMPTY_NICK_OR_EMAIL, loginPage.getErrorEmptyNickOrEmailMessage());
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD, loginPage.getErrorEmptyPasswordMessage());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
