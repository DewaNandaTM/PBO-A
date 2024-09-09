abstract class Car {
  private String brand;
  private String model;
  private String color;

  public Car(String brand, String model, String color) {
    this.brand = brand;
    this.model = model;
    this.color = color;
  }

  public void viewCarInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Color: " + color);
  }

  public abstract void startEngine();
}

class Sedan extends Car {
  public Sedan(String brand, String model, String color) {
    super(brand, model, color);
  }

  @Override
  public void startEngine() {
    System.out.println("The car engine is starting...");
  }
}

public class Main {
  public static void main(String[] args) {
    Sedan myCar = new Sedan("Toyota", "Supra", "Red");
    myCar.viewCarInfo();
    myCar.startEngine();
  }
}
