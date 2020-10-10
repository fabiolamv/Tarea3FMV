package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button singUp = new Button(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/header/nav/div/ul[2]/li[2]/a"), "[Registrate] Button on Main Page");


    public MainPage(){}
}
