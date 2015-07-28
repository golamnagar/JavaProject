import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Here the first line");
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.sols.com");
		driver.manage().window().maximize();
		System.out.println("Here is he chorem dirver");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println("The test is pass");
		driver.quit();

	}
}