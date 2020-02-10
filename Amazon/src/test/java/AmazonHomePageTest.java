import AmazonPKG.AmazonHomePage;
import framework.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHomePageTest extends commonAPI {
    AmazonHomePage amazonHomePage;

    @BeforeMethod

    public void init() {
        amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
    }

    @Test(priority = 1)
    public void setSignInTest() {
        amazonHomePage.setSignin();


    }

    @Test(priority = 2)
    public void setEnterEmailTest() {
        amazonHomePage.setSignin();
        amazonHomePage.setEneterEmail();
        amazonHomePage.setPassword();
        sleepFor(3);

    }
    @Test(priority = 3)
    public void setShoping(){
        amazonHomePage.setShoping();
        amazonHomePage.setJeanshop();
        amazonHomePage.setAddtocart();
        sleepFor(3);

    }
    @Test(priority = 4)
    public void setautosuggestion(){
        amazonHomePage.setAutosuggestion();


    }

}
