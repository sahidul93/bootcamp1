
import AmazonPKG.BrowsingProduct;
import framework.commonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowsingProductTest extends commonAPI {

    BrowsingProduct browseProduct;

    @BeforeMethod
    public void init(){
        browseProduct = PageFactory.initElements(driver,BrowsingProduct.class);
    }
    @Test
    public void setSerachfieldTest(){

        browseProduct.setSerachfield();
        browseProduct.setSearchfield1("sun glasses fashion men");
        browseProduct.setSearch();
        sleepFor(2);
        browseProduct.setGlasses();
        sleepFor(2);
        browseProduct.setAddcart();
        sleepFor(2);
        browseProduct.setCheckout();
        sleepFor(2);
        browseProduct.setEmail("Jeff@Selenium.com");
        sleepFor(2);
        browseProduct.setPassword("Djafar");
        sleepFor(2);
        browseProduct.setSubmit();
        sleepFor(2);
    }
}

