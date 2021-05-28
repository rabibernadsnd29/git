package org.maven;

import org.base.LibGlobal;
import org.login.BookPage;
import org.login.LoginPage;
import org.login.SearchPage;
import org.login.SelectPage;
import org.openqa.selenium.WebElement;

public class SampleClass extends LibGlobal {
	public static void main(String[] args) throws Exception {
		LibGlobal global = new LibGlobal();
		global.getDriver();
		global.getUrl("http://adactinhotelapp.com/");
		LoginPage page = new LoginPage();
		WebElement userName = page.getTxtUserName();
		global.enterText(userName, "hariprasad2904");
		WebElement password = page.getTxtPassword();
		global.enterText(password, "8zjVVB7zynWJeiPlco");
		WebElement login = page.getBtnLogin();
		global.btnClick(login);
		driver.navigate().refresh();
		SearchPage searchPage = new SearchPage();
		WebElement selectLocation = searchPage.getSelectLocation();
		global.dropDown(selectLocation, "Sydney");
		WebElement selectHotels = searchPage.getSelectHotels();
		global.dropDown(selectHotels, "Hotel Creek");
		WebElement selectRoomType = searchPage.getSelectRoomType();
		global.dropDown(selectRoomType, "Double");
		WebElement selectRoomNos = searchPage.getSelectRoomNos();
		global.dropDown(selectRoomNos, "2 - Two");
		WebElement selectAdultNos = searchPage.getSelectAdultNos();
		global.dropDown(selectAdultNos, "2 - Two");
		WebElement selectChildNos = searchPage.getSelectChildNos();
		global.dropDown(selectChildNos, "2 - Two");
		WebElement btnSearch = searchPage.getBtnSearch();
		global.btnClick(btnSearch);
		SelectPage sel = new SelectPage();
		WebElement radioBtnHotel = sel.getRadioBtnHotel();
		global.btnClick(radioBtnHotel);
		WebElement btnContinue = sel.getBtnContinue();
		global.btnClick(btnContinue);
		BookPage book = new BookPage();
		WebElement txtFirstName = book.getTxtFirstName();
		global.enterText(txtFirstName, "Hari");
		WebElement txtLastName = book.getTxtLastName();
		global.enterText(txtLastName, "Prasad");
		WebElement txtAddress = book.getTxtAddress();
		global.enterText(txtAddress, "16,Roy Street");
		WebElement txtCcNumber = book.getTxtCcNumber();
		global.enterText(txtCcNumber, "9836476545367829");
		WebElement selectCardType = book.getSelectCardType();
		global.dropDown(selectCardType, "American Express");
		WebElement selectExpireMonth = book.getSelectExpireMonth();
		global.dropDown(selectExpireMonth, "March");
		WebElement selectExpireYear = book.getSelectExpireYear();
		global.dropDown(selectExpireYear, "2022");
		WebElement ccvNumber2 = book.getCcvNumber();
		global.enterText(ccvNumber2, "3434");
		WebElement btnBook = book.getBtnBook();
		global.btnClick(btnBook);
		
		
	}

}