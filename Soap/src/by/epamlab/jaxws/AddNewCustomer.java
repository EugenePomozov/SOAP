
package by.epamlab.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import by.epamlab.Customer;

@XmlRootElement(name = "addNewCustomer", namespace = "http://epamlab.by/")
@XmlType(name = "addNewCustomer", namespace = "http://epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddNewCustomer {

    @XmlElement(name = "arg0", namespace = "")
    private Customer arg0;

    public Customer getArg0() {
        return this.arg0;
    }

    public void setArg0(Customer arg0) {
        this.arg0 = arg0;
    }

}
