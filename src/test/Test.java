package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriver driver1=new FirefoxDriver();
		WebDriver driver2=new InternetExplorerDriver();
		WebDriver driver3=new SafariDriver();
		WebDriver drive4=new EdgeDriver();
	}
}
