import org.junit.Assert;
import org.junit.Test;

public class TestSeleniumRL {

    @Test
    public void testCheckPrice() {
        Assert.assertEquals(SeleniumRL.price, SeleniumRL.checkPrice(SeleniumRL.getPrice(SeleniumRL.driver)));
    }

}
