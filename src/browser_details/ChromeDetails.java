package browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDetails {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.myntra.com/");
		driver.navigate().to("https://www.myntra.com/");
		//Get the title
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		//Get the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//Get the page source
		String pageSource = driver.getPageSource();
		//It will quit the browser
		driver.quit();
	}
}
