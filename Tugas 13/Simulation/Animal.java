public abstract class Animal {
    protected int x, y; 
    protected boolean alive = true;
    protected int gridSize;

    public Animal(int x, int y, int gridSize) {
        this.x = x;
        this.y = y;
        this.gridSize = gridSize;
    }

    public abstract void move();
    public abstract void interact(Animal other);

    public boolean isAlive() {
        return alive;
    }

    protected void keepInBounds() {
        if (x < 0) x = 0;
        if (y < 0) y = 0;
        if (x >= gridSize) x = gridSize - 1;
        if (y >= gridSize) y = gridSize - 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
