package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Address;
import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;

import java.util.List;
import java.util.Optional;

public class Demo2 {
    static void main() {

        Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(70);
        System.out.println(optionalEmployee);

        System.out.println("---Map---");
        Optional<String> optionalName = optionalEmployee.map(employee -> employee.getName());
        System.out.println(optionalName);

        optionalName.ifPresentOrElse(System.out::println,()-> System.out.println("No employee found"));

        /* map address of optionalEmployee and save in optionalAddress , Print
        optionalAddress. Map city of optionalAddress , if exists then print value else
        print "No employee found" .
        * */
        System.out.println("----Map1----");
        Optional<Optional<Address>> optionalAddress = optionalEmployee.map(Employee::getAddress);
        System.out.println(optionalAddress);
        Optional<Address> address1 = optionalAddress.map(Optional::get);
        System.out.println(address1);
        Optional<String> optional = address1.map(Address::getCity);
        optional.ifPresentOrElse(System.out::println,()-> System.out.println("No employee found"));

        System.out.println("---Flat Map---");
        Optional<Address> address = optionalEmployee.flatMap(Employee::getAddress);
        Optional<String> optional1 = address.map(Address::getCity);
        optional1.ifPresentOrElse(System.out::println,()-> System.out.println("no employee found"));


    }



}
