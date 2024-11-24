public class Rabbit extends Animal {
    public Rabbit(int x, int y, int gridSize) {
        super(x, y, gridSize);
    }

    @Override
    public void move() {
        x += (int) (Math.random() * 3) - 1;
        y += (int) (Math.random() * 3) - 1;
        keepInBounds();
    }

    @Override
    public void interact(Animal other) {
        if (other instanceof Fox) {
            alive = false;
        }
    }
}
