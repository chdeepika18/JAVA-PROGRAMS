import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;
    double totalAmount;
    double discount;
    double finalAmount;

    // Parameterized constructor
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculates total amount
    double calculateTotal() {
        totalAmount = ticketPrice * numberOfTickets;
        return totalAmount;
    }

    // Calculates discount
    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            discount = totalAmount * 0.10;
        } else {
            discount = 0;
        }
        return discount;
    }

    // Calculates final amount after discount
    double calculateFinalAmount() {
        finalAmount = totalAmount - discount;
        return finalAmount;
    }

    // Displays the complete bill
    void displayBill() {
        System.out.printf("Movie Name: %s\n", movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
        System.out.printf("Number of Tickets: %d\n", numberOfTickets);
        System.out.printf("Total Amount: %.2f\n", totalAmount);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Amount: %.2f\n", finalAmount);
    }
}

public class Main50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();
        
        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();
        
        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = sc.nextInt();
        
        // Create object using constructor
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);
        
        // Invoke calculation methods
        ticket.calculateTotal();
        ticket.calculateDiscount();
        ticket.calculateFinalAmount();
        
        // Display bill
        System.out.println("\n--- Booking Bill ---");
        ticket.displayBill();
        
        sc.close();
    }
}