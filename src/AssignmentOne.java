import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        // Creating three General Practitioner objects
        HealthProfessional gp1 = new GeneralPractitioner(1, "Lei Jun", "Surgery", 10);
        HealthProfessional gp2 = new GeneralPractitioner(2, "Wang Fang", "Pediatrics", 25);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Li Lei", "Internal Medicine", 15);

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
        Patient patient1 = new Patient("Huang Lin", "15751521771", 45, "Male");
        Patient patient2 = new Patient("Zhao Si", "15623478965", 23, "Female");
        createAppointment(appointments, patient1, "09:00", gp1);
        createAppointment(appointments, patient2, "11:25", gp2);

        // Make another 2 appointments with psychologists
        Patient patient3 = new Patient("Tao Zhe", "13611572216", 53, "Male");
        Patient patient4 = new Patient("Wu Bai", "13442041879", 47, "Female");
        createAppointment(appointments, patient3, "16:00", sp1);
        createAppointment(appointments, patient4, "18:30", sp2);


        // Print existing appointments
        System.out.println("\nInitial Appointments:");

        // Cancel one of the existing appointments
        System.out.println("\nCancelling an appointment:");
        cancelAppointment(appointments, "13442041879");

        // Print again existing appointments
        System.out.println("\nUpdated Appointments:");
        printAppointments(appointments);

        System.out.println("------------------------------");
    }

    // Method for creating an appointment
    public static void createAppointment(ArrayList<Appointment> appointments, Patient patient, String timeSlot, HealthProfessional doctor) {
        if (patient == null || timeSlot == null || doctor == null) {
            System.out.println("Error: Cannot create appointment. Missing information.");
            return;
        }
        appointments.add(new Appointment(patient, timeSlot, doctor));
        System.out.println("Appointment created successfully.");
    }

    public static void printAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        for (Appointment appt : appointments) {
            appt.printAppointmentDetails();
            System.out.println("------------------------------");
        }
    }

    public static void cancelAppointment(ArrayList<Appointment> appointments, String mobilePhone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatient().getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled successfully.");
                return;
            }
        }
        System.out.println("Error: No appointment found for the given mobile phone number.");
    }

}