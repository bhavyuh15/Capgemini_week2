package employeemanagementsystem;
//absract base class Employee
public abstract class Employee {
    //fields
    private String employeeId;
    private String name;
    private double baseSalary;

    //getter and setter method
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    //abstract method
    public abstract double calculateSalary();

    //constructor to initialize value
    Employee(String employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    //concrete method
    public void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Employee ID: "+ employeeId);
        System.out.println("Base Salary: "+ baseSalary);

    }
}




