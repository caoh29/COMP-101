class Vehicle {
  // attributes
  private String color;
  private String typeOfVehicle;

  // Constructors
  Vehicle() {
  }

  Vehicle(String color, String typeOfVehicle) {
    this.color = color;
    this.typeOfVehicle = typeOfVehicle;
  }

  // getters and setters
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getTypeOfVehicle() {
    return typeOfVehicle;
  }

  public void setTypeOfVehicle(String typeOfVehicle) {
    this.typeOfVehicle = typeOfVehicle;
  }

  @Override
  public String toString() {
    return "Vehicle type: " + getTypeOfVehicle() + " and color: " + getColor();
  }
}