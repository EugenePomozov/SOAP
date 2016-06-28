
package by.epamlab.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removeCustomerById", namespace = "http://epamlab.by/")
@XmlType(name = "removeCustomerById", namespace = "http://epamlab.by/")
@XmlAccessorType(XmlAccessType.FIELD)
public class RemoveCustomerById {

    @XmlElement(name = "arg0", namespace = "")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int arg0) {
        this.arg0 = arg0;
    }

}
