package logic.pages;

import logic.setup.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public By link_computers = By.xpath("//*[contains(@href,'computers')]");
}
