public class Main {
    public static void main(String[] args) {
        Manusia arya = new Manusia("arya");
        arya.breathe();
        arya.grow();

        Hewan ayam = new Hewan("ayam");
        ayam.breathe();
        ayam.grow();

        Tumbuhan pohon = new Tumbuhan("pohon");
        pohon.breathe();
        pohon.grow();
    }
}
