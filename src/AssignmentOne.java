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
    }
}
