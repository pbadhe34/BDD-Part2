
package cxf.com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.7
 * Mon Aug 19 22:53:25 IST 2019
 * Generated source version: 3.2.7
 */

@XmlRootElement(name = "readMarksResponse", namespace = "http://com.cxf/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readMarksResponse", namespace = "http://com.cxf/")

public class ReadMarksResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

