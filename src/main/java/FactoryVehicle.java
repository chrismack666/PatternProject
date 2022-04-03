public class FactoryVehicle {
    public Vehicle getVehicle(VehicleType type) {
        Vehicle vehicle = null;

        switch (type) {
            case BICYCLE:
                vehicle = new Bicycle();
                break;
            case MOTORBIKE:
                vehicle = new Motorbike();
                break;
            case CAR:
                vehicle = new Car();
                break;
            case TRUCK:
                vehicle = new Truck();
                break;
        }
        return vehicle;
    }
}
