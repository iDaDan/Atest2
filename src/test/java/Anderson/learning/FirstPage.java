package Anderson.learning;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import java.util.List;


public class FirstPage extends TestBase{


    static WebElement searchField = driver.findElement(By.id("text"));
    static WebElement city = driver.findElement(By.cssSelector(".geolink__button"));
    static WebElement moreButton = driver.findElement(By.cssSelector("div > a.home-link.home-link_blue_yes.home-tabs__link.home-tabs__more-switcher"));
    static Select moreButtonSelect = new Select(moreButton);


    public static void searchPhrase(String searchTarget) {
        searchField.isDisplayed();
        searchField.click();
        searchField.sendKeys(searchTarget, Keys.ENTER);
        System.out.println("ok");
    }

    public static void pushGeoButton() {
        city.click();
    }

    public static List getMoreButtonListFrom(String city) {
        FirstPage.pushGeoButton();
        GeoPage.chooseCity(city);
        List option = moreButtonSelect.getOptions();
        return option;
    }

    public static List getMoreButtonList() {

        List list = moreButtonSelect.getOptions();

        return list;
    }







}
