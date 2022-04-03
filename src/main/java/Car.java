public class Car extends Vehicle {
    public final LightsType typeLight;

    public Car() {
        super(4);
        this.typeLight = LightsType.PARKING;
    }

    public Car(LightsType typeLight) {
        super(4);
        this.typeLight = typeLight;
    }
}
