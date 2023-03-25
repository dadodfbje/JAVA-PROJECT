package selenumIntroduction;

import java.awt.Button;
import java.sql.DriverManager;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FLightBooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromeDriver.exe");
		WebDriver fis = new ChromeDriver();
		// dropdown with select as tagname ->static
		fis.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement drop = fis.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		Select excer = new Select(drop);
		excer.selectByIndex(3);
		System.out.println(excer.getFirstSelectedOption().getText());
		excer.selectByVisibleText("INR");
		System.out.println(excer.getFirstSelectedOption().getText());
		fis.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while (i < 5) {
			fis.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		fis.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		fis.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// fis.findElement(By.xpath("//a[@vlaue='VNS']")).click();
		fis.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	
		// Auto Suggstive Dropdown
		fis.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> options = fis.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("India"))

			{

				option.click();

				//break;

			}

		}
		fis.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(fis.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(fis.findElements(By.cssSelector("input[type='checkbox']")).size());
		fis.findElement(By.cssSelector("Button.ui-datepicker-trigger")).click();
		fis.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		

	}

}
