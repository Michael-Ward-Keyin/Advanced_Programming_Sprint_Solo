public class Prescription {
    private String id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private long prescriptionExpiry;

    
    public Prescription(String id, Doctor doctor, Patient patient, Medication medication) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.prescriptionExpiry = System.currentTimeMillis() + 365L * 24L * 60L * 60L * 1000L; // One year from current time
    }

   
    public Doctor getDoctor() {
        return this.doctor;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public Medication getMedication() {
        return this.medication;
    }

    public String getId() {
        return this.id;
    }

    public long getPrescriptionExpiry() {
        return this.prescriptionExpiry;
    }

    @Override
    public String toString() {
        return "Prescription ID: " + this.id + ", Doctor: " + this.doctor.toString() + ", Patient: " + this.patient.toString() + ", Medication: " + this.medication.toString() + ", Prescription Expiry: " + new java.util.Date(this.prescriptionExpiry);
    }
}
