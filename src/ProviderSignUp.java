
//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ProviderSignUp {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://dev4.sols.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("http://dev4.sols.com/");
    driver.findElement(By.linkText("Sign Up")).click();
    driver.findElement(By.xpath("//input[@name='user[email]']")).clear();
    driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("qa415@sols.com");
    driver.findElement(By.id("sols-pw")).clear();
    driver.findElement(By.id("sols-pw")).sendKeys("sosl1sols1");
    driver.findElement(By.name("user[confirm_password]")).clear();
    driver.findElement(By.name("user[confirm_password]")).sendKeys("sols1sols1");
    driver.findElement(By.cssSelector("button.create-account.step-style")).click();
    driver.findElement(By.id("sols-pw")).clear();
    driver.findElement(By.id("sols-pw")).sendKeys("sols1sols1");
    driver.findElement(By.cssSelector("button.create-account.step-style")).click();
    driver.findElement(By.id("default-0")).click();
    driver.findElement(By.cssSelector("span.repeater")).click();
    driver.findElement(By.name("user[first_name]")).clear();
    driver.findElement(By.name("user[first_name]")).sendKeys("qa415");
    driver.findElement(By.name("user[last_name]")).clear();
    driver.findElement(By.name("user[last_name]")).sendKeys("sols");
    driver.findElement(By.name("reseller_info[reseller_business_phone]")).clear();
    driver.findElement(By.name("reseller_info[reseller_business_phone]")).sendKeys("9735575158");
    driver.findElement(By.id("default-0")).click();
    new Select(driver.findElement(By.id("country-0"))).selectByVisibleText("United States");
    driver.findElement(By.cssSelector("option[value=\"US\"]")).click();
    driver.findElement(By.name("address[0][street_1]")).clear();
    driver.findElement(By.name("address[0][street_1]")).sendKeys("17 qa ave");
    driver.findElement(By.name("address[0][city]")).clear();
    driver.findElement(By.name("address[0][city]")).sendKeys("sols City");
    new Select(driver.findElement(By.name("address[0][state]"))).selectByVisibleText("Delaware");
    driver.findElement(By.cssSelector("select[name=\"address[0][state]\"] > option[value=\"DE\"]")).click();
    driver.findElement(By.id("postal-0")).clear();
    driver.findElement(By.id("postal-0")).sendKeys("07522");
    driver.findElement(By.cssSelector("span.repeater")).click();
    new Select(driver.findElement(By.id("country-1"))).selectByVisibleText("United States");
    driver.findElement(By.cssSelector("#country-1 > option[value=\"US\"]")).click();
    driver.findElement(By.name("address[1][street_1]")).clear();
    driver.findElement(By.name("address[1][street_1]")).sendKeys("15 wayne ave qa testing");
    driver.findElement(By.name("address[1][city]")).clear();
    driver.findElement(By.name("address[1][city]")).sendKeys("sols city primary add");
    driver.findElement(By.id("default-1")).click();
    new Select(driver.findElement(By.name("reseller_info[describe_as]"))).selectByVisibleText("Chiropractor");
    driver.findElement(By.cssSelector("option[value=\"3\"]")).click();
    driver.findElement(By.name("reseller_info[school]")).clear();
    driver.findElement(By.name("reseller_info[school]")).sendKeys("nitt qa testing");
    new Select(driver.findElement(By.name("reseller_info[graduation_date][month]"))).selectByVisibleText("April");
    driver.findElement(By.cssSelector("select[name=\"reseller_info[graduation_date][month]\"] > option[value=\"4\"]")).click();
    new Select(driver.findElement(By.name("reseller_info[graduation_date][year]"))).selectByVisibleText("2002");
    driver.findElement(By.cssSelector("option[value=\"2002\"]")).click();
    new Select(driver.findElement(By.name("reseller_info[number_of_patients]"))).selectByVisibleText("11-20");
    driver.findElement(By.cssSelector("option[value=\"11-20\"]")).click();
    driver.findElement(By.id("contract-file-upload")).click();
    driver.findElement(By.id("html5_19nklj9nakce1ms11doc6cvl4v3")).clear();
    driver.findElement(By.id("html5_19nklj9nakce1ms11doc6cvl4v3")).sendKeys("");
    driver.findElement(By.xpath("//button[@value='continue']")).click();
    new Select(driver.findElement(By.name("address[1][state]"))).selectByVisibleText("Colorado");
    driver.findElement(By.cssSelector("select[name=\"address[1][state]\"] > option[value=\"CO\"]")).click();
    driver.findElement(By.id("postal-1")).clear();
    driver.findElement(By.id("postal-1")).sendKeys("07522");
    driver.findElement(By.xpath("//button[@value='continue']")).click();
    driver.findElement(By.name("practice[practice_name]")).clear();
    driver.findElement(By.name("practice[practice_name]")).sendKeys("qa415 sols");
    driver.findElement(By.name("practice[website]")).clear();
    driver.findElement(By.name("practice[website]")).sendKeys("www.qa415.com");
    new Select(driver.findElement(By.id("provider-type"))).selectByVisibleText("Partnership");
    driver.findElement(By.cssSelector("option[value=\"3\"]")).click();
    new Select(driver.findElement(By.id("provider-range"))).selectByVisibleText("11-20");
    driver.findElement(By.cssSelector("option[value=\"11-20\"]")).click();
    driver.findElement(By.id("tax-1")).clear();
    driver.findElement(By.id("tax-1")).sendKeys("12");
    driver.findElement(By.id("tax-2")).clear();
    driver.findElement(By.id("tax-2")).sendKeys("1221121");
    driver.findElement(By.cssSelector("button.step-action")).click();
    driver.findElement(By.cssSelector("span.repeater")).click();
    driver.findElement(By.name("invite[0][first_name]")).clear();
    driver.findElement(By.name("invite[0][first_name]")).sendKeys("qa415ap");
    driver.findElement(By.name("invite[0][last_name]")).clear();
    driver.findElement(By.name("invite[0][last_name]")).sendKeys("sols");
    driver.findElement(By.name("invite[0][email]")).clear();
    driver.findElement(By.name("invite[0][email]")).sendKeys("qa415ap@sols.com");
    driver.findElement(By.cssSelector("button.step-action")).click();
    driver.findElement(By.id("sols-promo-code")).clear();
    driver.findElement(By.id("sols-promo-code")).sendKeys("doctor");
    driver.findElement(By.id("sols-promo")).click();
    driver.findElement(By.cssSelector("button.step-action")).click();
    driver.findElement(By.name("practice[contract_signed_by]")).clear();
    driver.findElement(By.name("practice[contract_signed_by]")).sendKeys("qa415 sols");
    driver.findElement(By.name("practice[contract_telephone]")).clear();
    driver.findElement(By.name("practice[contract_telephone]")).sendKeys("9735575158");
    driver.findElement(By.cssSelector("button.step-action")).click();
    driver.findElement(By.cssSelector("button.mfp-close")).click();
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
