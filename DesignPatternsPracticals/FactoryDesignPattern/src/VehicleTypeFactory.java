public class VehicleTypeFactory {
    public VehicleType selectVehicleType(String vehicle)
        {
            if (vehicle == null || vehicle.isEmpty())
                return null;
            switch (vehicle) {
                case "Car":
                    return new Car();
                case "Van":
                    return new Van();
                case "Bus":
                    return new Bus();
                default:
                    throw new IllegalArgumentException("Unknown type "+vehicle);
            }
        }

}
