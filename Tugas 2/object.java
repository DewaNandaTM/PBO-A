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

  public static void main(String[] args) {
    Car car1 = new Car("Toyota", "Supra", "Red");
    car1.viewCarInfo();
  }
}
