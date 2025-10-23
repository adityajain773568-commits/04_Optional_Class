package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;

import java.util.List;
import java.util.Optional;

public class Demo2 {
    static void main() {
        Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(710);

        /*
        * Fetch value from optional employee or else get employee from default
        constructor  */

        System.out.println("---Or Else---");
        Employee employee = optionalEmployee.orElse(GeneratorUtil.populateEmployee());
        System.out.println(employee);

        System.out.println("---OrElseGet---");
        Employee employee1 = optionalEmployee.orElseGet(GeneratorUtil::populateEmployee);
        System.out.println(employee);
    }


}
