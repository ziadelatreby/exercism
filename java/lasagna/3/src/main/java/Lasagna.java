public class Lasagna {
    private static final int ovenCookingTimeInMinutes = 40;
    private static final int layerPreparationTimeInMinutes = 2;
    
    public int expectedMinutesInOven() {
        return ovenCookingTimeInMinutes;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * layerPreparationTimeInMinutes;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
}
