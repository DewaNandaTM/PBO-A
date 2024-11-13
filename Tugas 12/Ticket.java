import java.util.ArrayList;
import java.util.List;

public abstract class Ticket {
    protected String passenger;
    protected String destination;
    protected double price;
    protected List<String> facilities = new ArrayList<>();

    public Ticket(String passenger, String destination, double price) {
        this.passenger = passenger;
        this.destination = destination;
        this.price = price;
    }

    public abstract double calculateFare();
    public abstract String getTicketClass();

    public void displayDetail() {
        System.out.println("Class: " + getTicketClass());
        System.out.println("Passenger name: " + passenger);
        System.out.println("Destination: " + destination);
        System.out.println("Total price: $" + calculateFare());
        for (String facility : facilities) {
            System.out.println("- " + facility);
        }
        System.out.println();
    }
}
