package logic.pages;

import logic.setup.BasePage;
import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage {
    public By item = By.xpath("//*[@class='product-name']");
    public By remote_for_cart = By.xpath("//input[@name=\"removefromcart\"]");
    public By update_cart = By.xpath("//input[@name=\"updatecart\"]");
}
