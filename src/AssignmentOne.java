import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        // Creating three General Practitioner objects
        HealthProfessional gp1 = new GeneralPractitioner(1, "Lei Jun", "Surgery", 10);
        HealthProfessional gp2 = new GeneralPractitioner(2, "Wang Fang", "Pediatrics", 15);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Li Lei", "Internal Medicine", 8);

        // Creating two Specialist objects
        HealthProfessional sp1 = new Psychologist(20, "Zhang San", "Traditional Chinese Medical Science", true);
        Psychologist sp2 = new Psychologist(21, "Li Si", "Neurology", false);

        // Printing details of all health professionals
        System.out.println("Health Professionals Details:");
        System.out.println("------------------------------");

        gp1.printDetails();
        System.out.println("------------------------------");

        gp2.printDetails();
        System.out.println("------------------------------");

        gp3.printDetails();
        System.out.println("------------------------------");

        sp1.printDetails();
        System.out.println("------------------------------");

        sp2.printDetails();
        System.out.println("------------------------------");


        // Part 5 – Collection of appointments
         ArrayList<Appointment> appointments = new ArrayList<>();
        System.out.println("Part 5 – Collection of appointments");

        // Make 2 appointments with general practitioners
        Patient patient1 = new Patient("Huang Lin", "15851521771", 45, "Male");
        Patient patient2 = new Patient("Zhao Si", "15623478965", 23, "Female");
        createAppointment(appointments,patient1, "08:00", gp1);
        createAppointment(appointments,patient2, "11:23", gp2);

        // Make another 2 appointments with psychologists
        Patient patient3 = new Patient("Bob Johnson", "345-678-9012", 50, "Male");
        Patient patient4 = new Patient("Alice Brown", "456-789-0123", 42, "Female");
        createAppointment(appointments,patient3, "14:00", sp1);
        createAppointment(appointments,patient4, "15:30", sp2);


        // Print existing appointments
        System.out.println("\nInitial Appointments:");

        // Cancel one of the existing appointments
        System.out.println("\nCancelling an appointment:");
        cancelBooking(appointments,"234-567-8901");

        // Print again existing appointments
        System.out.println("\nUpdated Appointments:");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");

}
    public static void createAppointment(ArrayList<Appointment> Appointment,  Patient patient, String preferredTimeSlot, HealthProfessional doctor) {
        if (patient != null && preferredTimeSlot != null && doctor != null) {
            Appointment newAppointment = new Appointment(patient, preferredTimeSlot, doctor);
            Appointment.add(newAppointment);
            System.out.println("Appointment created successfully.");
        } else {
            System.out.println("Error: Cannot create appointment. Missing information.");
        }
    }

    public static void printExistingAppointments(ArrayList<Appointment> Appointment) {
        if (Appointment.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : Appointment) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(ArrayList<Appointment> Appointment,String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < Appointment.size(); i++) {
            if (Appointment.get(i).getPatient().getMobilePhone().equals(mobilePhone)) {
                Appointment.remove(i);
                System.out.println("Appointment cancelled successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found for the given mobile phone number.");
        }
    }
    }

