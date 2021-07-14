package logic.pages;

import logic.setup.BasePage;
import org.openqa.selenium.By;

public class DesktopsPage extends BasePage {
    public By combobo_pagesize = By.xpath("//*[@id=\"products-pagesize\"]/option[1]");
    public By combobox_orderby = By.xpath("//*[@id=\"products-orderby\"]/option[4]");
    public By btn_cartButton = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
    public By btn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/div[3]/div[2]/input");
}


