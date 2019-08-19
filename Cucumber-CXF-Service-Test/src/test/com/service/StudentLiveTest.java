package test.com.service;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.junit.Before;
import org.junit.Test;

public class StudentLiveTest {
    private static QName SERVICE_NAME = new QName("http://cxf.com/", "StudentService");
    private static QName PORT_NAME = new QName("http://cxf.com/", "StudentPort");

    private Service service;    

    {
        service = Service.create(SERVICE_NAME);
        final String endpointAddress = "http://localhost:8090/StudentApp/services/StudentPort";
        service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, endpointAddress);
    }

    @Before
    public void initTestInstances() {
       
        //Student student= service.getPort(PORT_NAME, Student.class);
    }
    
    @Test
    public void verifyStudentServiceAddress() {
         
      //  assertEquals(localResponse, endpointResponse);
    }

    @Test
    public void verifyStudentServiceGetDetails() {
         
        //assertEquals(localResponse, endpointResponse);
    }

    @Test
    public void verifyStudentServiceUpdate() {
         
       // assertEquals(localResponse, endpointResponse);
    }

    
}