package demo.hooks;

import demo.webdriver.WebdriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class WebdriverHooks {
  @Before(value = "@Web")
  public void initializeWebdriver() {
    WebdriverInstance.initialize();
  }

  @After(value = "@Web")
  public void quitWebdriver(Scenario scenario) {
    WebdriverInstance.quit();
  }
}
