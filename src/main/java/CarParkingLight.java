public class CarParkingLight extends Car {
    public CarParkingLight() {
        super(LightsType.PARKING);
    }

    public void ligthsOn() {
        Logger logger = Logger.getInstance("src/main/resources/VehicleReport.txt");
        logger.logLightsOn(this);
    }
}
