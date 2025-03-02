/**
 * Represents a doctor and takes its information from person.
 */

public class Doctor extends Person {
    private String specialization;// Specialization of the doctor
    private Patient[] patients;// List of patients belonging to doctor
    private int patientCount;// Number of patients

    /**
     * Constructs the doctor object
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param phoneNumber
     * @param specialization
     */
    public Doctor(String firstName, String lastName, int age, String phoneNumber, String specialization) {
        super(firstName, lastName, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new Patient[10]; 
        this.patientCount = 0;
    }

    
    /**
     * Sets the doctors specialization
     * 
     * @param specialization
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Returns their specialization
     * 
     * @return
     */
    public String getSpecialization() {
        return this.specialization;
    }

    /**
     * Adds a patient to their patient list
     * 
     * @param patient
     */
    public void addPatient(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount++] = patient;
        } else {
            System.out.println("Patient list is full.");
        }
    }


    /**
     * Makes a string to represent the doctor
     * 
     * @return
     */
    @Override
    public String toString() {
        StringBuilder patientNames = new StringBuilder();
        for (int i = 0; i < patientCount; i++) {
            patientNames.append(patients[i].getFullName()).append(", ");
        }
        return "Dr. " + this.getFullName() + ", Specialization: " + this.specialization + ", Patients: " + patientNames;
    }
}