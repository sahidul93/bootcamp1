
;
import CitibankPKG.CitibankHomePage;
import framework.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CitibankHomePageTest extends commonAPI {

    CitibankHomePage citibankHomePage;

    @BeforeMethod
    public void initialization() {
        citibankHomePage = PageFactory.initElements(driver, CitibankHomePage.class);
    }

    @Test(enabled = false)
    public void testSignIn(){
        citibankHomePage.signIn();
        sleepFor(3);
    }

    @Test(enabled = false)
    public void testbanking(){
        citibankHomePage.banking();
    }

    @Test(enabled = true)
    public void testSearch(){
        citibankHomePage.search();
    }

}

