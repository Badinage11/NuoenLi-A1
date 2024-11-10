public class Psychologist extends HealthProfessional {
    // Additional instance variable
    private boolean Internship;

    // Default constructor
    public Psychologist() {
        super();
    }

    // Constructor that initializes all instance variables
    public Psychologist(int id, String name, String specialization, boolean Internship) {
        super(id, name, specialization);
        this.Internship = Internship;
    }

    // Method to print health professional details
    @Override
    public void printDetails() {
        System.out.println("Psychologist Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Internship: " + Internship);
    }

    // Getter and setter for Internship
    public boolean getInternship() {
        return Internship;
    }

    public void setInternship(boolean Internship) {
        this.Internship = Internship;
    }
}
