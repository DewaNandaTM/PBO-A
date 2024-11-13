public class BusinessTicket extends Ticket {
    public BusinessTicket(String passenger, String destination, double price) {
        super(passenger, destination, price);
        facilities.add("Baggage: 3");
        facilities.add("Advanced seat");
        facilities.add("Free drinks and snacks of your choice");
    }

    @Override
    public double calculateFare() {
        return price * 1.25;
    }

    @Override
    public String getTicketClass() {
        return "Business";
    }
}
