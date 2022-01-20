package org.kro.bo;

import org.kro.error.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

	@Autowired
	private CustomerRepository custRepository;

	public Customer getByKey(CustomerKey key) throws InvalidInputException {

		if (key == null) {
			throw new InvalidInputException("No CustomerKey provided");
		}
		if (key.getCustomerId() == null) {
			throw new InvalidInputException("Customer Id is null");
		}

		return custRepository.getById(key);
	}

	public Customer save(Customer customer) throws InvalidInputException {

		if (customer == null) {
			throw new InvalidInputException("No Customer provided");
		}
		if (customer.getKey() == null) {
			throw new InvalidInputException("No CustomerKey provided");
		}
		if (customer.getKey().getCustomerId() == null) {
			throw new InvalidInputException("Customer Id is null");
		}

		return custRepository.save(customer);
	}

	public Boolean existsByKey(CustomerKey key) throws InvalidInputException {

		if (key == null) {
			throw new InvalidInputException("No CustomerKey provided");
		}
		if (key.getCustomerId() == null) {
			throw new InvalidInputException("Customer Id is null");
		}

		return custRepository.existsById(key);
	}

	public void deleteByKey(CustomerKey key) throws InvalidInputException {

		if (key == null) {
			throw new InvalidInputException("No CustomerKey provided");
		}
		if (key.getCustomerId() == null) {
			throw new InvalidInputException("Customer Id is null");
		}

		custRepository.deleteById(key);
	}

}
