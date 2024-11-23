public class Manusia extends MakhlukHidup {
    public Manusia(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(name + " bernapas dengan hidung dan perlu oksigen.");
    }

    @Override
    public void grow() {
        System.out.println(name + " memerlukan sumber makanan yang bervariasi untuk tumbuh.");
    }
}
