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
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  public void viewCarInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Color: " + color);
  }

   public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Supra", "Red");
    myCar.viewCarInfo();
  }
}
