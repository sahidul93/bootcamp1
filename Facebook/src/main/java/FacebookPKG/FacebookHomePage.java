package FacebookPKG;

import framework.commonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FacebookHomePage extends commonAPI {

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement pass;

    @FindBy(partialLinkText = "Forgot account")
    public WebElement forgot;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;

    @FindBy(linkText = "People")
    WebElement people;

    @FindBy(xpath = "//button[@aria-label='Add Friend']")
    WebElement addFriend;

    @FindBy(className = "_4kny")
    WebElement friendReq;

    @FindBy(name = "actions[accept]")
    WebElement acceptButton;

    @FindBy(partialLinkText = "Like")
    WebElement like;

    @FindBy(xpath = "//input[@type='file']")
    WebElement upload;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;

    @FindBy(partialLinkText = "Comment")
    WebElement comment;

    // Signing In
    public String signIn(){

        Assert.assertEquals(forgot.isEnabled(), true);
        email.sendKeys("3474997908");
        pass.sendKeys("mouh03021987", Keys.ENTER);
        //cancelAlert();
        return  driver.getTitle();
    }

    //Searching Name
    public String searchName(){
        signIn();
        Actions actions = new Actions(driver);
        actions.doubleClick(search);
        search.sendKeys("roche",Keys.ENTER);
        sleepFor(3);
        return driver.getTitle();
    }

    //Send a friend request
    public void friendRequest(){
        signIn();
        System.out.println(addFriend.isEnabled());
        addFriend.click();
    }

    //Accepting friendRequest
    public void acceptRequest(){
        signIn();
        System.out.println(friendReq.isEnabled());
        friendReq.click();
        acceptButton.click();

    }

    //Like a post
    public void likePost(){
        signIn();
        System.out.println(like.isEnabled());
        like.click();
    }

    //upload file
    public void uploadFile(){
        signIn();
        System.out.println(upload.isEnabled());
        upload.sendKeys("");
        sleepFor(30);
        submit.click();
    }

    //Comment on a post.

    public void comment(){
        signIn();
        System.out.println(comment.isEnabled());
        comment.click();
        comment.sendKeys("nice pic");

    }
}
