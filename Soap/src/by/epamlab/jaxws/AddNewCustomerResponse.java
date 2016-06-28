
package by.epamlab.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addNewCustomerResponse", namespace = "http://epamlab.by/")
@XmlType(name = "addNewCustomerResponse", namespace = "http://epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddNewCustomerResponse {

    @XmlElement(name = "return", namespace = "")
    private boolean _return;

    public boolean isReturn() {
        return this._return;
    }

    public void setReturn(boolean _return) {
        this._return = _return;
    }

}
