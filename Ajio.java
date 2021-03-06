package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get(" https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
			
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();	
		String text1 = driver.findElement(By.className("length")).getText();
		System.out.println(text1);
		List<WebElement> elements1 = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + elements1.size());
		System.out.println(" Brands");
		for (WebElement webElement : elements1) {
			String text = webElement.getText();
			System.out.println(text);
		}
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		
}
}