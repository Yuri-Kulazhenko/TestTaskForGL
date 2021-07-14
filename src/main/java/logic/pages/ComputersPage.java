package logic.pages;

import logic.setup.BasePage;
import org.openqa.selenium.By;

public class ComputersPage extends BasePage {
    public By link_desktops = By.xpath("//h2/*[contains(@href,'desktops')]");

}
