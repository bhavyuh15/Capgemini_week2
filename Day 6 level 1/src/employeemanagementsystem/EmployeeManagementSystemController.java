package employeemanagementsystem;

import java.util.ArrayList;

//main class
 public class EmployeeManagementSystemController{
    public static void main(String[] args) {
        //array list to store empolyee
        ArrayList<Employee> employees = new ArrayList<>();
        //create object
        FullTimeEmployee emp1 = new FullTimeEmployee("123","Vivek", 50000, 50000);
        //assign department
        emp1.assignDepartment("HR");
        //adding in list
        employees.add(emp1);

        PartTimeEmployee emp2 = new PartTimeEmployee("124", "Nikhil", 30000,3,400);
        //assign department
        emp2.assignDepartment("IT");
        //adding in list
        employees.add(emp2);

        //displaying emp
        for(Employee emp : employees){
            emp.displayDetails();
            System.out.println();
        }
    }
}
