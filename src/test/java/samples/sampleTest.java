package samples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleTest {
    /*public WebDriver driver;*/

    @Test(groups = {"web"})
    public void first(){
        System.out.println("WEB");
        Assert.assertEquals("one","one");
        //driver.get("http://localhost:8080/index.html");
    }
}
