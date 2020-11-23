package pageMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObject.newApplication_object;
import org.openqa.selenium.interactions.Actions;

public class newApplication_method {

	newApplication_object newapp = new newApplication_object();

	public WebDriver driver;

	public newApplication_method(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, newapp);
	}
	// Aircraft Information Details
	// Home page

	public void clkApplicatios() {
		newapp.clkapp_home.click();
	}

	public void clkNewApp() {
		newapp.clknewApp_home.click();
	}

	public void clkAircraft() {
		newapp.clkAircraft.click();
	}

	// Licence Info

	public void clkNexT() {
		newapp.btnNext_page.click();
	}

	public void clkNextPage() {
		newapp.btnNext_page1.click();
	}

	public void clkNextPage1() {
		// Actions act = new Actions(driver);

		// act.moveToElement(newapp.btnNext_page2).click().perform();
		newapp.btnNext_page2.click();
	}

	public void clkplusLicensee() {
		newapp.btnLicensee.click();
	}

	public void clkLicenceContact() {
		newapp.btnLicenceContact.click();
	}

	public void clkPaymentContact() {
		newapp.btnPaymentContact.click();
	}

	public void selReferenceLicensee() {

		newapp.txtReferenceNumber.sendKeys("l");
		List<WebElement> listLic = driver.findElements(By.xpath(
				"//button[@class='dropdown-item']//child::ul[@class='suggestion-list']//child::li[@class='suggestion-list-item']"));

		for (int i = 0; i <= listLic.size(); i++) {
			if (listLic.get(i).getText().contains("10_COMPANY t01")) {
				listLic.get(i).click();
				break;
			}
		}

		listLic.clear();
	}

	/*
	 * public void selReferenceLicCont() {
	 * 
	 * newapp.txtReferenceNumber.sendKeys("L"); List<WebElement> listLiCo =
	 * driver.findElements(By.xpath(
	 * "//button[@class='dropdown-item']//child::ul[@class='suggestion-list']//child::li[@class='suggestion-list-item']"
	 * )); System.out.println(listLiCo.size());
	 * 
	 * for(int i=0; i<listLiCo.size();i++) {
	 * System.out.println(listLiCo.get(i).getText());
	 * if(listLiCo.get(i).getText().contains("10_C_REF_NUM")) {
	 * listLiCo.get(i).click(); break; } } listLiCo.clear(); }
	 * 
	 * public void selReferencePayCont() {
	 * 
	 * newapp.txtReferenceNumber.sendKeys("L"); List<WebElement> list =
	 * driver.findElements(By.
	 * xpath("//button[@class='dropdown-item active']//child::ul[@class='suggestion-list']//child::li[@class='suggestion-list-item font-weight-bold']"
	 * ));
	 * 
	 * for(int i=0; i<=list.size();i++) {
	 * if(list.get(i).getText().contains("10_C_P_")) { list.get(i).click(); break; }
	 * } }
	 */

	public void clkSelect() {

		newapp.btnSelect.click();
		// Actions action = new Actions(driver);

		// Action mouseOver = action.moveToElement(newapp.btnSelect).build();
		// mouseOver.perform();

	}

	public void setClassAircraft() {
		Select classAir = new Select(newapp.dropClassAircraft);

		classAir.selectByValue("TC");
	}

	public void setStartDate() {
		newapp.dtStartDate.click();
	}

	public void setRegistrationId() {
		Select regid = new Select(newapp.dropRegistrationId);

		regid.selectByValue("G");

	}

	public void setRegistrationNo() {
		newapp.txtRegistrationNo.sendKeys("VAVG");
	}

	public void setMakeofAircraft() {
		newapp.txtMakeofAircraft.sendKeys("BOEING");
	}

	public void setModel() {
		newapp.txtModel.sendKeys("777");
	}

	public void setEquipmenttypes() {
		newapp.dropEquipmentTypes.click();
		newapp.dropElement.click();
		newapp.dropEquipmentTypes.click();
	}

	// Attached Document

	public static void setClipBoard(String file) {
		// File Location
		StringSelection select = new StringSelection("D:\\Attached_aircraft\\" + file);

		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

	}

	public static void uploadfile(String filepath) throws AWTException, InterruptedException {
		setClipBoard(filepath);
		Robot robot = new Robot();
		Thread.sleep(1000);

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Wait
		Thread.sleep(1000);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		// Wait
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void setPassport() throws AWTException, InterruptedException {
		Actions act = new Actions(driver);

		act.moveToElement(newapp.atcPassport).click().perform();
		// mouseOver.perform();

		uploadfile("‪Passport.txt");
	}

	public void setCertificateA() throws AWTException, InterruptedException {
		Actions act = new Actions(driver);

		act.moveToElement(newapp.atcCertificateA).click().perform();
		// mouseOver.perform();

		uploadfile("CertificateA.txt");
		// newapp.atcCertificateA.sendKeys("‪D:\\Attached_aircraft\\CertificateA.txt");
	}

	public void setCertificateB() throws AWTException, InterruptedException {
		Actions act = new Actions(driver);

		act.moveToElement(newapp.atcCertificateB).click().perform();
		// mouseOver.perform();

		uploadfile("CertificateB.txt");
		// newapp.atcCertificateB.sendKeys("‪D:\\Attached_aircraft\\CertificateB.txt");
	}

	// Terms and Conditions

	public void clkTerms() {
		if (!newapp.selTerms.isSelected()) {
			newapp.selTerms.click();
		}
	}

	// Summery page

	public void clkValidate() {
		newapp.btnValidate.click();
	}

	public void clkEstimate() {
		newapp.btnEstimate.click();
	}

	public void clkSubmit() {
		newapp.btnSubmit.click();
	}

	public void btnNext() {
		newapp.btnNext.click();
	}

}
