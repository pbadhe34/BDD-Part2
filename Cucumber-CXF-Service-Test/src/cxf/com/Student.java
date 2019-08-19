package cxf.com;

import javax.jws.WebService;

@WebService(name = "Student", targetNamespace = "http://com.cxf/")
public interface Student {
	
	public String getName(int rollno);
	public int readMarks(String name);

}
