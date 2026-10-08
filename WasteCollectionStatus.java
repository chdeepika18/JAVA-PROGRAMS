import java.util.Scanner;

public class WasteCollectionStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read waste collected
        System.out.print("Enter waste collected in kilograms: ");
        double wasteCollected = sc.nextDouble();

        // Check status using if-else
        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        sc.close();
    }
}
