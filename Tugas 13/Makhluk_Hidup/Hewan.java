public class Hewan extends MakhlukHidup {
    public Hewan(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(name + " mungkin bernapas dengan hidung dan memerlukan oksigen.");
    }

    @Override
    public void grow() {
        System.out.println(name + " mungkin memerlukan sumber makanan yang bervariasi untuk tumbuh.");
    }
}
