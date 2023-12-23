package springbootthymeleafwebapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootthymeleafwebapp.model.Employee;
import springbootthymeleafwebapp.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	 private final EmployeeRepository employeeRepository;

	    @Autowired
	    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
	    System.out.println("Number of employees fetched from database: " + employees.size()); // Add this line for debugging
	    return employees;
		//return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}
}
