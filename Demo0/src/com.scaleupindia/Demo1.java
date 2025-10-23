package src.com.scaleupindia;

import src.com.scaleupindia.com.scaleupindia.entity.Employee;
import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;
import src.com.scaleupindia.com.scaleupindia.utility.InputUtil;

import java.util.List;
import java.util.Scanner;

public class Demo1 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employees you want to fetch!? ");
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int marks = InputUtil.acceptMarksToFindEmployee(scanner);
            System.out.println(fetchEmployeeByMarks(marks));
        }
    }

    // This method will fetch employee details by using marks.
    public static Employee fetchEmployeeByMarks(int marks) {
        /*
         * First populate employee list then iterate over employeeList and check if any employee's marks is equal to marks
         * if yes return that employee.
         * After iterating whole list if no such employee find return null.
         */
        List<Employee> employeeList = GeneratorUtil.populateEmployees();
        for (Employee e : employeeList) {
            if (e.getMarks() == marks) {
                return e;
            }
        }
        return null;
    }
}
