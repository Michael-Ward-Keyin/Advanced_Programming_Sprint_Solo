/**
 * Represents a prescription which has a doctor, a patient, a medication and a prescription expiry date.
 */
public class Prescription {
    private String id; //Identifier for prescription
    private Doctor doctor; // Doctor who gave prescription
    private Patient patient; // Patient for prescription
    private Medication medication; // Prescribed medication
    private long prescriptionExpiry; // Expiry date of prescription

    /**
     * Constructs prescription object
     * 
     * @param id
     * @param doctor
     * @param patient
     * @param medication
     */
    public Prescription(String id, Doctor doctor, Patient patient, Medication medication) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.prescriptionExpiry = System.currentTimeMillis() + 365L * 24L * 60L * 60L * 1000L; // One year from current time
    }

    /**
     * Returns doctor
     * 
     * @return
     */
    public Doctor getDoctor() {
        return this.doctor;
    }

    /**
     * Returns patient
     * 
     * @return
     */
    public Patient getPatient() {
        return this.patient;
    }

    /**
     * Returns medication
     * 
     * @return
     */
    public Medication getMedication() {
        return this.medication;
    }

    /**
     * Returns prescription ID
     * 
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * Returns prescription expiry date
     * 
     * @return
     */
    public long getPrescriptionExpiry() {
        return this.prescriptionExpiry;
    }

    /**
     * Makes a string to represent the prescription
     * 
     * @return
     */
    @Override
    public String toString() {
        return "Prescription ID: " + this.id + ", Doctor: " + this.doctor.toString() + ", Patient: " + this.patient.toString() + ", Medication: " + this.medication.toString() + ", Prescription Expiry: " + new java.util.Date(this.prescriptionExpiry);
    }
}
