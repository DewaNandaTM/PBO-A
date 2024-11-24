public class Simulation {
    public static void main(String[] args) {
        int gridSize = 10;
        int numRabbits = 5;
        int numFoxes = 3;

        Animal[] animals = new Animal[numRabbits + numFoxes];
        for (int i = 0; i < numRabbits; i++) {
            animals[i] = new Rabbit((int) (Math.random() * gridSize), (int) (Math.random() * gridSize), gridSize);
        }
        for (int i = 0; i < numFoxes; i++) {
            animals[numRabbits + i] = new Fox((int) (Math.random() * gridSize), (int) (Math.random() * gridSize), gridSize);
        }

        for (int step = 0; step < 10; step++) {
            System.out.println("Step " + (step + 1));

            for (Animal animal : animals) {
                if (animal.isAlive()) {
                    animal.move();
                }
            }

            for (int i = 0; i < animals.length; i++) {
                for (int j = i + 1; j < animals.length; j++) {
                    if (animals[i].isAlive() && animals[j].isAlive()
                            && animals[i].getX() == animals[j].getX()
                            && animals[i].getY() == animals[j].getY()) {
                        animals[i].interact(animals[j]);
                        animals[j].interact(animals[i]);
                    }
                }
            }

            for (Animal animal : animals) {
                System.out.println((animal instanceof Rabbit ? "Rabbit" : "Fox") +
                        " at (" + animal.getX() + ", " + animal.getY() + ") " +
                        (animal.isAlive() ? "is alive" : "is dead"));
            }
            System.out.println();
        }
    }
}
