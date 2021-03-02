import org.junit.Assert;
import org.junit.Test;

public class TestClassSeleniumRL {


    @Test
    public void testCheckPrice() {
        Assert.assertEquals(classSeleniumRL.price, classSeleniumRL.checkPrice(classSeleniumRL.getPrice(classSeleniumRL.driver)));

    }

}
