import FacebookPKG.FacebookHomePage;
import framework.commonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookHomePageTest extends commonAPI {

    FacebookHomePage facebookHomePage;

    @BeforeMethod
    public void initialization() {
        facebookHomePage = PageFactory.initElements(driver, FacebookHomePage.class);
    }

    @Test(enabled = false)
    public void testSignIn(){
        Assert.assertEquals(facebookHomePage.signIn(),"Facebook");
        System.out.println("Facebook Log In is successfull");
    }

    @Test (enabled = false)
    public void testsearchName(){

        Assert.assertEquals(facebookHomePage.searchName(),"amirouche87 – Facebook Search");
        System.out.println("Facebook search is working");
    }

    @Test (enabled = false )
    public void testFriendRequest(){
        facebookHomePage.friendRequest();
    }

    @Test(enabled = false)
    public void testAcceptRequest(){
        facebookHomePage.acceptRequest();
    }

    @Test(enabled = false)
    public void testLikePost(){
        facebookHomePage.likePost();
    }

    @Test(enabled = true)
    public void testUploadFile(){
        facebookHomePage.uploadFile();
    }

    @Test(enabled = false)
    public void testcomment(){
        facebookHomePage.comment();
    }

}

