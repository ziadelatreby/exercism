import java.util.Map;

class SqueakyClean {
    private static final char HYPHEN = '-';
    private static final Map<Character, Character> REPLACEMENTS = Map.of(
            ' ', '_',
            '0', 'o',
            '1', 'l',
            '3', 'e',
            '4', 'a',
            '7', 't');

    static String clean(String identifier) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean shouldCharacterBeUpperCased = false;

        for (char character : identifier.toCharArray()) {
            if (REPLACEMENTS.containsKey(character)) {
                stringBuilder.append(REPLACEMENTS.get(character));
            }

            if (character == HYPHEN) {
                shouldCharacterBeUpperCased = true;
            }

            if (Character.isLetter(character)) {
                if (shouldCharacterBeUpperCased) {
                    character = Character.toUpperCase(character);
                    shouldCharacterBeUpperCased = false;
                }
                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }
}