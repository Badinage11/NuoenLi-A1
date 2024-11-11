public class Patient {
    private String name;
    private String mobilePhone;
    private int age;
    private String gender;

    // Default constructor
    public Patient() {

    }

    // Constructor with parameters
    public Patient(String name, String mobilePhone, int age, String gender) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.age = age;
        this.gender = gender;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Method to print patient details
    public void printPatientDetails() {
        System.out.println("Patient Details:");
        System.out.println("Name: " + name);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
