package com.test.java7;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
//import junit.framework.Assert;

import static org.junit.Assert.*;

public class TestSumJava7  {
	
	private int n1;
	private int n2;
	private int sum;
	
	@Before
	public void init(Scenario scenario) {
		System.out.println("Before scenario in the same pack: " + scenario.getName());
		
		System.out.println("Before scenario status :"+scenario.getStatus());
		
    }

	@After
	public void afterTest(Scenario scenario) {
		System.out.println("After scenario : " + scenario.getName());
		System.out.println("After scenario status :"+scenario.getStatus());
		 
    }
    
	@Given("^I have two numbers$")
	public void getNumbers(){
		   n1= 22;
		   n2= 23;
		   sum = 0;
		}
	
	
	@When("^I pass those two numbers to the sum method of Math class$")
	public void passNumbers(){
	    System.out.println("passNumbers");
	}

	 
	@Then("^the result should be verified$")	
	public void getSumAndVerifyIt(){
		System.out.println("Get the Sum Now");
		sum = n1 + n2;
		assertEquals(45, sum);
	    
	}

	 
	
	 
}
