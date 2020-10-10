package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModalPage {

    public TextBox emailTextBox= new TextBox(By.id("email"),"[email] textbox on Login Modal Page");
    public Button emailButton= new Button(By.id("step_one_submit"), "[registrarse con email] Button on Login Modal Page");
    public TextBox fullNameTextBox= new TextBox(By.id("full_name"),"[fullname] textbox on Login Modal Page");
    public TextBox passwordTextBox= new TextBox(By.id("pwd "),"[password] textbox on Login Modal Page");
    public CheckBox permanentLoginCheckBox= new CheckBox(By.id("permanent_login"),"[permanent login] checkbox on Login Modal Page");
    public Button signupButton= new Button(By.id("step_two_submit "),"[signup] button on Login Modal Page");

    public LoginModalPage(){}

}
