package logic.pages;

import logic.setup.BasePage;
import org.openqa.selenium.By;

public class OrderPage extends BasePage {
    public By set_parameters = By.xpath("//input[@id=\"product_attribute_16_3_6_18\"]");
    public By add_to_cart = By.xpath("//input[@id=\"add-to-cart-button-16\"]");
    public By click_to_cart = By.xpath("//span[@class=\"cart-label\" and contains (text(),'Shopping cart')]");
}
