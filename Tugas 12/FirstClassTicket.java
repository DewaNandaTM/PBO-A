public class FirstClassTicket extends Ticket {
    public FirstClassTicket(String passenger, String destination, double price) {
        super(passenger, destination, price);
        facilities.add("Baggage: 5");
        facilities.add("Private advanced seat");
        facilities.add("Free full course meal of your choice");
    }

    @Override
    public double calculateFare() {
        return price * 1.5;
    }

    @Override
    public String getTicketClass() {
        return "First Class";
    }
}
