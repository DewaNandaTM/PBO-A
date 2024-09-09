public class Car {
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
}

public class Sedan extends Car {
  public Sedan(String brand, String model, String color) {
    super(brand, model, color);
  }

  @Override
  public void viewCarInfo() {
    super.viewCarInfo();
    System.out.println("This is a sedan.");
  }
}

public class SUV extends Car {
  public SUV(String brand, String model, String color) {
    super(brand, model, color);
  }

  @Override
  public void viewCarInfo() {
    super.viewCarInfo();
    System.out.println("This is an SUV.");
  }
}

public class Main {
  public static void main(String[] args) {
    Car mySedan = new Sedan("Toyota", "Supra", "Red");
    Car mySUV = new SUV("BMW", "X1", "Black");

    mySedan.viewCarInfo();
    mySUV.viewCarInfo();
  }
}
