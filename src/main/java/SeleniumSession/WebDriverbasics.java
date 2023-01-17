package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverbasics {

	public static void main(String[] args) {
		
		//1.Open browser
	
		WebDriver driver =new ChromeDriver();
		//WebDriver=interface
		//driver= referance variable of Webdriver interface
		//ChromeDriver=is a class
		//new ChromeDriver= object
		
		//2.Launch url
		driver.get("https://www.facebook.com/");
		
		//3.getpage title
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		
		//4.Validation point /checkpoint
		if (pagetitle.equalsIgnoreCase("Facebook – log in or sign up"))
		{
			System.out.println("page launched");
		}
		else {
			
			System.out.println("wrong page launched");
	}

}
}
