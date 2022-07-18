package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SearchPages extends BasePageObject {

    public Select getFilterProducts() {
        return new Select(getDriver().findElement(By.className("product_sort_container")));
    }

    public void chooseFilter(String value) {
        getFilterProducts().selectByValue(value);
    }

    public String isPresentProductInTheFirstList(String value) {
        return getTextProductInventory(value);
    }
}
