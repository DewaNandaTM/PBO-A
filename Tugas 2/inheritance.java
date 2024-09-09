public class Car {
  private String brand;
  private String model;
  private String color;

  public Car(String brand, String model, String color) {
    this.brand = brand;
    this.model = model;
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
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
    System.out.println(getBrand() + " " + getModel() + " is a sedan");
  }

  public static void main(String[] args) {
    Sedan mySedan = new Sedan("Toyota", "Supra", "Red");
    mySedan.viewCarInfo();
  }
}
