
package by.epamlab.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import by.epamlab.Customer;

@XmlRootElement(name = "getCustomerByIdResponse", namespace = "http://epamlab.by/")
@XmlType(name = "getCustomerByIdResponse", namespace = "http://epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCustomerByIdResponse {

    @XmlElement(name = "return", namespace = "")
    private Customer _return;

    public Customer getReturn() {
        return this._return;
    }

    public void setReturn(Customer _return) {
        this._return = _return;
    }

}
