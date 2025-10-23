package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;

import java.util.Optional;

public class Demo3 {
    static void main() {
        Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(710);
        System.out.println(optionalEmployee);

        /* Fetch Employee from optionalEmployee or throw exception.
        * */
        System.out.println("---orElseThrow---");
        try {

        Employee employee = optionalEmployee.orElseThrow();
        System.out.println(employee);
        }catch (Exception e){
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
