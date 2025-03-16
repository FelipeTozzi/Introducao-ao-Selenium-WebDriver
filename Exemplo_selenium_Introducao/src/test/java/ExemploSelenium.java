import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploSelenium {

    private static WebDriver driver;


   @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
   }

    @Test
    public void demonstracaoDeAcessoGoogle(){
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getPageSource());
    }

    @Test
    public void manipulandoCampoText(){
       WebElement element = driver.findElement(By.name("q"));
       element.sendKeys("selenium EBAAAAA");

       element.

       System.out.println(element.getAttribute("value"));

        Assert.assertEquals("selenium", element.getAttribute("value"));
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
       driver.quit();
    }

}
