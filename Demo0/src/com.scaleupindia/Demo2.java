package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;

import java.util.List;
import java.util.Optional;

public class Demo2 {
    static void main() {
        System.out.println(fetchEmployeeByMarks(70));
    }

    public static Optional<Employee> fetchEmployeeByMarks(int marks) {
        /*
         * First populate employee list then iterate over employeeList and check if any employee's marks is equal to marks
         * if yes return that employee.
         * After iterating whole list if no such employee find return null.
         */
        Optional<Employee> first = GeneratorUtil.populateEmployees().stream().filter(employee -> employee.getMarks() == marks).findFirst();
        return first;
    }
}
