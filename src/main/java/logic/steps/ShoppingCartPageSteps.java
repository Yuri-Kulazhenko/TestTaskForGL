package logic.steps;

import logic.pages.HomePage;
import logic.pages.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class ShoppingCartPageSteps extends ShoppingCartPage {

    private ShoppingCartPage shoppingCartPage;

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

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;

        }

    }


}