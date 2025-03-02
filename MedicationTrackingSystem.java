public class MedicationTrackingSystem {
    private Patient[] patients;
    private Doctor[] doctors;
    private Medication[] medications;
    private Prescription[] prescriptions;

    private int patientCount = 0;
    private int doctorCount = 0;
    private int medicationCount = 0;
    private int prescriptionCount = 0;

    public MedicationTrackingSystem() {
        this.patients = new Patient[10];
        this.doctors = new Doctor[10];
        this.medications = new Medication[10];
        this.prescriptions = new Prescription[10];
    }

    // Add a patient
    public void addPatient(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount++] = patient;
        } else {
            System.out.println("Patients list is full.");
        }
    }

    // Add a medication
    public void addMedication(Medication medication) {
        if (medicationCount < medications.length) {
            medications[medicationCount++] = medication;
        } else {
            System.out.println("Medications list is full.");
        }
    }

    // Add a doctor
    public void addDoctor(Doctor doctor) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount++] = doctor;
        } else {
            System.out.println("Doctors list is full.");
        }
    }

    // Delete a patient
    public void deletePatient(String id) {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getFullName().contains(id)) {
                patients[i] = patients[patientCount - 1];
                patients[patientCount - 1] = null;
                patientCount--;
                System.out.println("Patient deleted.");
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // Delete a medication
    public void deleteMedication(String id) {
        for (int i = 0; i < medicationCount; i++) {
            if (medications[i].getId().contains(id)) {
                medications[i] = medications[medicationCount - 1];
                medications[medicationCount - 1] = null;
                medicationCount--;
                System.out.println("Medication deleted.");
                return;
            }
        }
        System.out.println("Medication not found.");
    }

    // Delete a doctor
    public void deleteDoctor(String id) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getFullName().contains(id)) {
                doctors[i] = doctors[doctorCount - 1];
                doctors[doctorCount - 1] = null;
                doctorCount--;
                System.out.println("Doctor deleted.");
                return;
            }
        }
        System.out.println("Doctor not found.");
    }

    // Edit a patient
    public void editPatient(String id, String name, int age, String phoneNumber) {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getFullName().contains(id)) {
                patients[i].setFullName(name.split(" ")[0], name.split(" ")[1]); // Update name
                patients[i].setAge(age);
                patients[i].setPhoneNumber(phoneNumber);
                System.out.println("Patient details updated.");
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // Edit a medication
    public void editMedication(String id, String name, String dose, int quantityInStock) {
        for (int i = 0; i < medicationCount; i++) {
            if (medications[i].getId().contains(id)) {
                medications[i].setName(name);
                medications[i].setDose(dose);
                medications[i].setQuantityInStock(quantityInStock);
                System.out.println("Medication details updated.");
                return;
            }
        }
        System.out.println("Medication not found.");
    }

    // Edit a doctor
    public void editDoctor(String id, String name, int age, String phoneNumber, String specialization) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getFullName().contains(id)) {
                doctors[i].setFullName(name.split(" ")[0], name.split(" ")[1]); // Update name
                doctors[i].setAge(age);
                doctors[i].setPhoneNumber(phoneNumber);
                doctors[i].setSpecialization(specialization);
                System.out.println("Doctor details updated.");
                return;
            }
        }
        System.out.println("Doctor not found.");
    }

    // Search for a patient
    public void searchPatientByName(String name) {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getFullName().contains(name)) {
                System.out.println(patients[i]);
            }
        }
    }

    // Search for a medication
    public void searchMedicationByName(String name) {
        for (int i = 0; i < medicationCount; i++) {
            if (medications[i].getName().contains(name)) {
                System.out.println(medications[i]);
            }
        }
    }

    // Search for a doctor
    public void searchDoctorByName(String name) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getFullName().contains(name)) {
                System.out.println(doctors[i]);
            }
        }
    }

    // Accept a prescription
    public void acceptPrescription(Prescription prescription) {
        prescriptions[prescriptionCount++] = prescription;
        System.out.println("Prescription for " + prescription.getPatient().getFullName() + " has been added.");
    }

    // Add a patient to a doctor list
    public void addPatientToDoctor(String doctorName, Patient patient) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getFullName().contains(doctorName)) {
                doctors[i].addPatient(patient);
                System.out.println("Patient " + patient.getFullName() + " added to Dr. " + doctorName + "'s list.");
                return;
            }
        }
        System.out.println("Doctor not found.");
    }

    // Generate a report containing all data
    public void generateReport() {
        System.out.println("Medication Report:");
        for (int i = 0; i < medicationCount; i++) {
            System.out.println(medications[i]);
        }

        System.out.println("\nPatient Report:");
        for (int i = 0; i < patientCount; i++) {
            System.out.println(patients[i]);
        }

        System.out.println("\nDoctor Report:");
        for (int i = 0; i < doctorCount; i++) {
            System.out.println(doctors[i]);
        }

        System.out.println("\nPrescription Report:");
        for (int i = 0; i < prescriptionCount; i++) {
            System.out.println(prescriptions[i]);
        }
    }

    // Check for expired medications
    public void checkExpiredMedications() {
        long currentTime = System.currentTimeMillis();
        boolean expiredFound = false;
        for (int i = 0; i < medicationCount; i++) {
            if (medications[i].getExpiryDate() < currentTime) {
                expiredFound = true;
                System.out.println("Expired medication found: " + medications[i]);
            }
        }
        if (!expiredFound) {
            System.out.println("No expired medications found.");
        }
    }

    // Print a list of prescriptions for a doctor
    public void printPrescriptionsByDoctor(String doctorName) {
        System.out.println("Prescriptions by Dr. " + doctorName + ":");
        for (int i = 0; i < prescriptionCount; i++) {
            if (prescriptions[i].getDoctor().getFullName().contains(doctorName)) {
                System.out.println(prescriptions[i]);
            }
        }
    }

    // Restock all medications
    public void restockMedications(int quantity) {
        for (int i = 0; i < medicationCount; i++) {
            medications[i].setQuantityInStock(medications[i].getQuantityInStock() + quantity);
            System.out.println("Medication " + medications[i].getId() + " restocked. New stock: " + medications[i].getQuantityInStock());
        }
    }
}
