
package by.epamlab.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import by.epamlab.Customer;

@XmlRootElement(name = "getAllCustomerResponse", namespace = "http://epamlab.by/")
@XmlType(name = "getAllCustomerResponse", namespace = "http://epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetAllCustomerResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Customer> _return;

    public List<Customer> getReturn() {
        return this._return;
    }

    public void setReturn(List<Customer> _return) {
        this._return = _return;
    }

}
