package logic.steps;

import logic.pages.ComputersPage;
import logic.pages.HomePage;

public class ComputersPageSteps extends ComputersPage {

    private ComputersPage computersPage;

    public ComputersPageSteps() {
        this.computersPage = new ComputersPage();
    }

    public DesktopsPageSteps switchToDesktop(){
        getElement(computersPage.link_desktops).click();
        return new DesktopsPageSteps();
    }
}
