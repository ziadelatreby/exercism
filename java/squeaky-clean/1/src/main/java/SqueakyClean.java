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

        for (int i = 0; i < identifier.length(); i++) {
            char character = identifier.charAt(i);

            if (REPLACEMENTS.containsKey(character)) {
                stringBuilder.append(REPLACEMENTS.get(character));
            }

            else if (character == HYPHEN) {
                i++;
                if (i < identifier.length()) {
                    char nextCharacter = identifier.charAt(i);
                    if (Character.isLetter(nextCharacter)) {
                        stringBuilder.append(Character.toUpperCase(nextCharacter));
                    }
                }
            }

            else if (Character.isLetter(character)) {
                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }
}