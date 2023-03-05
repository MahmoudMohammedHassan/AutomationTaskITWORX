package stepDefinition;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage login = new LoginPage();

    String email = "testregister@aaa.com";
    String password = "Wakram_123";

    @When("User enters valid email and valid password")
    public  void validLogin(){
        login.Email().sendKeys(email);
        login.Password().sendKeys(password);
    }

    @And("User clicks the Login button")
    public void loginBtnClick() throws InterruptedException {
        login.loginBtn().click();
        Thread.sleep(1200);
    }

    @Then("User could login successfully")
    public void successfulLogin(){
        Assert.assertEquals("https://swinji.azurewebsites.net/Org#!/Reporting/",Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getCurrentUrl());
    }
}
