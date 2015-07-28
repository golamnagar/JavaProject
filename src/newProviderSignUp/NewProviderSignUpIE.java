package newProviderSignUp;




import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewProviderSignUpIE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
   
	  System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	 // driver = new FirefoxDriver();
    baseUrl = "http://dev4.sols.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSignUP() throws Exception {
    driver.get("http://dev4.sols.com/v2/register");
    driver.manage().window().maximize();
    long currentTime = System.currentTimeMillis();
    Thread.sleep(2000);
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("IE_QA" + currentTime + "@sols.com");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("sols1sols1");
    Thread.sleep(2000);
    driver.findElement(By.name("isReseller")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("create_account")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//input[@name='firstName']")).clear();
    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("qa705");
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("sols");
    driver.findElement(By.name("postalCode")).clear();
    driver.findElement(By.name("postalCode")).sendKeys("07522");
    driver.findElement(By.name("businessPhone")).clear();
    driver.findElement(By.name("businessPhone")).sendKeys("9735575158");
    Thread.sleep(1000);
    driver.findElement(By.id("update_profile")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='tier-gold']/div[3]/p")).click();
    Thread.sleep(3000);
  //  driver.findElement(By.xpath("//div[@id='contract-actions']/div[3]/button")).click();
    //Thread.sleep(3000);
   // driver.findElement(By.xpath("//div[@id='contract-actions']/div[3]/button")).click();
   /* 
  Actions action = new Actions(driver);
  WebElement element = driver.findElement(By.cssSelector("button.continue-btn"));
  action.doubleClick(element).perform();
  
  */
    // in IE sometimes click does not work: here is the solution
    
    driver.findElement(By.cssSelector("button.continue-btn")).sendKeys(Keys.ENTER);
   // driver.findElement(By.cssSelector("button.continue-btn.firepath-matching-node")).click();
   // driver.findElement(By.cssSelector("#tier-gold > div.tier-footer > p.tier-action")).click();
   
   // driver.findElement(By.xpath(".//*[@id='contract-actions']/div[3]/button")).click();
                             
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id='credit-card-form']/div[1]/div[1]/input")).clear();
    driver.findElement(By.xpath("//*[@id='credit-card-form']/div[1]/div[1]/input")).sendKeys("5555555555554444");
    driver.findElement(By.name("creditCardCVC")).clear();
    driver.findElement(By.name("creditCardCVC")).sendKeys("213");
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("creditCardExpiryMonth"))).selectByVisibleText("10");
    driver.findElement(By.xpath("//option[@value='8']")).click();
    new Select(driver.findElement(By.id("creditCardExpiryYear"))).selectByVisibleText("2018");
    driver.findElement(By.xpath("//option[@value='2020']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button.continue-btn")).sendKeys(Keys.ENTER);
    Thread.sleep(10000);
    driver.findElement(By.linkText("SIGN OUT")).click();
    driver.close();
    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

