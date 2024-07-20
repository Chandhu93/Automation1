package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMulipleElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/Demo.html.html");
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 int count = allLinks.size();
		 System.out.println(count);
		 WebElement link = allLinks.get(1);
		 String text = link.getText();
		 System.out.println(text);
		 
	}

}
