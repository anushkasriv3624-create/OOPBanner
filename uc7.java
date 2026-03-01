```class CharacterPattern {

    private char character;
    private String[] pattern;

    // Constructor
    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    // Getter
    public String[] getPattern() {
        return pattern;
    }
}

public class uc7 {

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
            "  ***  ",
            " **  ** ",
            "**    **",
            "**    **",
            "**    **",
            " **  ** ",
            "  ***  "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            " ****  ",
            "**   **",
            "**   **",
            "****   ",
            "**     ",
            "**     ",
            "**     "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " **** ",
            "**    ",
            "**    ",
            " ***  ",
            "    **",
            "    **",
            " **** "
        });

        String[] banner = new String[7];

        String[] Opat = O.getPattern();
        String[] Ppat = P.getPattern();
        String[] Spat = S.getPattern();

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", Opat[i], Opat[i], Ppat[i], Spat[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}```