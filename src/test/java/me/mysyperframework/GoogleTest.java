package me.mysyperframework;

import me.mysyperframework.Base.BaseTest;
import org.junit.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class GoogleTest extends BaseTest {

    GooglePage page = new GooglePage(driver);

    @Test
    public void testSearchText(){
        page.visit();

        page.searchMore("selenium");

        assertThat(textToBePresentInElementLocated(page.firstResult,
                "Selenium - Web Browser Automation"));

        page.searchMore(" chemical element");

        assertThat(textToBePresentInElementLocated(page.secondResult,
                        "Chemical Elements.com - Selenium (Se)"));
    }

    @Test
    public void testFollowFirstResult(){
        page.visit();

        page.searchMore("selenium");
        page.followFirstResult();
        assertThat(titleIs("Selenium - Web Browser Automation"));

    }
}
