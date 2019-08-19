package com.test.java8;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
//import junit.framework.Assert;
import cucumber.api.java8.En;

import static org.junit.Assert.*;

public class TestSumJava8 implements En 
{
	
	private int n1;
	private int n2;
	private int sum;
	
	
	public TestSumJava8() {
		 Before(new String[]{"@web"}, (Scenario scenario) -> {
			 System.out.println("Before Web");
		 });
		 
		 Before(new String[]{"@google"}, 0, 10, (Scenario scenario) -> {
			 System.out.println("Before Google");
	        });
	Given("^I have two numbers$", () -> {
		 n1= 22;
		   n2= 23;
		   sum = 0;
	});

	When("^I pass those two numbers to the sum method of Math class$", () -> {
		System.out.println("passNumbers");
	});

	Then("^the result should be verified$", () -> {
		System.out.println("Get the Sum Now");
		sum = n1 + n2;
		assertEquals(45, sum);
	    
	});
	
	After(new String[]{"@web"}, (Scenario scenario) -> {
		System.out.println("After web");
    });
	
	After(new String[]{"@google"}, (Scenario scenario) -> {
		System.out.println("aftre google");
    });
	}
	 
    
	/*//@Given("^I have two numbers$")
	public void getNumbers(){
		   n1= 22;
		   n2= 23;
		   sum = 0;
		}
	
	
	//@When("^I pass those two numbers to the sum method of Math class$")
	public void passNumbers(){
	    System.out.println("passNumbers");
	}

	 
	//@Then("^the result should be verified$")	
	public void getSumAndVerifyIt(){
		System.out.println("Get the Sum Now");
		sum = n1 + n2;
		assertEquals(45, sum);
	    
	}*/

	 
	
	 
}
