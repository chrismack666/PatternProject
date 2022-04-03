public class CarAdapter extends CarParkingLight {
    CarRunningLigth carRunningLigth;

    public CarAdapter(CarRunningLigth carRunningLigth) {
        this.carRunningLigth = carRunningLigth;
    }

    public void ligthsOn() {
       carRunningLigth.ligthsOn();
    }
}
