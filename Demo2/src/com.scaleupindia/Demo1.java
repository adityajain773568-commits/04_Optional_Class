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

        /* Check if OptionalEmployee is present , if yes then get employees and print its
        value, else print "No employee found".
        * */
        boolean present = optionalEmployee.isPresent();
        if (present){
            Employee employee = optionalEmployee.get();
            System.out.println(employee);
        }else{
            System.out.println("No Employee found. ");
        }

        /* Check if optionalEmployee is empty, if yes then print "No employee found" else
        get employee and print its value.
        * */
        boolean empty = optionalEmployee.isEmpty();
        if (empty){
            System.out.println("NO Employee Found");

        }else {
            Employee employee = optionalEmployee.get();
            System.out.println(employee);
        }

    }


}
