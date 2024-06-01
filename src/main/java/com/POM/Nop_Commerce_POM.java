package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Nop_Commerce_POM extends BaseClass{

//	public static WebDriver driver;

	@FindBy(xpath = "//input[@value='admin@yourstore.com']")
	private WebElement loginEmailId;

	@FindBy(xpath = "//input[@class='password']")
	private WebElement loginPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;

	@FindBy(xpath = "(//i[@class='right fas fa-angle-left '])[4]")
	private WebElement customerArrowBtn;

	@FindBy(xpath = "(//a[@class='nav-link'])[22]")
	private WebElement customer2;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement addNew;

	@FindBy(xpath = "(//input[@class='form-control text-box single-line'])[1]")
	private WebElement addUserEmailBox;

	@FindBy(xpath = "//input[@class='form-control text-box single-line password']")
	private WebElement addUserpasswordBox;

	@FindBy(xpath = "(//input[@class='form-control text-box single-line'])[2]")
	private WebElement addUserFName;

	@FindBy(xpath = "//input[@name='LastName']")
	private WebElement addUserLName;

	@FindBy(xpath = "(//input[@class='form-check-input'])[1]")
	private WebElement radioMaleBtn;

	@FindBy(xpath = "(//input[@class='form-check-input'])[2]")
	private WebElement radioFemaleBtn;

	@FindBy(xpath = "//input[@name='Company']")
	private WebElement addUserCompanyName;

	@FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[2]")
	private WebElement customerRolesBox;

	@FindBy(xpath = "//span[@role='presentation']")
	private WebElement registrationDelBtn;

	@FindBy(xpath = "(//li[@class='select2-results__option'])[3]")
	private WebElement guestsBtn;

	@FindBy(xpath = "(//li[@class='select2-results__option'])[4]")
	private WebElement vendorsBtn;
	
	@FindBy(xpath = "(//li[@class='select2-results__option'])[1]")
	private WebElement forumModerator;

	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement adminComment;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	private WebElement saveBtn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
	private WebElement messageLine;

	@FindBy(xpath = "(//a[@class='nav-link'])[2]")
	private WebElement logoutBtn;

	@FindBy(xpath = "(//input[@name='checkbox_customers'])[1]")
	private WebElement emailCheckBox;

	@FindBy(xpath = "(//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tr[td[1]]//td[7])[1]")
	private WebElement editBtn;

	@FindBy(xpath = "(//div[@class='card-header with-border clearfix'])[3]")
	private WebElement addresses;

	@FindBy(xpath = "//i[@class='fas fa-pencil-alt']")
	private WebElement addressEditBtn;

	@FindBy(xpath = "//input[@name='Address.City']")
	private WebElement cityEdit;

	@FindBy(xpath = "//input[@id='SearchEmail']")
	private WebElement emailSearch;

	@FindBy(xpath = "//button[@id='search-customers']")
	private WebElement emailSearchBtn;

	@FindBy(xpath = "(//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tr[td[1]]//td[2])[5]")
	private WebElement emailText;
	
	
	@FindBy(xpath = "(//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tr[td[1]]//td[2])[1]")
	private WebElement newAddedEmail;

	@FindBy(xpath = "//span[@class='btn btn-danger']")
	private WebElement deleteBtn;

	
	@FindBy(xpath = "//select[@name='customer-addresses-grid_length']")
	private WebElement addressGridCount;
	
	
	@FindBy(xpath = "//a[contains(text(),'back to customer details')]")
	private WebElement backToEditCustomer;
	
	@FindBy(xpath = "//option[contains(text(),'50')]")
	private WebElement selectGrid50;
	
	@FindBy(xpath = "//button[@class='btn btn-danger float-right']")
	private WebElement cnfmDeleteBtn;
	
	@FindBy(xpath = "//div[@class='dataTables_wrapper dt-bootstrap4 no-footer']//tr[2]//td[1]")
	private WebElement updateCheckBox;
	
	
	
	@FindBy(xpath = "//div[@class='dataTables_wrapper dt-bootstrap4 no-footer']//tr[2]//td[7]")
	private WebElement updateEditBtn;
	
	
	
	@FindBy(xpath = "(//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tr[td[1]]//td[2])[1]")
	private WebElement searchResultEmail;
	
	@FindBy(xpath = "(//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tr[td[1]]//td[2])")
	private WebElement searchResultName;
	
	
	// constructor 
		public Nop_Commerce_POM(WebDriver driver1) {
			
			this.driver = driver1;
			PageFactory.initElements(driver, this);
		}
	
	
	public WebElement getSearchResultName() {
		return searchResultName;
	}


	public WebElement getLoginEmailId() {
		return loginEmailId;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getCustomerArrowBtn() {
		return customerArrowBtn;
	}

	public WebElement getCustomer2() {
		return customer2;
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getAddUserEmailBox() {
		return addUserEmailBox;
	}

	public WebElement getAddUserpasswordBox() {
		return addUserpasswordBox;
	}

	public WebElement getAddUserFName() {
		return addUserFName;
	}

	public WebElement getAddUserLName() {
		return addUserLName;
	}

	public WebElement getRadioMaleBtn() {
		return radioMaleBtn;
	}

	public WebElement getRadioFemaleBtn() {
		return radioFemaleBtn;
	}

	public WebElement getAddUserCompanyName() {
		return addUserCompanyName;
	}

	public WebElement getCustomerRolesBox() {
		return customerRolesBox;
	}

	public WebElement getRegistrationDelBtn() {
		return registrationDelBtn;
	}

	public WebElement getGuestsBtn() {
		return guestsBtn;
	}

	public WebElement getVendorsBtn() {
		return vendorsBtn;
	}

	public WebElement getAdminComment() {
		return adminComment;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getMessageLine() {
		return messageLine;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getEmailCheckBox() {
		return emailCheckBox;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getAddresses() {
		return addresses;
	}

	public WebElement getAddressEditBtn() {
		return addressEditBtn;
	}

	public WebElement getCityEdit() {
		return cityEdit;
	}

	public WebElement getEmailSearch() {
		return emailSearch;
	}

	public WebElement getEmailSearchBtn() {
		return emailSearchBtn;
	}

	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getForumModerator() {
		return forumModerator;
	}

	public WebElement getNewAddedEmail() {
		return newAddedEmail;
	}

	public WebElement getAddressGridCount() {
		return addressGridCount;
	}

	public WebElement getBackToEditCustomer() {
		return backToEditCustomer;
	}

	public WebElement getSelectGrid50() {
		return selectGrid50;
	}
	
	public WebElement getCnfmDeleteBtn() {
		return cnfmDeleteBtn;
	}

	public WebElement getUpdateCheckBox() {
		return updateCheckBox;
	}

	public WebElement getUpdateEditBtn() {
		return updateEditBtn;
	}

	public WebElement getSearchResultEmail() {
		return searchResultEmail;
	}
	
	
	

}
