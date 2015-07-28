

//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class ProviderSignUpFF {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	 //System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");
	//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_2.46.0\\IEDriverServer.exe");
	
	// C:\IEDriverServer_Win32_2.44.0
	//driver = new InternetExplorerDriver();
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
   // baseUrl = "http://staging.sols.com";
   // baseUrl = "http://dev4.sols.com:81";
  //  baseUrl = "http://dev4.sols.com/";
  //  baseUrl = "http://qa.sols.com/";
    baseUrl = "http://www.sols.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/register");
    long currentTime = System.currentTimeMillis();
    
    System.out.println("Provider Sign Up");
    driver.findElement(By.name("user[email]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.name("user[email]")).sendKeys("QA" + currentTime + "@sols.com");
    Thread.sleep(1000);
    driver.findElement(By.id("sols-pw")).clear();
    driver.findElement(By.id("sols-pw")).sendKeys("sols1sols1");
    Thread.sleep(1000);
    driver.findElement(By.name("user[confirm_password]")).clear();
    driver.findElement(By.name("user[confirm_password]")).sendKeys("sols1sols1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button.create-account.step-style")).click();
    Thread.sleep(1000);
    System.out.println("Profile Section Start");
    
   // driver.findElement(By.id("default-0")).click();
   // driver.findElement(By.cssSelector("span.repeater")).click();
    driver.findElement(By.name("user[first_name]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.name("user[first_name]")).sendKeys("QA" + currentTime);
    driver.findElement(By.name("user[last_name]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.name("user[last_name]")).sendKeys("Sols" + currentTime);
    driver.findElement(By.name("reseller_info[reseller_business_phone]")).clear();
    driver.findElement(By.name("reseller_info[reseller_business_phone]")).sendKeys("9735575158");
    driver.findElement(By.name("user[mobile]")).clear();
    driver.findElement(By.name("user[mobile]")).sendKeys("9735575158");
    driver.findElement(By.id("default-0")).click();
    Thread.sleep(2000);
    new Select(driver.findElement(By.id("country-0"))).selectByVisibleText("United States");
    driver.findElement(By.cssSelector("option[value=\"US\"]")).click();
    driver.findElement(By.name("address[0][street_1]")).clear();
    driver.findElement(By.name("address[0][street_1]")).sendKeys("13 wayne ave qa testing");
    driver.findElement(By.name("address[0][street_2]")).clear();
    driver.findElement(By.name("address[0][street_2]")).sendKeys("QA suite");
    driver.findElement(By.name("address[0][city]")).clear();
    driver.findElement(By.name("address[0][city]")).sendKeys("Sols city");
    new Select(driver.findElement(By.name("address[0][state]"))).selectByVisibleText("New Jersey");
    driver.findElement(By.cssSelector("option[value=\"NJ\"]")).click();
    driver.findElement(By.id("postal-0")).clear();
    driver.findElement(By.id("postal-0")).sendKeys("07522");
    Thread.sleep(2000);
    /*
    driver.findElement(By.cssSelector("span.repeater")).click();
    new Select(driver.findElement(By.id("country-1"))).selectByVisibleText("United States");
    driver.findElement(By.cssSelector("#country-1 > option[value=\"US\"]")).click();
    driver.findElement(By.name("address[1][street_1]")).clear();
    driver.findElement(By.name("address[1][street_1]")).sendKeys("15 wayne ave qa testing");
    driver.findElement(By.name("address[1][street_2]")).clear();
    driver.findElement(By.name("address[1][street_2]")).sendKeys("qa testing ave");
    driver.findElement(By.name("address[1][city]")).clear();
    driver.findElement(By.name("address[1][city]")).sendKeys("paterson");
    new Select(driver.findElement(By.name("address[1][state]"))).selectByVisibleText("Connecticut");
    driver.findElement(By.cssSelector("select[name=\"address[1][state]\"] > option[value=\"CT\"]")).click();
    driver.findElement(By.id("postal-1")).clear();
    driver.findElement(By.id("postal-1")).sendKeys("07522");
    Thread.sleep(2000);
    //driver.findElement(By.id("default-1")).click();
     
     */
    new Select(driver.findElement(By.name("reseller_info[describe_as]"))).selectByVisibleText("Medical Doctor");
    driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
    driver.findElement(By.name("reseller_info[school]")).clear();
    driver.findElement(By.name("reseller_info[school]")).sendKeys("NJIT qa testing");
    new Select(driver.findElement(By.name("reseller_info[graduation_date][month]"))).selectByVisibleText("November");
    driver.findElement(By.cssSelector("option[value=\"11\"]")).click();
    new Select(driver.findElement(By.name("reseller_info[graduation_date][year]"))).selectByVisibleText("1999");
    driver.findElement(By.cssSelector("option[value=\"1999\"]")).click();
    new Select(driver.findElement(By.name("reseller_info[number_of_patients]"))).selectByVisibleText("11-20");
    driver.findElement(By.cssSelector("option[value=\"11-20\"]")).click();
    //driver.findElement(By.id("contract-file-upload")).click();
   // driver.findElement(By.id("html5_19o3juf591s521c3t1g2ks7o1atb3")).clear();
    Thread.sleep(2000);
   // driver.findElement(By.id("html5_19o3juf591s521c3t1g2ks7o1atb3")).sendKeys("C:\\Incorrect_message");
    driver.findElement(By.xpath("//button[@value='continue']")).click();
    System.out.println("Profile section End");
   
    
    System.out.println("Practice Section Start");
    Thread.sleep(2000);
    driver.findElement(By.name("practice[practice_name]")).clear();
    driver.findElement(By.name("practice[practice_name]")).sendKeys("qa475 sols inc");
    driver.findElement(By.name("practice[website]")).clear();
    driver.findElement(By.name("practice[website]")).sendKeys("www.qa475.com");
    new Select(driver.findElement(By.id("provider-type"))).selectByVisibleText("Partnership");
    driver.findElement(By.cssSelector("option[value=\"3\"]")).click();
    new Select(driver.findElement(By.id("provider-range"))).selectByVisibleText("31-50");
    driver.findElement(By.cssSelector("option[value=\"31-50\"]")).click();
    driver.findElement(By.id("tax-1")).clear();
    driver.findElement(By.id("tax-1")).sendKeys("21");
    driver.findElement(By.id("tax-2")).clear();
    driver.findElement(By.id("tax-2")).sendKeys("4365679");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button.step-action")).click();
    System.out.println("Practice Section End");
    Thread.sleep(2000);
   
    
    System.out.println("Providers Section Start");
    /*
    driver.findElement(By.cssSelector("span.repeater")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("invite[0][first_name]")).clear();
    driver.findElement(By.name("invite[0][first_name]")).sendKeys("qa475ap");
    driver.findElement(By.name("invite[0][last_name]")).clear();
    driver.findElement(By.name("invite[0][last_name]")).sendKeys("solsap");
    driver.findElement(By.name("invite[0][email]")).clear();
    driver.findElement(By.name("invite[0][email]")).sendKeys("qa475ap@sols.com");
    Thread.sleep(2000);
    */
    driver.findElement(By.cssSelector("button.step-action")).click();
    Thread.sleep(2000);
    System.out.println("Providers Section End");    
    // Package page
  
    
    System.out.println("Package Section Start");
    
    driver.findElement(By.id("sols-promo-code")).clear();
    driver.findElement(By.id("sols-promo-code")).sendKeys("doctor");
   // driver.findElement(By.id("sols-promo-code")).sendKeys("qacontract");
    driver.findElement(By.id("sols-promo")).click();
    driver.findElement(By.cssSelector("button.step-action")).click();
    System.out.println("Package Section End");
    Thread.sleep(5000);
    /*
     driver.findElement(By.id("sols-promo-code")).clear();
    driver.findElement(By.id("sols-promo-code")).sendKeys("qacontract");
    driver.findElement(By.id("sols-promo")).click();
    driver.findElement(By.cssSelector("button.step-action")).click();
    
    driver.findElement(By.name("practice[contract_signed_by]")).clear();
    driver.findElement(By.name("practice[contract_signed_by]")).sendKeys("qa475");
    driver.findElement(By.name("practice[contract_telephone]")).clear();
    driver.findElement(By.name("practice[contract_telephone]")).sendKeys("9735575158");
    
    driver.findElement(By.name("card_number")).clear();
    driver.findElement(By.name("card_number")).sendKeys("5555555555554444");
    driver.findElement(By.name("cvc")).clear();
    driver.findElement(By.name("cvc")).sendKeys("454");
    new Select(driver.findElement(By.name("exp_month"))).selectByVisibleText("10");
    driver.findElement(By.cssSelector("option[value=\"10\"]")).click();
    new Select(driver.findElement(By.name("exp_year"))).selectByVisibleText("2020");
    driver.findElement(By.cssSelector("option[value=\"2020\"]")).click();
    
    driver.findElement(By.cssSelector("button.step-action")).click();
    driver.findElement(By.cssSelector("button.mfp-close")).click();
  }
     */
    System.out.println("Contract Section Start");
    driver.findElement(By.name("practice[contract_signed_by]")).clear();
    driver.findElement(By.name("practice[contract_signed_by]")).sendKeys("qa475 sols");
    driver.findElement(By.name("practice[contract_telephone]")).clear();
    driver.findElement(By.name("practice[contract_telephone]")).sendKeys("9735575158");
    Thread.sleep(1000);
  /*
    driver.findElement(By.name("card_number")).clear();
    driver.findElement(By.name("card_number")).sendKeys("5555555555554444");
    driver.findElement(By.name("cvc")).clear();
    driver.findElement(By.name("cvc")).sendKeys("454");
    new Select(driver.findElement(By.name("exp_month"))).selectByVisibleText("10");
    driver.findElement(By.cssSelector("option[value=\"10\"]")).click();
    new Select(driver.findElement(By.name("exp_year"))).selectByVisibleText("2020");
    driver.findElement(By.cssSelector("option[value=\"2020\"]")).click();
    Thread.sleep(2000);
    */
    driver.findElement(By.cssSelector("button.step-action")).click();
    Thread.sleep(10000);
    System.out.println("Contract Section End");
    System.out.println(driver.getTitle());
    //.equals("Welcome to the SOLS Family!")
    driver.findElement(By.cssSelector("button.mfp-close")).click();
    System.out.println("Provider Signed up successfully");
    Thread.sleep(1000);
    
    
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
