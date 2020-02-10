
import AmazonPKG.VerifyingItem;
import framework.commonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyingItemTest extends commonAPI {

    VerifyingItem verifyItem;

    @BeforeMethod
    public void init(){
        verifyItem = PageFactory.initElements(driver, VerifyingItem.class);
    }

    @Test
    public void setVerifyItemTest(){
        verifyItem.setSerachfield("soccer ball");
        sleepFor(2);
        verifyItem.setSubmit();
        sleepFor(2);
        verifyItem.setSoccer();
        sleepFor(2);
        verifyItem.setPicture1();
        sleepFor(2);
        verifyItem.setDetails();
        sleepFor(2);

    }
}