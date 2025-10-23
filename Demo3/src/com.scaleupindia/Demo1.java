package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;

import java.util.List;
import java.util.Optional;

public class Demo1 {
    static void main() {

        System.out.println("---Of---");
        Employee employee = GeneratorUtil.populateEmployee();
        Optional<Employee> employee1 = Optional.of(employee);

        if (employee1.isPresent()){
            System.out.println(employee1);
        }else {
            System.out.println("No employee found. ");
        }

        System.out.println("---Of---");
        Employee employee2 = GeneratorUtil.populateEmployee2();
        Optional<Employee> employee3 = Optional.of(employee2);
        employee3.ifPresentOrElse(System.out::println,()->
                System.out.println("No such employee found"));


    }


}
