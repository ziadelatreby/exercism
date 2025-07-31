import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private static final int MIN_REGISTRY_NUMBER = 1000;
    private static final double STARDATE_START = 41000;

    private final Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return String.format("NCC-%d", MIN_REGISTRY_NUMBER + random.nextInt(9000));
    }

    double randomStardate() {
        return STARDATE_START + 1000 * random.nextDouble();
    }
}
