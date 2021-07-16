package logic.pages;

import logic.setup.BasePage;
import org.openqa.selenium.By;

public class BuildExpensiveComputerPage extends BasePage {
    public By set_processor_fast = By.xpath("//input[@id=\"product_attribute_74_5_26_82\"]");
    public By set_ram = By.xpath("//input[@id=\"product_attribute_74_6_27_85\"]");
    public By set_software1 = By.xpath("//input[@id=\"product_attribute_74_8_29_88\"]");
    public By set_software2 = By.xpath("//input[@id=\"product_attribute_74_8_29_89\"]");
    public By set_software3 = By.xpath("//input[@id=\"product_attribute_74_8_29_90\"]");
    public By add_to_cart = By.xpath("//input[@id=\"add-to-cart-button-74\"]");
    public By count_items = By.xpath("//span[@class=\"cart-qty\"]");
}
