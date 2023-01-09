package xyz_bank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class xyz_bank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		/*
		 * Thread.sleep(4000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
		 * Thread.sleep(4000);
		 * 
		 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")
		 * ).click(); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
		 * .sendKeys("SALMA"); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
		 * .sendKeys("NOFAL"); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"))
		 * .sendKeys("12345"); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		 * driver.switchTo().alert().accept(); Thread.sleep(3000); driver.navigate().to(
		 * "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[7]")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).
		 * click();
		 */

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();

		String[] myListOfFirstName = { "ahmad", "ali", "marwa", "anas", };

		int randomOne = (int) (Math.random() * myListOfFirstName.length - 1);

		String[] myListOfLastName = { "omar", "mahmoud", "eman", "enas", };

		int randomTwo = (int) (Math.random() * myListOfLastName.length - 1);

		WebElement myInputForTheFirstName = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
		myInputForTheFirstName.sendKeys(myListOfFirstName[randomOne]);

	}

}
