public class Appointment {
    private Patient patient;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {

    }

    // Constructor that initializes all instance variables
    public Appointment(Patient patient, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patient = patient;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Method to print all instance variables
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        patient.printPatientDetails();
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Selected Doctor:");
        if (selectedDoctor != null) {
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor selected");
        }
    }

    // Getters and setters
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}
