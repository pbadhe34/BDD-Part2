$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SoapService-Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Soap Web Service",
  "description": "",
  "id": "test-the-soap-web-service",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1147552,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the service wsdl URL",
  "description": "",
  "id": "test-the-soap-web-service;verify-the-service-wsdl-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "connect to service wsdl URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "send request with default http get method",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify the http response code",
  "keyword": "Then "
});
formatter.match({
  "location": "SoapService_LiveTest.java:54"
});
formatter.result({
  "duration": 144608798,
  "status": "passed"
});
formatter.match({
  "location": "SoapService_LiveTest.java:71"
});
formatter.result({
  "duration": 9162704,
  "status": "passed"
});
formatter.match({
  "location": "SoapService_LiveTest.java:85"
});
formatter.result({
  "duration": 17705628,
  "status": "passed"
});
formatter.after({
  "duration": 2426758,
  "status": "passed"
});
formatter.before({
  "duration": 170920,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify the service port",
  "description": "",
  "id": "test-the-soap-web-service;verify-the-service-port",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "connect to service wsdl URL",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "get the service interface",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify the service port Interface",
  "keyword": "Then "
});
formatter.match({
  "location": "SoapService_LiveTest.java:54"
});
formatter.result({
  "duration": 98164,
  "status": "passed"
});
formatter.match({
  "location": "SoapService_LiveTest.java:97"
});
formatter.result({
  "duration": 356496214,
  "status": "passed"
});
formatter.match({
  "location": "SoapService_LiveTest.java:103"
});
formatter.result({
  "duration": 56974,
  "status": "passed"
});
formatter.after({
  "duration": 70447,
  "status": "passed"
});
formatter.before({
  "duration": 150132,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "verify the service operation getName",
  "description": "",
  "id": "test-the-soap-web-service;verify-the-service-operation-getname",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "connect to service wsdl URL",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "get the service interface",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "invoke the getName operation and verify the output",
  "keyword": "Then "
});
formatter.match({
  "location": "SoapService_LiveTest.java:54"
});
formatter.result({
  "duration": 90080,
  "status": "passed"
});
formatter.match({
  "location": "SoapService_LiveTest.java:97"
});
formatter.result({
  "duration": 31641006,
  "status": "passed"
});
formatter.match({
  "location": "SoapService_LiveTest.java:107"
});
formatter.result({
  "duration": 34257932,
  "status": "passed"
});
formatter.after({
  "duration": 60823,
  "status": "passed"
});
formatter.before({
  "duration": 168996,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "verify the service operation readMarks",
  "description": "",
  "id": "test-the-soap-web-service;verify-the-service-operation-readmarks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "connect to service wsdl URL",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "get the service interface",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "invoke the readMarks operation and verify the output",
  "keyword": "Then "
});
formatter.match({
  "location": "SoapService_LiveTest.java:54"
});
formatter.result({
  "duration": 118951,
  "status": "passed"
});
formatter.match({
  "location": "SoapService_LiveTest.java:97"
});
formatter.result({
  "duration": 45941706,
  "status": "passed"
});
formatter.match({
  "location": "SoapService_LiveTest.java:114"
});
formatter.result({
  "duration": 18114066,
  "status": "passed"
});
formatter.after({
  "duration": 75836,
  "status": "passed"
});
});