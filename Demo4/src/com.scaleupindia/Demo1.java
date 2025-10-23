package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;

import java.util.List;
import java.util.Optional;

public class Demo1 {
    static void main() {

        Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(70);
        System.out.println(optionalEmployee);

        System.out.println("--filter--");

        optionalEmployee.filter(employee -> employee.getAddress().isPresent()).ifPresentOrElse(System.out::println,()-> System.out.println("No such employee found"));


    }


}
