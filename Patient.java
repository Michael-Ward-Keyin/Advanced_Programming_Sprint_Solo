/**
 * 
 * Represents a patient and takes its information from person.
 * 
 */

public class Patient extends Person {
    
    private String name; //Patients full name
    private int age;//Patients age
    private String phoneNumber;//Patients phone number

    /**
     * Constructs a patient object from the name age and phone number
     *  
     * @param name
     * @param age
     * @param phoneNumber
     */

    
    public Patient(String firstName, String lastName, int age, String phoneNumber) {
        super(firstName, lastName, age, phoneNumber);
        this.name = firstName + " " + lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets the name of the patient
     * @param name
     */
    
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets the age of the patient
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * sets the phone number of the patient
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the name of the patient
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the age of the patient
     * 
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Returns the phone number of the patient
     * 
     * @return
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    /**
     * Makes a string to represent the patient
     * 
     * @return
     */
    @Override
    public String toString() {
        return "Patient Name: " + this.name + ", Age: " + this.age + ", Phone: " + this.phoneNumber;
    }
}
