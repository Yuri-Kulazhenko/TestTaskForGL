package logic.steps;

import logic.pages.ComputersPage;


public class ComputersPageSteps extends ComputersPage {

    private final ComputersPage computersPage;

    public ComputersPageSteps() {
        this.computersPage = new ComputersPage();
    }

    public DesktopsPageSteps switchToDesktop(){
        getElement(computersPage.link_desktops).click();
        return new DesktopsPageSteps();
    }
}
