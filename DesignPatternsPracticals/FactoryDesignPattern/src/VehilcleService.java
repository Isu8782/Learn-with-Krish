public class VehilcleService {
    public static void main(String[] args)
    {
        VehicleTypeFactory vehicleTypeFactory = new VehicleTypeFactory();
        VehicleType vehicleType = vehicleTypeFactory.selectVehicleType("Car");
        vehicleType.selectVehicle();
    }
}
