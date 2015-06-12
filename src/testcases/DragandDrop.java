package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

public static void main(String[] args) {
	
WebDriver driver=new FirefoxDriver();
driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().window().maximize();
WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));

Actions action=new Actions(driver);
action.dragAndDrop(drag, drop).build().perform();


	}

}
