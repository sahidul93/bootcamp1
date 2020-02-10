package AmazonPKG;

import framework.commonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends commonAPI {

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement signin;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement eneterEmail;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"7988a798\"]/span/div/div[1]/a/img")
    WebElement shoping;
    @FindBy(xpath = "//*[@id=\"result_4\"]/div/div[3]/div[1]/a/h2")
    WebElement jeanshop;
    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement addtocart;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement autosuggestion;
    @FindBy(xpath = "//*[@id=\"dealImage\"]/div/div/div[2]")
    WebElement dealimage;
    @FindBy(xpath = "//*[@id=\"sobe_d_b_3_1\"]/a/img")
    WebElement clothing;
    @FindBy(xpath = "//*[@id=\"sobe_d_b_3_2\"]/a/img")
    WebElement shose;

    public void setSignin(){
        signin.click();
    }

    public void setEneterEmail(){
        eneterEmail.sendKeys("roche87@gmail.com");
    }

   public void setPassword(){
        password.sendKeys("1234557");
   }

   public void setShoping(){
        shoping.click();
   }

   public void setJeanshop(){
        jeanshop.click();
   }

   public void setAddtocart(){
        addtocart.click();
   }

   public void setAutosuggestion(){
        autosuggestion.click();
   }


   }




