package src.com.scaleupindia.com.scaleupindia.utility;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GeneratorUtil {

    private GeneratorUtil() {
    }

    public static List<Employee> populateEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Abhishek", 10));
        employeeList.add(new Employee(177, "Aditya", 70));
        employeeList.add(new Employee(183, "Tannu", 40));
        employeeList.add(new Employee(69, "Tanish", 90));
        employeeList.add(new Employee(169, "Gangrade", 19));
        employeeList.add(new Employee(435, "Akshat", 69));
        return employeeList;

    }
    public static Employee populateEmployee(){
        return new Employee();
    }

    public static Employee populateEmployee2(){
        return null;
    }

    public static Optional<Employee> fetchEmployeeByMarks(int marks){
        return populateEmployees().stream().filter(employee -> employee.getMarks()==marks).findFirst();
    }

}
