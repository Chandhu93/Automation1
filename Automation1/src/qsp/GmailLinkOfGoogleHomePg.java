package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLinkOfGoogleHomePg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String link=driver.findElement(By.xpath("//a[text()='Gmail']")).getAttribute("href");
		System.out.println(link);
		driver.close();
	}

}
