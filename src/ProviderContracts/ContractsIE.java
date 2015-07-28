


package ProviderContracts;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class ContractsIE {
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
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/sign_in");
    long currentTime = System.currentTimeMillis();
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.findElement(By.name("user[username]")).clear();
    driver.findElement(By.name("user[username]")).sendKeys("golam@sols.co");
    driver.findElement(By.name("user[password]")).clear();
    driver.findElement(By.name("user[password]")).sendKeys("sols1sols1");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("button.step-action.create-account")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("default-0")).click();
    driver.findElement(By.linkText("Admin Panel")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='sidebar-nav']/ul/li[7]/a/span")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Contracts")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Add new contract")).click();
    Thread.sleep(1000);
    driver.findElement(By.name("contract[promo_code]")).clear();
    driver.findElement(By.name("contract[promo_code]")).sendKeys("QA" + currentTime);
    Thread.sleep(1000);
    new Select(driver.findElement(By.name("contract[ref_contract_type_id]"))).selectByVisibleText("Trial Period");
    new Select(driver.findElement(By.name("contract[start_date][month]"))).selectByVisibleText("June");
    new Select(driver.findElement(By.name("contract[start_date][day]"))).selectByVisibleText("6");
    new Select(driver.findElement(By.name("contract[start_date][year]"))).selectByVisibleText("2018");
    new Select(driver.findElement(By.name("contract[end_date][month]"))).selectByVisibleText("March");
    new Select(driver.findElement(By.name("contract[end_date][day]"))).selectByVisibleText("3");
    new Select(driver.findElement(By.name("contract[end_date][year]"))).selectByVisibleText("2019");
    new Select(driver.findElement(By.name("contract[trail_period]"))).selectByVisibleText("2 Months");
    Thread.sleep(1000);
    driver.findElement(By.name("contract[tier][platinum][cost]")).clear();
    driver.findElement(By.name("contract[tier][platinum][cost]")).sendKeys("75");
    driver.findElement(By.name("contract[tier][platinum][min_qty]")).clear();
    driver.findElement(By.name("contract[tier][platinum][min_qty]")).sendKeys("20");
    driver.findElement(By.name("contract[tier][platinum][initiation_fee]")).clear();
    driver.findElement(By.name("contract[tier][platinum][initiation_fee]")).sendKeys("150");
    driver.findElement(By.name("contract[tier][platinum][description][0]")).clear();
    driver.findElement(By.name("contract[tier][platinum][description][0]")).sendKeys("iPad Free");
    driver.findElement(By.name("contract[tier][platinum][description][1]")).clear();
    driver.findElement(By.name("contract[tier][platinum][description][1]")).sendKeys("Free *Training*");
    driver.findElement(By.name("contract[tier][platinum][description][2]")).clear();
    driver.findElement(By.name("contract[tier][platinum][description][2]")).sendKeys("Free Prover supporet");
    Thread.sleep(1000);
    driver.findElement(By.name("contract[tier][gold][cost]")).clear();
    driver.findElement(By.name("contract[tier][gold][cost]")).sendKeys("85");
    driver.findElement(By.name("contract[tier][gold][min_qty]")).clear();
    driver.findElement(By.name("contract[tier][gold][min_qty]")).sendKeys("15");
    driver.findElement(By.name("contract[tier][gold][initiation_fee]")).clear();
    driver.findElement(By.name("contract[tier][gold][initiation_fee]")).sendKeys("200");
    driver.findElement(By.name("contract[tier][gold][description][0]")).clear();
    driver.findElement(By.name("contract[tier][gold][description][0]")).sendKeys("Free iPad");
    driver.findElement(By.name("contract[tier][gold][description][1]")).clear();
    driver.findElement(By.name("contract[tier][gold][description][1]")).sendKeys("dsfasdfdsaf");
    driver.findElement(By.name("contract[tier][gold][description][2]")).clear();
    driver.findElement(By.name("contract[tier][gold][description][2]")).sendKeys("dsafafsafadadioeur[qorwpirwpro");
    Thread.sleep(1000);
    driver.findElement(By.name("contract[tier][silver][cost]")).clear();
    driver.findElement(By.name("contract[tier][silver][cost]")).sendKeys("95");
    driver.findElement(By.name("contract[tier][silver][min_qty]")).clear();
    driver.findElement(By.name("contract[tier][silver][min_qty]")).sendKeys("10");
    driver.findElement(By.name("contract[tier][silver][initiation_fee]")).clear();
    driver.findElement(By.name("contract[tier][silver][initiation_fee]")).sendKeys("250");
    driver.findElement(By.name("contract[tier][silver][description][0]")).clear();
    driver.findElement(By.name("contract[tier][silver][description][0]")).sendKeys("gfsdsgsfdsaffdsfsafasddasss");
    driver.findElement(By.name("contract[tier][silver][description][1]")).clear();
    driver.findElement(By.name("contract[tier][silver][description][1]")).sendKeys("fdsffaffalsdkdfjldkjldsjkjfjfa");
    driver.findElement(By.name("contract[tier][silver][description][2]")).clear();
    driver.findElement(By.name("contract[tier][silver][description][2]")).sendKeys("jfjsdlkfjlkaf");
    Thread.sleep(1000);
   // driver.findElement(By.name("contract_file")).clear();
    driver.findElement(By.name("contract_file")).sendKeys("C:\\Users\\golamhassan1\\Documents\\Adwords Popup signup.jpg");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@value='Save Contract']")).click();
    Thread.sleep(7000);
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
