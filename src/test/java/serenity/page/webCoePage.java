package serenity.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by arushsin on 5/3/2016.
 */
@DefaultUrl("http://in-air-aciscoe1/webcoe2")
public class webCoePage extends PageObject {

    WebElement search;

    public void searchFor(String keywords) {
        search.sendKeys(keywords, Keys.ENTER);
    }

}
