import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance = null;
    private PrintWriter writer;

    private Logger(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Logger getInstance(String fileName) {
        if (instance == null) {
            instance = new Logger(fileName);
        }
        return instance;
    }

    public void logQuantityWheels(Vehicle vehicle) {
        writer.println("Vehicle has " + vehicle.getQuantityWheels() + " wheels");
    }

    public void logLightsOn(Car car) {
        writer.println(car.typeLight + " lights on");
    }
}
