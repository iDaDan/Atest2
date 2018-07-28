package Anderson.learning;

import org.testng.Assert;

import java.util.List;

public class AppManagement {

    public static void matchLists(List one, List two){
        Assert.assertEquals(one, two);
    }

    public static List getFirstMoreList() {
        List one = FirstPage.getMoreButtonList();
        return one;
    }

    public static List getSecondMoreList() {
        List two = FirstPage.getMoreButtonList();
        return two;
    }

}
