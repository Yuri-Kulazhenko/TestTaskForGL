package logic.setup;

import logic.DriverTypes;
import logic.drivers.DriverManager;
import logic.drivers.WebDriverBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    protected static WebDriver driver;

    public BasePage() {
        driver = DriverManager.getInstance(DriverTypes.EDGE.name()).getDriver();

        new WebDriverBuilder(driver)
                .setScriptTimeout(6)
                .setFullscreenView()
                .setPageLoadTimeout(6)
                .getWebDriver();
    }

    protected WebElement getElement(By by){
        return driver.findElement(by);
    }

    protected List<WebElement> getElements(By by){
        return driver.findElements(by);
    }

}
