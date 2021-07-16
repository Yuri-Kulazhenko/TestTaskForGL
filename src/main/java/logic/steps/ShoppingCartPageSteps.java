package logic.steps;

import logic.pages.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class ShoppingCartPageSteps extends ShoppingCartPage {

    private final ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageSteps() {
        this.shoppingCartPage = new ShoppingCartPage();
    }

    public ShoppingCartPageSteps remoteForCart() {
        getElement(shoppingCartPage.remote_for_cart).click();
        return this;
    }

    public ShoppingCartPageSteps updateCart() {
        getElement(shoppingCartPage.update_cart).click();
        return this;
    }

    public void isElementPresent(By by) throws NoSuchElementException {
        driver.findElement(by);

    }


}