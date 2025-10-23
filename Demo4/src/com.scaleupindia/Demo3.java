package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;

import java.util.Optional;

public class Demo3 {
    static void main() {
        /*System.out.println("---Empty---");
        Optional<Employee> optionalEmployee = null;
        optionalEmployee.ifPresentOrElse(System.out::println,()-> System.out.println("No Such Employee found."));*/

        System.out.println("---Empty---");
        Optional<Employee> optionalEmployee2 = Optional.empty();
        optionalEmployee2.ifPresentOrElse(System.out::println,()-> System.out.println("No Such Employee found."));


    }
}
