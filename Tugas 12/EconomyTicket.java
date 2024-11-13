public class EconomyTicket extends Ticket {
    public EconomyTicket(String passenger, String destination, double price) {
        super(passenger, destination, price);
        facilities.add("Baggage: 2");
        facilities.add("Standard seat");
        facilities.add("Free water");
    }

    @Override
    public double calculateFare() {
        return price * 0.9;
    }

    @Override
    public String getTicketClass() {
        return "Economy";
    }
}
