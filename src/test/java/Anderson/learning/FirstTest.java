package Anderson.learning;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static Anderson.learning.AppManagement.getFirstMoreList;
import static Anderson.learning.AppManagement.getSecondMoreList;


public class FirstTest extends TestBase{



    @Test
    public void searchWeather() {

        FirstPage.searchPhrase("погода Пенза");
        ResultsPage.checkWordInResult("Погода");
/*        WebElement searchField = driver.findElement(By.id("text"));
        searchField.sendKeys("погода Пенза", Keys.ENTER);
        WebElement firstResult = driver.findElement(By.cssSelector(".organic__url-text"));
        String firstResultText = firstResult.getText();
        Assert.assertTrue(firstResultText.contains("Погода"));*/

    }

    @Test
    public void moreTabChecking() {
        FirstPage.pushGeoButton();
        System.out.println("ok");
        GeoPage.chooseCity("Лондон");
        getFirstMoreList();
        FirstPage.pushGeoButton();
        GeoPage.chooseCity("Париж");
        getSecondMoreList();
        AppManagement.matchLists(getFirstMoreList(),getSecondMoreList());

    }

}
