import java.util.Scanner;

public class ShortBudgetAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly budget: ");
        int budget = sc.nextInt();

        int total = 0;
        int choice;
        do {
            System.out.println("\nChoose category: 1.Food 2.Rent 3.Travel 4.Other");
            choice = sc.nextInt();

            System.out.print("Enter expense amount: ");
            int expense = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("Food expense added."); break;
                case 2: System.out.println("Rent expense added."); break;
                case 3: System.out.println("Travel expense added."); break;
                default: System.out.println("Other expense added.");
            }

            total += expense;

            System.out.print("Add more? (1=yes / 0=no): ");
            choice = sc.nextInt();
        } while (choice == 1);

        if (total > budget) {
            System.out.println("\nOver Budget! Total = " + total);
        } else {
            System.out.println("\nWithin Budget. Total = " + total);
        }

        sc.close();
    }
}

