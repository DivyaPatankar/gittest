package com.newtours.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightSearch {
	
	public static void selectTripType(WebDriver driver, String trip) {
		
		driver.findElement(By.xpath(".//input[@value='"+trip+"']")).click();
		
	}
	
	public static  void selectPassengers(WebDriver driver, String pass) {
	
		Select dd = new Select(driver.findElement(By.name("passCount")));
		dd.selectByVisibleText(pass);
	}
	
	public static  void selectDepartCity(WebDriver driver, String port) {
		
		Select dd = new Select(driver.findElement(By.name("fromPort")));
		dd.selectByVisibleText(port);
	}
	public static  void selectonDateDay(WebDriver driver, String month) {
		
		Select dd = new Select(driver.findElement(By.name("fromMonth")));
		dd.selectByVisibleText(month); 
	}
	public static  void selectonDate(WebDriver driver, String date) {
		
		Select dd = new Select(driver.findElement(By.name("fromDay")));
		dd.selectByVisibleText(date); 
	}
	
	public static  void selectarrivingIn(WebDriver driver, String portTo) {
		
		Select dd = new Select(driver.findElement(By.name("toPort")));
		dd.selectByVisibleText(portTo); 
	}
	public static  void selectreturningMonth(WebDriver driver, String month) {
		
		Select dd = new Select(driver.findElement(By.name("toMonth")));
		dd.selectByVisibleText(month); 
	}
	
	public static  void selectreturningDate(WebDriver driver, String date) {
		
		Select dd = new Select(driver.findElement(By.name("toDay")));
		dd.selectByVisibleText(date); 
	}
	public static void selectserviceClass(WebDriver driver, String preferences) {
		
		driver.findElement(By.xpath(".//input[@value='"+preferences+"']")).click();
	}
	public static  void airline(WebDriver driver, String plane) {
		
		Select dd = new Select(driver.findElement(By.name("airline")));
		dd.selectByVisibleText(plane); 
	}
	

}
