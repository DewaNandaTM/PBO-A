public class Main {
    public static void main(String[] args) {
        EconomyTicket economyTicket = new EconomyTicket("Alice", "Denpasar", 325);
        economyTicket.displayDetail();

        BusinessTicket businessTicket = new BusinessTicket("Bob", "Mataram", 325);
        businessTicket.displayDetail();

        FirstClassTicket firstClassTicket = new FirstClassTicket("Charlie", "Surabaya", 325);
        firstClassTicket.displayDetail();
    }
}
