package hospitalpatientmanagement;

// Abstract Class
public abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor to initialize patient details
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract Method to calculate the bill (implementation varies for subclasses)
    public abstract double calculateBill();

    // Concrete Method to fetch patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Encapsulation - Getter Methods to access private fields
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
