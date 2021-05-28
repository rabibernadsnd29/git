package org.login;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends LibGlobal {
	public SelectPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radioBtnHotel;
	@FindBy(id="continue")
	private WebElement btnContinue;
	public WebElement getRadioBtnHotel() {
		return radioBtnHotel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
