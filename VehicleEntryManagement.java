import java.util.Scanner;

public class VehicleEntryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int levels = 3;
        int slots = 5;

        boolean[][] occupied = new boolean[levels][slots];

        System.out.println("===== Vehicle Entry Management =====");

        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.nextLine();

        int assignedLevel = -1;
        int assignedSlot = -1;

        // Find nearest available parking slot
        for (int i = 0; i < levels; i++) {
            for (int j = 0; j < slots; j++) {

                if (!occupied[i][j]) {
                    assignedLevel = i + 1;
                    assignedSlot = j + 1;
                    occupied[i][j] = true;
                    break;
                }
            }

            if (assignedLevel != -1) {
                break;
            }
        }

        // Display result
        if (assignedLevel == -1) {

            System.out.println("\nParking Full! No slot available.");

        } else {

            System.out.println("\n----- Vehicle Details -----");
            System.out.println("Vehicle Number: " + vehicleNo);
            System.out.println("Parking Level : " + assignedLevel);
            System.out.println("Parking Slot  : " + assignedSlot);
            System.out.println("Status        : Parking Allocated Successfully");
        }

        sc.close();
    }
}