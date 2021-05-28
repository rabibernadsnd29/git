package org.login;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends LibGlobal {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement selectLocation;
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement selectHotels;
	@FindBy(id="room_type")
	private WebElement selectRoomType;
	@FindBy(id="room_nos")
	private WebElement selectRoomNos;
	@FindBy(id="datepick_in")
	private WebElement txtInDate;
	@FindBy(id="datepick_out")
	private WebElement txtOutDate;
	@FindBy(id="adult_room")
	private WebElement selectAdultNos;
	@FindBy(id="child_room")
	private WebElement selectChildNos;
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	public WebElement getSelectLocation() {
		return selectLocation;
	}
	public WebElement getSelectHotels() {
		return selectHotels;
	}
	public WebElement getSelectRoomType() {
		return selectRoomType;
	}
	public WebElement getSelectRoomNos() {
		return selectRoomNos;
	}
	public WebElement getTxtInDate() {
		return txtInDate;
	}
	public WebElement getTxtOutDate() {
		return txtOutDate;
	}
	public WebElement getSelectAdultNos() {
		return selectAdultNos;
	}
	public WebElement getSelectChildNos() {
		return selectChildNos;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
}
