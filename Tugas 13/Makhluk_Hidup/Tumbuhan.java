public class Tumbuhan extends MakhlukHidup {
    public Tumbuhan(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(name + " bernapas melalui daun dan memerlukan oksigen serta karbon dioksida.");
    }

    @Override
    public void grow() {
        System.out.println(name + " memerlukan air dan sinar matahari untuk tumbuh.");
    }
}
