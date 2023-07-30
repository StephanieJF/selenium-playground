package com.steph.app;


import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import base.BasePage;
import pageObjects.Playground;

@Listeners(resources.Listeners.class)

public class PlaygroundTest extends BasePage {
	String baseUrl;

	public PlaygroundTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		baseUrl = "http://timvroom.com/selenium/playground/";
	}
	
	@Test
	public void endToEndTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Playground playground = new Playground(driver);
		driver.get(baseUrl);
		
		//#1
		String pageTitle = playground.getPageTitle();
		playground.getAnswerSlot1().sendKeys(pageTitle);
		
		//#2
		playground.getNameField().sendKeys("Kilgore Trout");
		
		//#3
		Select selectOccupation = new Select(playground.getOccupation());
		selectOccupation.selectByVisibleText("Science Fiction Author");
		
		//#4
		int numBlueBoxes = playground.getBlueBoxes().size();
		playground.getAnswerSlot4().sendKeys(String.valueOf(numBlueBoxes));
		
		//#5
		playground.getClickMe().click();
		
		//#6
		String redBoxClass = playground.getRedBox().getAttribute("class");
		playground.getAnswerSlot6().sendKeys(redBoxClass);
		
		//#7
		js.executeScript("ran_this_js_function()");
		
		//#8
		String jsReturnedValue = js.executeScript("return got_return_from_js_function();").toString();
		playground.getAnswerSlot8().sendKeys(jsReturnedValue);
		
		//#9
		playground.getWroteBookRadio().click();
		
		//#10
		String redBoxText = playground.getRedBox().getText();
		playground.getAnswerSlot10().sendKeys(redBoxText);
		
		//#11
		String firstBoxText = playground.getFirstBox().getText();
		String[] colorName = firstBoxText.split(" ");
		String firstColor = colorName[0];
		playground.getAnswerSlot11().sendKeys(firstColor);
		
		//#12
		Dimension newDimension = new Dimension(850,650);
		driver.manage().window().setSize(newDimension);
		
		//#13
		if (playground.isHereDisplayed()) {
			playground.getAnswerSlot13().sendKeys("yes");
		} else {
			playground.getAnswerSlot13().sendKeys("no");
		}
		
		//#14
		Boolean isPurpleBoxVisible = playground.getPurpleBox().isDisplayed();
		if (isPurpleBoxVisible) {
			playground.getAnswerSlot14().sendKeys("yes");
		} else {
			playground.getAnswerSlot14().sendKeys("no");
		}
		
		//#15
		playground.getClickThenWait().click();
		WebElement nextLink = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(playground.getClickAfterWait()));
		nextLink.click();
	
		//#16
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//#17
		playground.getSubmitBtn().click();
		
		//done
		playground.getResults().click();
		
	}
	
	
}
