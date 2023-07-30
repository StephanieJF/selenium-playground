package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Playground {
	
	public WebDriver driver;
	
	By answerSlot1 = By.cssSelector("#answer1");
	By nameField = By.cssSelector("#name");
	By occupationSelect = By.cssSelector("select#occupation");
	By blueBox = By.cssSelector(".bluebox");
	By answerSlot4 = By.cssSelector("#answer4");
	By clickMeLink = By.linkText("click me");
	By redBox = By.cssSelector("#redbox");
	By answerSlot6 = By.cssSelector("#answer6");
	By answerSlot8 = By.cssSelector("#answer8");
	By wroteBook = By.cssSelector("input[value='wrotebook']");
	By answerSlot10 = By.cssSelector("#answer10");
	By firstBox = By.xpath("(//h3[contains(text(),'check arrangement')]/following-sibling::span)[1]");
	By answerSlot11 = By.cssSelector("#answer11");
	By answerSlot13 = By.cssSelector("#answer13");
	By answerSlot14 = By.cssSelector("#answer14");
	By idIsHere = By.cssSelector("#ishere");
	By purpleBoxId = By.cssSelector("#purplebox");
	By clickWaitLink = By.linkText("click then wait");
	By clickAfterLink = By.linkText("click after wait");
	By submitBtn = By.cssSelector("#submitbutton");
	By checkResultsBtn = By.cssSelector("#checkresults");
	
	
	public Playground(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement getAnswerSlot1() {
		return driver.findElement(answerSlot1);
	}
	
	public WebElement getNameField() {
		return driver.findElement(nameField);
	}
	
	public WebElement getOccupation() {
		return driver.findElement(occupationSelect);
	}
	
	public List<WebElement> getBlueBoxes() {
		return driver.findElements(blueBox);
	}
	
	public WebElement getAnswerSlot4() {
		return driver.findElement(answerSlot4);
	}
	
	public WebElement getClickMe() {
		return driver.findElement(clickMeLink);
	}
	
	public WebElement getRedBox() {
		return driver.findElement(redBox);
	}
	
	public WebElement getAnswerSlot6() {
		return driver.findElement(answerSlot6);
	}

	public WebElement getAnswerSlot8() {
		return driver.findElement(answerSlot8);
	}
	
	public WebElement getWroteBookRadio() {
		return driver.findElement(wroteBook);
	}
	
	public WebElement getAnswerSlot10() {
		return driver.findElement(answerSlot10);
	}
	
	public WebElement getFirstBox(){
		return driver.findElement(firstBox);
	}
	
	public WebElement getAnswerSlot11() {
		return driver.findElement(answerSlot11);
	}
	
	public WebElement getAnswerSlot13() {
		return driver.findElement(answerSlot13);
	}

	public WebElement getAnswerSlot14() {
		return driver.findElement(answerSlot14);
	}
	
	public Boolean isHereDisplayed() {
		try {
			driver.findElement(idIsHere);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public WebElement getPurpleBox() {
		return driver.findElement(purpleBoxId);
	}
	
	public WebElement getClickThenWait() {
		return driver.findElement(clickWaitLink);
	}
	
	public WebElement getClickAfterWait() {
		return driver.findElement(clickAfterLink);
	}
	
	public WebElement getSubmitBtn() {
		return driver.findElement(submitBtn);
	}
	
	public WebElement getResults() {
		return driver.findElement(checkResultsBtn);
	}
	
}
