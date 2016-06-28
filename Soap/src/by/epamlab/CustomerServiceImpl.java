package by.epamlab;

import java.util.List;

import javax.jws.WebService;

import by.epamlab.CustomersService;
import by.epamlab.Customer;

@WebService(endpointInterface = "by.epamlab.CustomersService")
public class CustomerServiceImpl implements CustomersService{
	private Data data=new Data();

	@Override
	public List<Customer> getAllCustomer() {
		return data.getAllCustomer();
	}

	@Override
	public Customer getCustomerById(int id) {
		return data.getCustomerById(id);
	}

	@Override
	public boolean addNewCustomer(Customer newCustomer) {
		return data.addNewCustomer(newCustomer);
	}

	@Override
	public boolean removeCustomerById(int id) {
		return data.removeCustomerById(id);
	}

	@Override
	public boolean updateCustomer(int id, String name, String phone, String eMail) {
		return data.updateCustomer(id, name, phone, eMail);
	}

}
