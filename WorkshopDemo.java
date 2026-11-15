public class Main {
    public static void main(String[] args) {
        WorkshopRegistration registration = new WorkshopRegistration();

        try {
            System.out.println("Attempting to register a 16-year-old participant...");
            registration.registerParticipant("Ahmed", 16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
