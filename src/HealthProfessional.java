public class HealthProfessional {
        // Instance variables
        private int id;
        private String name;
        private String specialization; // An additional relevant variable

        // Default constructor
        public HealthProfessional() {

        }

        // Constructor that initializes all instance variables
        public HealthProfessional(int id, String name, String specialization) {
            this.id = id;
            this.name = name;
            this.specialization = specialization;
        }

        // Method to print all instance variables
        public void printDetails() {
            System.out.println("Health Professional Details:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Specialization: " + specialization);
        }

        // Getters and setters (optional, but recommended for encapsulation)
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSpecialization() {
            return specialization;
        }

        public void setSpecialization(String specialization) {
            this.specialization = specialization;
        }
    }
    
