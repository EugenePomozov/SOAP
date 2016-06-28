package by.epamlab;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import by.epamlab.Customer;

@WebService()
public interface CustomersService {
	@WebMethod
	List<Customer> getAllCustomer();
	@WebMethod
	Customer getCustomerById(int id);
	@WebMethod
	boolean addNewCustomer(Customer newCustomer);
	@WebMethod
	boolean removeCustomerById(int id);
	@WebMethod
	boolean updateCustomer(int id, String name, String phone, String eMail);
	
}
