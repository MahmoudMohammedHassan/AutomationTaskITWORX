package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class LoginPage {

    public WebElement Email(){

        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement Password(){

        return Hooks.driver.findElement(By.id("inputPassword"));
    }

    public WebElement loginBtn(){

        return Hooks.driver.findElement(By.id("btnLogin"));
    }
}
