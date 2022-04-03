public class CarRunningLigth extends Car {
    public CarRunningLigth() {
        super(LightsType.RUNNING);
    }

    public void ligthsOn() {
        Logger logger = Logger.getInstance("src/main/resources/VehicleReport.txt");
        logger.logLightsOn(this);
    }
}
