package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class SearchPages extends BasePageObject {

    public void clickFilterButton() {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
        clickOn(element);
    }

    public void chooseFilter(String value) {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option["+value+"]");
        clickOn(element);
    }

    public void matchedProduct(String value) {
        By element = By.xpath("//*[@id=\"item_"+value+"_title_link\"]/div");
        isPresent(element);
    }
}
