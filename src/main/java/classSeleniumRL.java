import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class classSeleniumRL {

    static {
        System.setProperty("webdriver.chrome.driver", "/projects/chromedriver_linux64/chromedriver");
    }
    static WebDriver driver = new ChromeDriver();
    static String price = "156.25 USD";


    public static void main(String[] args) {
        WebElement price = getPrice(driver);
        checkPrice(price);
        closeBrowser(driver);
    }

    public static WebElement getPrice(WebDriver driver) {

        driver.get("https://s100.aws-p-dev.copyright.com/AppDispatchServlet?publisherName=aaas&publication=sci&contentID=11223344wrtpc&title=Science%20is%20Great%20PC&publicationDate=11/15/2007&copyright=The%20American%20Association%20for%20the%20Advancement%20of%20Science&author=Jack%20Lowell&startPage=21&endPage=25&section=PC&orderBeanReset=true&debug=1");

        Select drpNewsletter = new Select(driver.findElement(By.name("offerIDValue")));
        drpNewsletter.selectByValue("14");

        Select drpType = new Select(driver.findElement(By.name("requesterType")));
        drpType.selectByValue("Academic/Non-Commercial");

        Select drpFromat = new Select(driver.findElement(By.name("format")));
        drpFromat.selectByValue("Print");

        Select drpPortion = new Select(driver.findElement(By.name("portionUsed")));
        drpPortion.selectByValue("Full Text");

        Select fieldNum = new Select(driver.findElement(By.name("translating")));
        fieldNum.selectByValue("No");

        WebElement button = driver.findElement(By.name("QBTable"));

        Actions actions = new Actions(driver);
        actions.click(button).perform();

        WebElement priceDouble = driver.findElement(By.name("priceDouble"));

        return priceDouble;
    }

    public static String checkPrice(WebElement priceDouble) {

        if (price.equals(priceDouble.getText())) {
            System.out.println("Sounds good");
        } else {
            System.out.println("Incorrect");
        }
        return priceDouble.getText();
    }

    public static void closeBrowser(WebDriver driver) {
        driver.quit();
    }
}
