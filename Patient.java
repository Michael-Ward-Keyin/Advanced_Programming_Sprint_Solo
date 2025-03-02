public class Patient extends Person {
    private String name;
    private int age;
    private String phoneNumber;

    
    public Patient(String firstName, String lastName, int age, String phoneNumber) {
        super(firstName, lastName, age, phoneNumber);
        this.name = firstName + " " + lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient Name: " + this.name + ", Age: " + this.age + ", Phone: " + this.phoneNumber;
    }
}
