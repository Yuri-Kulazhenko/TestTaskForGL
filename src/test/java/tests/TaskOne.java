package tests;

import logic.setup.BasePage;
import logic.steps.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TaskOne extends BasePage {

    @Before
    public void install(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @After
    public void cleanUP(){
        driver.close();
    }


    @Test
    public void test001_() {
        driver.get("http://demowebshop.tricentis.com/");
        new HomePageSteps()
                .switchToComputers()
                .switchToDesktop()
                .checkCountItems()
                .checkSort()
                .addToCart()
                .setParameters()
                .addToCart()
                .clickToCart()
                .isElementPresent(By.xpath("//*[@class='product-name']"));
    }

    @Test
    public void test002 (){
        driver.get("http://demowebshop.tricentis.com/build-your-own-expensive-computer-2");
        new BuildExpensiveComputerPageSteps()
                .setProcessor()
                .setRAM()
                .setSoftware1()
                .setSoftware2()
                .setSoftware3()
                .addToCart()
                .clickToCart()
                .remoteForCart()
                .updateCart()
                .isElementPresent(By.xpath("//*[@class='product-name']"));
    }
}
