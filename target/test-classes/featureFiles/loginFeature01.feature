Feature: Authorized external user applies for an aircraft licence

Background:
		Given Open the URL "https://dev.myspectra.app/office/"
    And Click on Login button and user should login home page
    When login with authorized uesrname "sash" and password "Coforge@1234"
    And click on Login button

   Scenario: New application for Aircraft
		   Given user should be on the new application page
		   And click on the Aircraft and route to the Licence Info
			 When click on Next button and route to the Aircraft Information
		   And fill all mandatory details
		   Then click on next button and route to Attachments
		   And Attached documnet and select terms and condition 
		   And check validation and check Estimatefee
		   And click on Submit application 
		  