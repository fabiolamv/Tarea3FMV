package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginModalPage;
import pages.MainPage;
import session.Session;


public class LoginTodoistTest {

    LoginModalPage loginModalPage = new LoginModalPage();
    MainPage mainPage = new MainPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("http://todoist.com/");
    }

    @DisplayName("verify The Login Using User And Password")
    @Description("This test case is to verify verify The Login Using User And Password")
    @Owner("Fabiola Monrroy")
    @Test
    public void verifyTheLoginUsingUserAndPassword() throws InterruptedException {
        mainPage.singUp.click();
        loginModalPage.emailTextBox.type("test15@test.com");
        loginModalPage.emailButton.click();
        loginModalPage.fullNameTextBox.type("test15@test.com");
        loginModalPage.passwordTextBox.type("testfa123456");
        loginModalPage.permanentLoginCheckBox.click();
        loginModalPage.signupButton.click();

        // Verification
        Thread.sleep(2000);
        Assert.assertFalse("ERROR , no se pudo realizar el login!",loginModalPage.signupButton.isDisplayedOnPage());
    }

    @After
    public void after(){
        Session.getInstance().closeBrowser();
    }

}


