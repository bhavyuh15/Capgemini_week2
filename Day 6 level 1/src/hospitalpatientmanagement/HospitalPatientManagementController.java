package hospitalpatientmanagement;

// Main Class to Test the Implementation
public class HospitalPatientManagementController {
    // Method to display billing details for any patient type (polymorphism)
    public static void displayBillingDetails(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());
    }

    public static void main(String[] args) {
        // Create InPatient and OutPatient objects
        Patient inPatient = new InPatient("IP001", "SRK", 45, 2000);
        Patient outPatient = new OutPatient("OP001", "Yash", 30, 500);

        // Add medical records for each patient
        ((MedicalRecord) inPatient).addRecord("Diagnosed with pneumonia.");
        ((MedicalRecord) outPatient).addRecord("Consulted for a routine check-up.");

        // Display billing details for both patients
        displayBillingDetails(inPatient);
        displayBillingDetails(outPatient);

        // View medical records for both patients
        System.out.println(((MedicalRecord) inPatient).viewRecords());
        System.out.println(((MedicalRecord) outPatient).viewRecords());
    }
}
