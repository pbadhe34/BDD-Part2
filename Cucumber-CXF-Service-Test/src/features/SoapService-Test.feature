 Feature: Test the Soap Web Service

  Scenario: Verify the service wsdl URL     
     Given connect to service wsdl URL 
     When send request with default http get method 
	 Then verify the http response code	 
 
  Scenario: Verify the service port    
     Given connect to service wsdl URL 
     When get the service interface 
	 Then verify the service port Interface 
	 
 Scenario: verify the service operation getName
      Given connect to service wsdl URL 
      When get the service interface 
      Then invoke the getName operation and verify the output
	 
Scenario: verify the service operation readMarks
      Given connect to service wsdl URL 
      When get the service interface 
      Then invoke the readMarks operation and verify the output
    
