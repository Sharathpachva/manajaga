package manajaga.stepdef;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class RequirePropertyPgValidation 
{

	@When("^User select Require Property and select PG$")
	public void user_select_Require_Property_and_select_PG() throws Throwable 
	{
		BaseTest.driver.findElement(By.xpath("//label[@for='RequiredProperty']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]")).click();
		BaseTest.driver.findElement(By.xpath("//label[@for='n_pp_tenant']")).click();
		BaseTest.driver.findElement(By.xpath("//label[@for='ReqPG']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
	
	}

	@Then("^Apartment fields for RPPG are displayed$")
	public void apartment_fields_for_PG_are_displayed() throws Throwable 
	{
	   
		CommonMethods.FieldValidation("req-totalfloors");
		CommonMethods.FieldValidation("req-floorno");
		CommonMethods.FieldValidation("req-needfor");
		CommonMethods.FieldValidation("req-OccupancyRequired");
		CommonMethods.FieldValidation("req-pgAge");
		CommonMethods.FieldValidation("req-AvailableStatus");
		CommonMethods.FieldValidation("req-TenantsPrefer");
		CommonMethods.FieldValidation("req-roomsPrefer");
		CommonMethods.FieldValidation("req-bedsInroom");
		CommonMethods.FieldValidation("req-waterfacility");
		CommonMethods.FieldValidation("req-AttachedBathRoom");
		CommonMethods.FieldValidation("req-SharingBathRoom");
		CommonMethods.FieldValidation("req-Balcony");
		CommonMethods.FieldValidation("req-ccArea");
		CommonMethods.FieldValidation("req-meals");
		CommonMethods.FieldValidation("req-Laundry");
		CommonMethods.FieldValidation("req-Cooking");
		CommonMethods.FieldValidation("req-Guests");
		CommonMethods.FieldValidation("req-Pets");
		CommonMethods.FieldValidation("req-TimingRestrictions");
		CommonMethods.FieldValidation("req-FurnishingDetails");
		CommonMethods.FieldValidation("req-Watchmen");
		CommonMethods.FieldValidation("req-CCCameras");
		CommonMethods.FieldValidation("req-RentDetails");
		CommonMethods.FieldValidation("req-expprice");
		CommonMethods.FieldValidation("req-responsefrom");
	}

	@Then("^Residential House fields for RPPG are displayed$")
	public void residential_House_fields_for_PG_are_displayed() throws Throwable 
	{
	   
		CommonMethods.SelectDD("requirePropertyType", "Residential House");
		CommonMethods.FieldValidation("req-totalfloors");
		CommonMethods.FieldValidation("req-floorno");
		CommonMethods.FieldValidation("req-needfor");
		CommonMethods.FieldValidation("req-OccupancyRequired");
		CommonMethods.FieldValidation("req-pgAge");
		CommonMethods.FieldValidation("req-AvailableStatus");
		CommonMethods.FieldValidation("req-TenantsPrefer");
		CommonMethods.FieldValidation("req-roomsPrefer");
		CommonMethods.FieldValidation("req-bedsInroom");
		CommonMethods.FieldValidation("req-waterfacility");
		CommonMethods.FieldValidation("req-AttachedBathRoom");
		CommonMethods.FieldValidation("req-SharingBathRoom");
		CommonMethods.FieldValidation("req-Balcony");
		CommonMethods.FieldValidation("req-ccArea");
		CommonMethods.FieldValidation("req-meals");
		CommonMethods.FieldValidation("req-Laundry");
		CommonMethods.FieldValidation("req-Cooking");
		CommonMethods.FieldValidation("req-Guests");
		CommonMethods.FieldValidation("req-Pets");
		CommonMethods.FieldValidation("req-TimingRestrictions");
		CommonMethods.FieldValidation("req-FurnishingDetails");
		CommonMethods.FieldValidation("req-Watchmen");
		CommonMethods.FieldValidation("req-CCCameras");
		CommonMethods.FieldValidation("req-RentDetails");
		CommonMethods.FieldValidation("req-expprice");
		CommonMethods.FieldValidation("req-responsefrom");
		
	}

	      
	@When("^User Select Apartment Property type for Require Property PG$")
	public void User_Select_Apartment_Property_type_for_Require_Property_PG() throws Throwable
	{
		CommonMethods.SelectDD("requirePropertyTypePG", "Apartment");
	}
	
	@When("^User Select residential House Property type Require Property PG$")
	public void User_Select_residential_House_Property_type_for_Post_Property_PG() throws Throwable
	{
		CommonMethods.SelectDD("requirePropertyTypePG", "Residential House");
	}
	
	@Given("^User Navigate to Post Free Window$")
	public void User_Navigate_to_Post_Free_Window()
	{
		BaseTest.driver.findElement(manajaga_elements.PostFree_btn).click();
	}
}
