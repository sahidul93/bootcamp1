



        import AmazonPKG.AutoSuggestion;
        import framework.commonAPI;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

        public class AutoSuggestionTest extends commonAPI {

        AutoSuggestion autosuggestion;

        @BeforeMethod
        public void init(){
        autosuggestion = PageFactory.initElements(driver,AutoSuggestion.class);
        }
        @Test
        public void setDealsTest(){
        autosuggestion.setDeals();
        sleepFor(2);
        autosuggestion.setDetails();
        sleepFor(2);
        autosuggestion.setVerify();
        sleepFor(2);
        autosuggestion.setEmail("Jeff@Selenium.com");
        sleepFor(2);
        autosuggestion.setPass("Djafar");
        sleepFor(2);
        autosuggestion.setSubmit();
        sleepFor(2);
        }
        }

