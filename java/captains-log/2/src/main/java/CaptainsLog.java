import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private static final int MIN_REGISTRY_NUMBER = 1000;
    private static final int MAX_REGISTRY_BOUND = 10000;
    private static final double STARDATE_START = 41000;
    private static final double STARDATE_BOUND = 42000;

    private final Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + random.nextInt(MIN_REGISTRY_NUMBER, MAX_REGISTRY_BOUND);
    }

    double randomStardate() {
        return random.nextDouble(STARDATE_START, STARDATE_BOUND);
    }
}
