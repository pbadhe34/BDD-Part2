package cxf.com;

import javax.jws.WebService;

@WebService(targetNamespace = "http://com.cxf/", endpointInterface = "cxf.com.Student", portName = "StudentPortPort", serviceName = "StudentPortService")
public class StudentPort implements Student {

	@Override
	public String getName(int rollno) {
		System.out.println("Student getName for "+rollno);
		String sName = "Student"+rollno;
		return sName;
	}

	@Override
	public int readMarks(String name) {
		System.out.println("Student readMarks for "+name);
		int marks = name.length() + 75/2;
		return marks;
	}

}
