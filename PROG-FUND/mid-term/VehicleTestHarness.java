public class VehicleTestHarness {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle("red", "motorcycle");
    System.out.println(v1);

    System.out.println("----------------------------------------");

    Vehicle v2 = new Vehicle();

    v2.setColor("blue");
    v2.setTypeOfVehicle("car");

    System.out.println(v2);
  }
}
