public class Fox extends Animal {
    public Fox(int x, int y, int gridSize) {
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
        if (other instanceof Rabbit && other.isAlive()) {
            other.alive = false;
        }
    }
}
