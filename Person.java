/**
 * Base for patient and doctor. Stores age name and phone number.
 */
public class Person {
    private String fullName; //Persons full name
    private int age;// Persons age
    private String phoneNumber;// Persons phone number

    /**
     * Constructs the person object
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param phoneNumber
     */

    
    public Person(String firstName, String lastName, int age, String phoneNumber) {
        this.fullName = firstName + " " + lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Combines first and last name to set full name
     * 
     * @param firstName
     * @param lastName
     */
   
    public void setFullName(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
    }

    /**
     * Returns the full name
     * 
     * @return
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Sets persons age
     * 
     * @param age
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets persons phone number
     * 
     * @param phoneNumber
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns persons age
     * 
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Returns persons phone 
     * 
     * @return
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Makes a string from the persons full name age and phone number
     * 
     * @return
     */
    @Override
    public String toString() {
        return this.getFullName() + ", Age: " + this.age + ", Phone: " + this.phoneNumber;
    }
}
