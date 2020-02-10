
import AmazonPKG.Account;
import framework.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.jsoup.nodes.Entities.EscapeMode.base;

public class AccountTest extends commonAPI {

    Account account;

    @BeforeMethod
    public void init(){
        account = PageFactory.initElements(driver, Account.class);
    }
    @Test(enabled = false)
    public void setSigninTest(){
        account.setSignin();
        account.setEmail("Jeff@selenium.com");
        sleepFor(3);
        account.setPass("SeleniumAutomation");
        sleepFor(3);
        account.setSignbutton();
        sleepFor(2);
    }

    @Test(enabled = true)
    public void setSigni2Test(){
        account.setSigni2("jeff","menad");
    }

}

