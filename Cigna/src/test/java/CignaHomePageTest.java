import CignaPKG.CignaLogIn;
import framework.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaHomePageTest extends commonAPI {
    CignaLogIn cignaHomePage;

    @BeforeMethod
    public void init() {
        cignaHomePage = PageFactory.initElements(driver, CignaLogIn.class);
    }

    @Test(priority = 1)
    public void setLogIn() {
        cignaHomePage.setLongin();

    }

}


