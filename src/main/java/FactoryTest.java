public class FactoryTest {
    public static void main(String[] args) {
        FactoryVehicle factory = new FactoryVehicle();

        Logger logger = Logger.getInstance("src/main/resources/VehicleReport.txt");
        VehicleType type = VehicleType.BICYCLE;
        Vehicle vehicle = factory.getVehicle(type);
        logger.logQuantityWheels(vehicle);

        type = VehicleType.CAR;
        vehicle = factory.getVehicle(type);
        logger.logQuantityWheels(vehicle);

        type = VehicleType.TRUCK;
        vehicle = factory.getVehicle(type);
        logger.logQuantityWheels(vehicle);

        type = VehicleType.MOTORBIKE;
        vehicle = factory.getVehicle(type);
        logger.logQuantityWheels(vehicle);

        CarParkingLight carParkingLight = new CarParkingLight();
        carParkingLight.ligthsOn();
        CarAdapter carAdapter = new CarAdapter(new CarRunningLigth());
        carAdapter.ligthsOn();
    }
}
