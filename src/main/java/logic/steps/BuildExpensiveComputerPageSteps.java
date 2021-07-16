package logic.steps;

import logic.pages.BuildExpensiveComputerPage;

public class BuildExpensiveComputerPageSteps extends BuildExpensiveComputerPage {

    private final BuildExpensiveComputerPage buildExpensiveComputerPage;

    public BuildExpensiveComputerPageSteps() {
        this.buildExpensiveComputerPage = new BuildExpensiveComputerPage();
    }

    public BuildExpensiveComputerPageSteps setProcessor(){
        getElement(buildExpensiveComputerPage.set_processor_fast).click();
        return this;
    }
    public BuildExpensiveComputerPageSteps setRAM(){
        getElement(buildExpensiveComputerPage.set_ram).click();
        return this;
    }
    public BuildExpensiveComputerPageSteps setSoftware1(){
        getElement(buildExpensiveComputerPage.set_software1).click();
        return this;
    }
    public BuildExpensiveComputerPageSteps setSoftware2(){
        getElement(buildExpensiveComputerPage.set_software2).click();
        return this;
    }
    public BuildExpensiveComputerPageSteps setSoftware3(){
        getElement(buildExpensiveComputerPage.set_software3).click();
        return this;
    }
    public BuildExpensiveComputerPageSteps addToCart(){
        getElement(buildExpensiveComputerPage.add_to_cart).click();
        return this;
    }
    public BuildExpensiveComputerPageSteps countItems(){
        getElement(buildExpensiveComputerPage.count_items).click();
        return this;
    }
    public ShoppingCartPageSteps clickToCart(){
        getElement(buildExpensiveComputerPage.count_items).click();
        return new ShoppingCartPageSteps();
    }
}
