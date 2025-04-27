package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		super(driver);
		
}
	
@FindBy(xpath="//a[@class='_1TOQfO']//span")
WebElement Login;

@FindBy(xpath="//div[@class='I-qZ4M vLRlQb']//input")
WebElement mobile;

@FindBy(xpath="//button[@class='QqFHMw twnTnD _7Pd1Fp']")
WebElement OTP;


public void logged() {
	Login.click();
}

public void mobileno(String a) {
	mobile.sendKeys(a);
	
}

public void OTPReq() {
	OTP.click();
}


	
	

}
