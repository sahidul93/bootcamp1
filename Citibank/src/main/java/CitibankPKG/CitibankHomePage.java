package CitibankPKG;

import framework.commonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitibankHomePage extends commonAPI {

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "banking")
    public WebElement banking;

    @FindBy(linkText = "Checking")
    public WebElement checking;

    @FindBy(linkText = "Savings")
    public WebElement Savings;

    @FindBy(xpath = "//div[@role='search']")
    public WebElement search;

    @FindBy(xpath = "//input[@placeholder='Tell us what you’re looking for']")
    public WebElement inputSearch;

    @FindBy(linkText = "Search")
    public WebElement searchButton;


    //Sign In
    public void signIn(){
        username.sendKeys("rochr87@gmail.com");
        password.sendKeys("1234", Keys.ENTER);

    }

    //Banking Options
    public void banking(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(banking).build().perform();
        banking.click();
        checking.click();
        driver.navigate().back();
        banking.click();
        Savings.click();
    }

    public void search(){
        search.click();
        inputSearch.sendKeys("opening account");
        sleepFor(3);

    }
}
