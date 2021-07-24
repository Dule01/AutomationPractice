import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationPracticeTest extends BaseTest {

    @BeforeMethod
    public void setUp(){
        init("EDGE", 15);
    }

    @Test
    public void openBrowser(){
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterMethod
    public void tearDown(){
        quitBrowser();
    }

}
