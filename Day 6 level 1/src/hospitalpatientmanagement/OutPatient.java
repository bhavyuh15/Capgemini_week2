package hospitalpatientmanagement;

// OutPatient Class: Represents patients visiting for consultation
public class OutPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private String medicalHistory;
    private double consultationFee;  // Consultation fee for out-patient
    private String record;           // Medical record details

    // Constructor to initialize outpatient-specific details
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Override method to calculate the total bill
    @Override
    public double calculateBill() {
        return consultationFee + 200; // Fixed extra charge for out-patients
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
