package springbootthymeleafwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import springbootthymeleafwebapp.model.Employee;
import springbootthymeleafwebapp.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	// Display List of employees
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Employee> listEmployees = employeeService.getAllEmployees();
		System.out.println("CHEKCING" + listEmployees);
		model.addAttribute("listEmployees", listEmployees);
		return "index";
		// return new ModelAndView("index","listEmployees",listEmployees);
	}

	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		// create a model attribute to bind form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "addFmployeeForm";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
// save employee to database
		employeeService.saveEmployee(employee);
		return "redirect:/";
	}
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get employee from the service
		Employee employee = employeeService.getEmployeeById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("employee", employee);
		return "updateEmployee";
	}
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/";
	}
}
