package workshopapp;

public class WorkshopApp {
    public static void main(String[] args) {
        WorkshopRegistration workshop = new WorkshopRegistration();
        
        try {
            System.out.println("Attempting to register participant (Age: 16)...");
            workshop.registerParticipant("Ahmed", 16);
            
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}