package springbootthymeleafwebapp.service;

import java.util.List;

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

}
