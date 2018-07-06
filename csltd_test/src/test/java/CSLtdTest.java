import org.junit.Test;
import org.openqa.selenium.Keys;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;
import utils.CSVConvertor;

import java.io.File;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;

public class CSLtdTest extends BaseTest {
    /**
     *CSLted.class is main testing class
     */
    HomePage homePage = new HomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    File TestFile = new File(".//test.csv");
    File CSVFile = new File(".//results.csv");


    @Test
    public void testCheckingFileWithSearchResults() {

        homePage.searchLogo.shouldBe(visible);
        homePage.SearchLogo();
        homePage.searchInput.setValue("DEVELOPER").sendKeys(Keys.ENTER);

        List<String> list = searchResultPage.getSearchResults().texts();
        CSVConvertor.createCsvWithLines("CSVFile.csv", list);

        List<String> resultList = CSVConvertor.convertCsvToList(CSVFile);
        List<String> testList = CSVConvertor.convertCsvToList(TestFile);
        testList.contains(resultList);

    }

}
