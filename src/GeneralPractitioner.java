public class GeneralPractitioner extends HealthProfessional {
    // Additional instance variable
    private int feeOfRegistration;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.feeOfRegistration = 0;
    }

    // Constructor that initializes all instance variables
    public GeneralPractitioner(int id, String name, String specialization, int feeOfRegistration) {
        super(id, name, specialization);
        this.feeOfRegistration = feeOfRegistration;
    }

    // Method to print health professional details
    @Override
    public void printDetails() {
        System.out.println("General Practitioner Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("feeOfRegistration: " + feeOfRegistration);
    }

    // Getter and setter for yearsOfExperience
    public int getFeeOfRegistration() {
        return feeOfRegistration;
    }

    public void setFeeOfRegistration(int feeOfRegistration) {
        this.feeOfRegistration = feeOfRegistration;
    }
}


