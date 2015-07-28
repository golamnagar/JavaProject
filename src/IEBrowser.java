import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEBrowser {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("Here the first line");
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_2.46.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.sols.com");
		driver.manage().window().maximize();
		System.out.println("Here is the IE dirver");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println("The test for IE Driver is pass");
		driver.quit();
	}

}
