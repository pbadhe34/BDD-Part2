package test.com.service;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import cxf.com.Student;


public class SoapService_LiveTest implements En{
	
	private HttpURLConnection connection;
	URL wsdlURL = null;
	Service service = null;
	Student proxy = null;
	private static QName SERVICE_NAME = new QName("http://com.cxf/", "StudentPortService");
    private static QName PORT_NAME = new QName("http://com.cxf/", "StudentPortPort");
	
	public SoapService_LiveTest() {
		Before((Scenario scenario) -> {
			System.out.println("Before scenario : " + scenario.getName());
			try {
				wsdlURL = new URL("http://localhost:8090/StudentApp/services/StudentPortPort?wsdl");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});

		After((Scenario scenario) -> {
			System.out.println("After scenario : " + scenario.getName());
			connection.disconnect();
			wsdlURL = null;
		});

		
	Given("^connect to service wsdl URL$", () -> {
		
		try {
			wsdlURL = new URL("http://localhost:8090/StudentApp/services/StudentPortPort?wsdl");
			connection = (HttpURLConnection) wsdlURL.openConnection();
					
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	      
	     
	});

	When("^send request with default http get method$", () -> {
		try {
			connection.setRequestMethod("GET");
			connection.connect();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	});

	Then("^verify the http response code$", () -> {
		int responseCode=0;
		try {
			responseCode = connection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(HttpURLConnection.HTTP_OK, responseCode);
  
	});

	When("^get the service interface$", () -> {
		service = Service.create (wsdlURL, SERVICE_NAME);
		proxy = service.getPort (Student.class);
		       
	});

	Then("^verify the service port Interface$", () -> {
	      assertNotNull(proxy);
	});

	Then("^invoke the getName operation and verify the output$", () -> {
		int rlNo = 1234;
		String name = proxy.getName(rlNo);
		assertEquals("Student"+rlNo, name);	
	    
	});

	Then("^invoke the readMarks operation and verify the output$", () -> {
	    int markScore = proxy.readMarks("Student-Viju");
	    assertEquals(49, markScore);	
	     
	});

}	
	 

}
