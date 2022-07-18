package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class SearchPages extends BasePageObject {

//    public void clickFilterButton() {
//        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
//        clickOn(element);
//        select("product_sort_container");
//    }

    public void chooseFilter(String value) {
        selectByValue(value);
    }

    public void isPresentProduct(String value) {
        By element = By.xpath("//*[@id=\"item_"+value+"_title_link\"]/div");
        isPresent(element);
    }
}
