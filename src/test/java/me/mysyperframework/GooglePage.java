package me.mysyperframework;

import me.mysyperframework.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage {

    By firstResult = by(".srg .g:nth-child(1)");

    By secondResult = by(".srg .g:nth-child(2)");

    public GooglePage(WebDriver driver){
        super(driver);
    }

    public void visit(){
        open("http://google.com/ncr");
    }

    public void searchMore(String text){
        $(By.name("q")).sendKeys(text, Keys.ENTER);
    }

    public void followFirstResult(){
        $(firstResult).findElement(by(".r a")).click();
    }
}
