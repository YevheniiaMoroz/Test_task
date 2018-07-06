package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    /**
     *  HomePage.class describe home page with main elements which used for checking that page is displayed correctly
     */

    public SelenideElement pageHeader = $x(".//header");
    private SelenideElement mainMenu = $x(".//div[contains(@class, 'pure-menu-horizontal menu-head')]");
    public SelenideElement pageLogo = $x(".//a[@class='logo']");
    public SelenideElement searchLogo = mainMenu.$x(".//a[contains(@class, 'squared scope')]");
    public SelenideElement searchInput = $x(".//input[@name=\"search_form_type[term]\"]");

    public void SearchLogo() {
        searchLogo.click();
    }

}