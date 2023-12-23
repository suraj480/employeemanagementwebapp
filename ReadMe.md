# This project is made with help of spring-booot , Mysql and Thymeleaf

![flow](https://github.com/suraj480/employeemanagementwebapp/assets/72219318/950f2c14-36e6-4030-aa0e-a87f6ee0cd11)

![employee-management-webapp-dependecies](https://github.com/suraj480/employeemanagementwebapp/assets/72219318/4635f9f0-a965-494a-b4e4-93594cca6c2c)

![image](https://github.com/suraj480/employeemanagementwebapp/assets/72219318/35c6fa10-8c8b-40e1-b552-4ee3013036d6)

## Important steps :-
1. Add dependecy (spring web ,javax,spring-boot-devtools,spring-data-jpa,thymeleaf,hibernate-core)
2. Create packages (controller, model, repository, service)
3. Define pojo(plain old java object) class inside entity packages and add @Entity
@Table(name="students")  @Column(name="first_name",nullable=false) notations it will automatically create table in db if its not there  with specifed table name and column name
4. Add service inside EmployeeService packages 
5. Inside EmployeeService  packacges implement EmployeeServiceImpl and just hover over it and add unimplemented method
6. In controller Handler method to handle list employees and return model and view

Note:- Springboot will automatically find all Thymeleaf files inside template folder hence keep all thymeleaf file inside template folder

7. Add this on top of main method else autotmatic table creation wont happen @EntityScan("springbootthymeleafwebapp")

8. Add this on top of main method (else you will face db connection issue as it is for enabeling all packages)
 @ComponentScan(basePackages = {"springbootthymeleafwebapp.controller","springbootthymeleafwebapp.model","springbootthymeleafwebapp.repository","springbootthymeleafwebapp.service"})
@EnableJpaRepositories(basePackages = {"springbootthymeleafwebapp.controller","springbootthymeleafwebapp.model","springbootthymeleafwebapp.repository","springbootthymeleafwebapp.service"})

### Enable below in application.properties for better debugging
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.springframework=DEBUG
logging.level.org.hibernate=DEBUG
logging.level.root=INFO
logging.level.org.springframework.data.jpa=DEBUG

## Steps for adding employee
1. first complete the EmployeeService and EmployeeServiceImpl
2. add button in index.html to redirect
3. add method handler showNewEmployeeForm
4. Inside employeeController
5. Design addEmployeeForm.html
6. now in addEmployeeForm.html in form we define action th:action="@{/saveEmployee}"
7. above action we will use to save data to database

## Steps for update employee (only new things mentioned)
 @PathVariable is used to bind id with parametet
 This is used to show previous data in field (its like getter method) th:field="*{firstName}" 

 ![image](https://github.com/suraj480/employeemanagementwebapp/assets/72219318/39ac0a19-bf99-4d43-94e7-76484b17bb8b)

## Delete employee

![image](https://github.com/suraj480/employeemanagementwebapp/assets/72219318/597dc686-b6c0-4391-8809-ec5df89e5da9)
