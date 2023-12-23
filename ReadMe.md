This project is made with help of spring-booot , Mysql and Thymeleaf

# ***
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