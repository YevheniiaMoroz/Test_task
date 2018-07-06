package pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {
    /**
     * SearchResultPage.class describe page with search results
     */

    public SelenideElement pageHeader = $x(".//header");
    public SelenideElement pageLogo = pageHeader.$x(".//a[@class='logo']");
    public SelenideElement searchLogo = pageLogo.$x(".//li[@class='pure-menu-item']");

    public SelenideElement searchSection = $x(".//section[@id='section-search']");

    private ElementsCollection searchResults = $$x(".//section[@id='section-search']//li");


    public ElementsCollection getSearchResults() {
        return searchResults;
    }

}
