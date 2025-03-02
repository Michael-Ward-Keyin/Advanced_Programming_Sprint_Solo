/**
 * This file creates placeholder information and uses it to show the functionality of the other files
 * 
 */
public class Main {
    public static void main(String[] args) {
        MedicationTrackingSystem system = new MedicationTrackingSystem();

        Doctor doctor1 = new Doctor("Dr. Alice", "Johnson", 50, "555-123-4567", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Bob", "Williams", 45, "555-987-6543", "Neurologist");

        Patient patient1 = new Patient("John", "Doe", 30, "123-456-7890");
        Patient patient2 = new Patient("Jane", "Smith", 40, "987-654-3210");

        Medication medication1 = new Medication("MED001", "Aspirin", "500mg", 100);
        Medication medication2 = new Medication("MED002", "Paracetamol", "200mg", 50);

        system.addDoctor(doctor1);
        system.addDoctor(doctor2);
        system.addPatient(patient1);
        system.addPatient(patient2);
        system.addMedication(medication1);
        system.addMedication(medication2);

        system.addPatientToDoctor("Alice", patient1);
        system.addPatientToDoctor("Bob", patient2);

        Prescription prescription1 = new Prescription("PRES001", doctor1, patient1, medication1);
        Prescription prescription2 = new Prescription("PRES002", doctor2, patient2, medication2);

        system.acceptPrescription(prescription1);
        system.acceptPrescription(prescription2);

        System.out.println("\n----- SYSTEM REPORT -----");
        system.generateReport();

        System.out.println("\n----- Search Results -----");
        system.searchMedicationByName("Aspirin");
        system.searchPatientByName("John");
        system.searchDoctorByName("Alice");

        System.out.println("\n----- Expired Medications -----");
        system.checkExpiredMedications();

        System.out.println("\n----- Prescriptions by Dr. Alice -----");
        system.printPrescriptionsByDoctor("Alice");

        System.out.println("\n----- Restocking MED001 -----");
        system.restockMedications(50);

        System.out.println("\n----- UPDATED SYSTEM REPORT -----");
        system.generateReport();
    }
}
