package pageDefination;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageMethod.loginpagemethod;
import pageMethod.newApplication_method;

public class loginpageStepdefination {

	public WebDriver driver;
	public loginpagemethod mymet;
	public newApplication_method mynewmet;

	// Login functionality

	@Given("Open the URL {string}")
	public void open_the_url(String url) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Project_WorkSpace\\BddWithTestND\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		mymet = new loginpagemethod(driver);
	}

	@Given("Click on Login button and user should login home page")
	public void click_on_login_button_and_user_should_login_home_page() {
		mymet.navLoginPage();
	}

	@When("login with authorized uesrname {string} and password {string}")
	public void login_with_authorized_and(String username, String password) {
		mymet.setUserName(username);

		mymet.setPassword(password);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		mymet.clklogin();
	}

	@Then("Authorized user login successfully")
	public void authorized_user_login_successfully() {
		System.out.println("Title of the page " + driver.getTitle());
		Assert.assertEquals("Integrated and Automated ", driver.getTitle());

	}

	// Aircraft Information Details

	@Given("user should be on the new application page")
	public void user_should_be_on_the_new_application_page() {
		mynewmet = new newApplication_method(driver);
		mynewmet.clkApplicatios();
		mynewmet.clkNewApp();
	}

	@Given("click on the Aircraft and route to the Licence Info")
	public void click_on_the_aircraft_and_route_to_the_licence_info() throws InterruptedException {
		mynewmet.clkAircraft();
		if (driver.getPageSource().contains("Licence Info")) {
			System.out.println("Title of the page " + driver.getTitle());
			Assert.assertEquals("Licence Info", driver.getTitle());

			mynewmet.clkplusLicensee();
			mynewmet.selReferenceLicensee();
			mynewmet.clkSelect();

			Thread.sleep(2000);

			/*
			 * mynewmet.clkLicenceContact(); mynewmet.selReferenceLicCont();
			 * mynewmet.clkSelect();
			 * 
			 * Thread.sleep(2000);
			 * 
			 * mynewmet.clkPaymentContact(); mynewmet.selReferencePayCont();
			 * mynewmet.clkSelect();
			 */

			mynewmet.setClassAircraft();
			mynewmet.setStartDate();

		} else {
			driver.close();
			Assert.assertTrue(false);
		}

	}

	@When("click on Next button and route to the Aircraft Information")
	public void click_on_next_button_and_route_to_the_aircraft_information() {
		mynewmet.clkNexT();

		if (driver.getPageSource().contains("Aircraft Information")) {
			System.out.println("Title of the page " + driver.getTitle());
			Assert.assertEquals("Aircraft Information", driver.getTitle());

		} else {
			driver.close();
			Assert.assertTrue(false);
		}

	}

	@When("fill all mandatory details")
	public void fill_all_mandatory_details() {
		mynewmet.setRegistrationId();
		mynewmet.setRegistrationNo();
		mynewmet.setMakeofAircraft();
		mynewmet.setModel();
		mynewmet.setEquipmenttypes();

	}

	@Then("click on next button and route to Attachments")
	public void click_on_next_button_and_route_to_attachments() throws InterruptedException {
		mynewmet.btnNext();

		Thread.sleep(1000);
		// driver.close();

	}

	@Then("Attached documnet and select terms and condition")
	public void attached_documnet_and_select_terms_and_condition() throws AWTException, InterruptedException {

		if (driver.getPageSource().contains("Attachments")) {
			System.out.println("Title of the page " + driver.getTitle());
			Assert.assertEquals("Attachments", driver.getTitle());

			mynewmet.setPassport();
			mynewmet.setCertificateA();
			mynewmet.setCertificateB();
			mynewmet.clkNextPage();

		} else {
			driver.close();
			Assert.assertTrue(false);
		}

		if (driver.getPageSource().contains("Terms and Conditions")) {
			System.out.println("Title of the page " + driver.getTitle());
			Assert.assertEquals("Terms and Conditions", driver.getTitle());

			Thread.sleep(3000);
			mynewmet.clkTerms();

			Thread.sleep(3000);
			mynewmet.clkNextPage1();

		} else {
			driver.close();
			Assert.assertTrue(false);
		}

	}

	@Then("check validation and check Estimatefee")
	public void check_validation_and_check_estimatefee() {

		if (driver.getPageSource().contains("Summary")) {
			System.out.println("Title of the page " + driver.getTitle());
			Assert.assertEquals("Summary", driver.getTitle());

			mynewmet.clkValidate();
			mynewmet.clkEstimate();
			// mynewmet.clkSubmit();

		} else {
			driver.close();
			Assert.assertTrue(false);
		}

	}

	@Then("click on Submit application")
	public void click_on_submit_application() {

		mynewmet.clkSubmit();
		if (driver.getPageSource().contains("Submit Results")) {
			System.out.println("Title of the page " + driver.getTitle());
			Assert.assertEquals("Submit Results", driver.getTitle());

		} else {
			driver.close();
			Assert.assertTrue(false);
		}

	}

}
