import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example Usage
        System.out.println("Enter teacher's name:");
        String name = scanner.nextLine();

        System.out.println("Enter teacher's email:");
        String email = scanner.nextLine();

        System.out.println("Enter teacher's phone number:");
        String phoneNumber = scanner.nextLine();

        Teacher teacher = new Teacher(name, email, phoneNumber);

        System.out.println("Select room type (1. Standard, 2. Family, 3. Double Family):");
        int roomType = scanner.nextInt();

        Room selectedRoom;
        switch (roomType) {
            case 1:
                selectedRoom = new StandardRoom();
                break;
            case 2:
                selectedRoom = new FamilyRoom();
                break;
            case 3:
                selectedRoom = new DoubleFamilyRoom();
                break;
            default:
                System.out.println("Invalid room type. Defaulting to Standard Room.");
                selectedRoom = new StandardRoom();
        }

        System.out.println("Enter booking duration (in days):");
        int duration = scanner.nextInt();

        double totalRent = selectedRoom.calculateRent(duration);

        // Display booking details
        System.out.println("\nBooking Details:");
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Email: " + teacher.getEmail());
        System.out.println("Phone Number: " + teacher.getPhoneNumber());
        selectedRoom.displayDetails();
        System.out.println("Booking Duration: " + duration + " days");
        System.out.println("Total Rent: $" + totalRent);

        scanner.close();
    }

}