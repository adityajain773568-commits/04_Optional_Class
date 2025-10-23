package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;
import src.com.scaleupindia.com.scaleupindia.utility.InputUtil;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo1 {
    static void main() {

        Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(70);
        System.out.println(optionalEmployee);

//        Fetch value from optional employee.

        System.out.println("---GET---");
        Employee employee = optionalEmployee.get();
        System.out.println(employee);

    }


}
