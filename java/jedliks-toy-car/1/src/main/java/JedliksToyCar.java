public class JedliksToyCar {
    private int distanceDriven;
    private int batteryPercentage;

    public JedliksToyCar() {
        distanceDriven = 0;
        batteryPercentage = 100;
    }

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
        return isBatteryCharged()
            ? String.format("Battery at %d%%", batteryPercentage)
            : "Battery empty";
    }

    public void drive() {
        if (isBatteryCharged()) {
            distanceDriven += 20;
            batteryPercentage--;
        }
    }

    private boolean isBatteryCharged() {
        return batteryPercentage > 0;
    }
}
