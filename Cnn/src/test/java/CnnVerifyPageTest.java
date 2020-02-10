
import CnnPKG.CnnVerifyPage;

import framework.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnVerifyPageTest extends commonAPI {

    CnnVerifyPage pageObject;

    @BeforeMethod
    public  void initi(){
        pageObject= PageFactory.initElements(driver,CnnVerifyPage.class);
    }
    // @Test
    public void setnewdispTest(){

        pageObject.setnewsdisp();
    }
    //@Test
    public void setLogoTest(){
        pageObject.setCNNlogo();
    }
    @Test
    public void setTextvalidationTest(){
        pageObject.setTextvalidation();

    }


}
