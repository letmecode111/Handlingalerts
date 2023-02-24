package Testcases;

import org.openqa.selenium.By;

import utils.Apputils;

public class Popups  extends Apputils{

	public static void main(String[] args) {
		utils.Apputils.launchapp("http://flights.qedgetech.com");
        driver.findElement(By.name("email")).sendKeys("letmecode111@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Letmecode@111");
        driver.findElement(By.xpath("//button[@ type='submit']")).click();
        driver.findElement(By.partialLinkText("Bookings")).click();
        driver.findElement(By.linkText("Delete")).click();
        driver.switchTo().alert().accept();
	}

}
