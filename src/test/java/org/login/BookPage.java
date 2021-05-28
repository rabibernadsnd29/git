package org.login;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends LibGlobal {
	public BookPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCcNumber;
	@FindBy(id="cc_type")
	private WebElement selectCardType;
	@FindBy(id="cc_exp_month")
	private WebElement selectExpireMonth;
	@FindBy(id="cc_exp_year")
	private WebElement selectExpireYear;
	@FindBy(id="cc_cvv")
	private WebElement CcvNumber;
	@FindBy(name="book_now")
	private WebElement btnBook;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCcNumber() {
		return txtCcNumber;
	}
	public WebElement getSelectCardType() {
		return selectCardType;
	}
	public WebElement getSelectExpireMonth() {
		return selectExpireMonth;
	}
	public WebElement getSelectExpireYear() {
		return selectExpireYear;
	}
	public WebElement getCcvNumber() {
		return CcvNumber;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
	
}
