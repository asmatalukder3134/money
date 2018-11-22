package teststep;

import java.util.List;

import allFeatures.Base;
import allFeatures.Shared;
import allFeatures.Step1;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination extends Base {
	
    Base b;
	@Given("^openBrowser$")
	public void openbrowser(DataTable arg1) throws Throwable {
	    List<List<String>> data =arg1.raw();
	   String s= data.get(1).get(0);
	     b= new Base();
	    b.openBrowser(s);
	    
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
	   b.nevigateToUrl();
	}

	@When("^user go to sadAndMaOver and eleMaOver$")
	public void user_go_to_sadAndMaOver_and_eleMaOver() throws Throwable {
		Step1 a=new Step1();
	
	}
	
	

	@When("^click on tvs$")
	public void click_on_tvs() throws Throwable {
	   
	} 

	@Then("^go to catagory and  click on less than (\\d+)$")
	public void go_to_catagory_and_click_on_less_than(int arg1) throws Throwable {
	   
	}

	@Then("^click on addtoCart and  click on continue shopping$")
	public void click_on_addtoCart_and_click_on_continue_shopping() throws Throwable {

	}

	@When("^user go to tiresAndAutoMaOver$")
	public void user_go_to_tiresAndAutoMaOver() throws Throwable {
	    
	}

	@When("^click on motorOil$")
	public void click_on_motorOil() throws Throwable {
	    
	}

	@Then("^click on addtoCart and  click on  click on continue shopping$")
	public void click_on_addtoCart_and_click_on_click_on_continue_shopping() throws Throwable {
	    
	}



}
