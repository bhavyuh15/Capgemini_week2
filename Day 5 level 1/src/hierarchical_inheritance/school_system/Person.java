package hierarchical_inheritance.school_system;

class Person{
    String name;
    int age;

    // Constructor for hierarchical_inheritance.school_system.hybrid_inheritance.restaurant.Person
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayDetails(){
        System.out.println("Name: " +name);
        System.out.println("Age: "+ age);
    }
}


