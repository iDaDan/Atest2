package Anderson.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GeoPage extends TestBase {

    static WebElement cityField = driver.findElement(By.cssSelector("[name=name]"));

    public static void chooseCity (String city)
    {
        cityField.sendKeys(city, Keys.ENTER);
    }

}
