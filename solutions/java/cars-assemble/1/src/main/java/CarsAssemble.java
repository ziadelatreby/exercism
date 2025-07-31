public class CarsAssemble {
    private static final int PRODUCTION_RATE = 221;
    private static final int minutesInHour = 60;
    private static final double getSuccessRate(int speed) {
        if (speed >= 1 && speed <= 4)
            return 1.00;
        if (speed >= 5 && speed <= 8)
            return 0.90;
        if (speed == 9)
            return 0.80;
        if (speed == 10)
            return 0.77;
        return 0.00;    
    } 

    public double productionRatePerHour(int speed) {
        return speed * PRODUCTION_RATE * getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / minutesInHour;
    }
}
