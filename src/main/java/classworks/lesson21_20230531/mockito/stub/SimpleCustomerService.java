package classworks.lesson21_20230531.mockito.stub;

public class SimpleCustomerService implements CustomerService {

  CustomerRepository customerRepository;

  public SimpleCustomerService(CustomerRepository customerRepository){
    this.customerRepository = customerRepository;
  }

  @Override
  public Customer getCustomerById(long id) {
    return customerRepository.getCustomerById(id);

  }
}