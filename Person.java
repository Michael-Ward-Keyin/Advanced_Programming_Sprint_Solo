public class Person {
    private String fullName;
    private int age;
    private String phoneNumber;

    
    public Person(String firstName, String lastName, int age, String phoneNumber) {
        this.fullName = firstName + " " + lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

   
    public void setFullName(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return this.getFullName() + ", Age: " + this.age + ", Phone: " + this.phoneNumber;
    }
}
