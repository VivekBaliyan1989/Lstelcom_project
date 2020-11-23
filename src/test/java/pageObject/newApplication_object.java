package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class newApplication_object {

	// Aircraft Information details

	// Home page

	@FindBy(xpath = "//a[@href='/office/product/index']")
	@CacheLookup
	public WebElement clkapp_home;

	@FindBy(xpath = "//a[@href='/office/product/create?actionType=N']")
	@CacheLookup
	public WebElement clknewApp_home;

	@FindBy(xpath = "//a[@href='/office/productAction/productAction?serviceId=8&subServiceId=804&actionType=N']")
	@CacheLookup
	public WebElement clkAircraft;

	// Licence Info

	// Licensee
	@FindBy(xpath = "//button[@id='addAddressButton' and @aria-label='Licensee']//i[1]")
	@CacheLookup
	public WebElement btnLicensee;

	// Licence Contact
	@FindBy(xpath = "//button[@id='addAddressButton' and @aria-label='Licence Contact']//i")
	@CacheLookup
	public WebElement btnLicenceContact;

	// Payment Contact
	@FindBy(xpath = "//button[@id='addAddressButton' and @aria-label='Payment Contact']//i")
	@CacheLookup
	public WebElement btnPaymentContact;

	// Common for Licensee, Licence Contact, Payment Contact
	@FindBy(xpath = "//input[@id='referenceNumberEditForm']")
	@CacheLookup
	public WebElement txtReferenceNumber;

	@FindBy(xpath = "//div[@class='modal-footer']//child::button[@id='saveAddressButton']")
	@CacheLookup
	public WebElement btnSelect;

	@FindBy(xpath = "//select[@id='licenceInfoViewModel_LicenceInfoSpecificsViewModel_category']")
	@CacheLookup
	public WebElement dropClassAircraft;

	@FindBy(xpath = "//input[@id='licenceInfoViewModel_LicenceInfoSpecificsViewModel_licenceDate']")
	@CacheLookup
	public WebElement dtStartDate;

	// Aeronautical Aircraft this button in every page

	@FindBy(id = "next")
	@CacheLookup
	public WebElement btnNext_page;

	@FindBy(xpath = "//*[@id=\"next\"]/span")
	@CacheLookup
	public WebElement btnNext_page1;

	@FindBy(id = "next")
	@CacheLookup
	public WebElement btnNext_page2;

	// Aircraft Information

	@FindBy(id = "subProductList_internalList_0_aircraftInfoViewModel_registrationId")
	@CacheLookup
	public WebElement dropRegistrationId;

	@FindBy(id = "subProductList_internalList_0_aircraftInfoViewModel_registrationMark")
	@CacheLookup
	public WebElement txtRegistrationNo;

	@FindBy(id = "subProductList_internalList_0_aircraftInfoViewModel_manufacturer")
	@CacheLookup
	public WebElement txtMakeofAircraft;

	@FindBy(id = "subProductList_internalList_0_aircraftInfoViewModel_model")
	@CacheLookup
	public WebElement txtModel;

	@FindBy(xpath = "//div[@class='filter-option-inner-inner']")
	@CacheLookup
	public WebElement dropEquipmentTypes;

	@FindBy(xpath = "//ul[@class='dropdown-menu inner show']//span[contains(text(),'2 GHz Complementary Ground Components (CGC)')]")
	@CacheLookup
	public WebElement dropElement;

	// Attached Document

	@FindBy(xpath = "//div[@id=\"mandatoryDropZone1\"]")
	@CacheLookup
	public WebElement atcPassport;

	@FindBy(xpath = "//div[@id=\"mandatoryDropZone2\"]/div")
	@CacheLookup
	public WebElement atcCertificateA;

	@FindBy(xpath = "//div[@id=\"mandatoryDropZone3\"]/div")
	@CacheLookup
	public WebElement atcCertificateB;

	// Terms and Conditions

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div/label/span[1]")
	@CacheLookup
	public WebElement selTerms;

	// Summary page

	@FindBy(xpath = "//button[@id=\"validate\"]")
	@CacheLookup
	public WebElement btnValidate;

	@FindBy(xpath = "//button[@id=\"estimate\"]")
	@CacheLookup
	public WebElement btnEstimate;

	@FindBy(xpath = "//button[@id=\"productSubmit\"]")
	@CacheLookup
	public WebElement btnSubmit;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	@CacheLookup
	public WebElement btnNext;

}
