package springbootthymeleafwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootthymeleafwebapp.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
