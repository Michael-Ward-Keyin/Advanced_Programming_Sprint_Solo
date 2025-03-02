public class Doctor extends Person {
    private String specialization;
    private Patient[] patients;
    private int patientCount;

    public Doctor(String firstName, String lastName, int age, String phoneNumber, String specialization) {
        super(firstName, lastName, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new Patient[10]; 
        this.patientCount = 0;
    }


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void addPatient(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount++] = patient;
        } else {
            System.out.println("Patient list is full.");
        }
    }

    @Override
    public String toString() {
        StringBuilder patientNames = new StringBuilder();
        for (int i = 0; i < patientCount; i++) {
            patientNames.append(patients[i].getFullName()).append(", ");
        }
        return "Dr. " + this.getFullName() + ", Specialization: " + this.specialization + ", Patients: " + patientNames;
    }
}