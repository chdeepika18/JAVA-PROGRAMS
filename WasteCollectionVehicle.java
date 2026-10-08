public class MuncipalWasteCollectionOptimizer {
    public static void main(String[] args) {
        // Vehicle details
        int vehicleNumber = 2026;         
        double wasteCollectedKg = 1250.75; 
        int collectionPoints = 15;        
        char vehicleStatus = 'A';           

        // Displaying details
        System.out.println("Waste Collection Vehicle Details:");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollectedKg + " kg");
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
    }
}