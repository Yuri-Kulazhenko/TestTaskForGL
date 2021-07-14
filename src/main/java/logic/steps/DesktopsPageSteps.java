package logic.steps;

import logic.pages.DesktopsPage;
import org.openqa.selenium.By;

public class DesktopsPageSteps extends DesktopsPage {

    private DesktopsPage desktopsPage;

    public DesktopsPageSteps() {
        this.desktopsPage = new DesktopsPage();
    }

    public DesktopsPageSteps checkCountItems(){
        getElement(desktopsPage.combobo_pagesize).click();
        return this;
    }

    public DesktopsPageSteps checkSort(){
        getElement(desktopsPage.combobox_orderby).click();
        return this;
    }

    public OrderPageSteps addToCart(){
        getElement(desktopsPage.btn).click();
        return new OrderPageSteps();
    }

}
