package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionExample {

public static void main(String[] args) {

WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.co.in/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("abc");
List<WebElement> ls=driver.findElements(By.xpath("//div[contains(text(),'abc')]"));
System.out.println();
System.out.println(ls.size());
for(int i=0;i<ls.size();i++){
	System.out.println(ls.get(i).getText());
}

	}

}
