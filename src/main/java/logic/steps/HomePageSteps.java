package logic.steps;

import logic.pages.HomePage;

public class HomePageSteps extends HomePage {

    private final HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    public ComputersPageSteps switchToComputers(){
        getElement(homePage.link_computers).click();
        return new ComputersPageSteps();
    }
}
