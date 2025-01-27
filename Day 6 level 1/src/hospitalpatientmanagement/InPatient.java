package hospitalpatientmanagement;

// InPatient Class: Represents hospitalized patients
public class InPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private String medicalHistory;
    private double roomCharge;  // Room charges for in-patient
    private String record;      // Medical record details

    // Constructor to initialize inpatient-specific details
    public InPatient(String patientId, String name, int age, double roomCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
    }

    // Override method to calculate the total bill
    @Override
    public double calculateBill() {
        return roomCharge + 1000; // Fixed extra charge for in-patients
    }

    // Override method to add medical records
    @Override
    public void addRecord(String record) {
        this.record = record;
    }

    // Override method to view medical records
    @Override
    public String viewRecords() {
        return "Medical Record for " + getName() + ": " + record;
    }
}
