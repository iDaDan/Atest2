package Anderson.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ResultsPage  extends TestBase {

    static WebElement firstResult = driver.findElement(By.cssSelector(".organic__url-text"));
    static String firstResultText = firstResult.getText();

    public static void checkWordInResult(String word) {
        Assert.assertTrue(firstResultText.contains(word));
    }
}
