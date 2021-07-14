package logic.steps;

import com.gargoylesoftware.htmlunit.Page;
import logic.pages.HomePage;
import logic.pages.OrderPage;

public class OrderPageSteps extends OrderPage {
    private OrderPage orderPage;

    public OrderPageSteps() {
        this.orderPage = new OrderPage();
    }

    public OrderPageSteps setParameters(){
        getElement(orderPage.set_parameters).click();
        return this;
    }


    public OrderPageSteps addToCart(){
        getElement(orderPage.add_to_cart).click();
        return this;
    }
    public ShoppingCartPageSteps clickToCart(){
        getElement(orderPage.click_to_cart).click();
        return new ShoppingCartPageSteps();
    }
}
