class uc6 {

    // Method to build O
    static String[] buildO() {
        return new String[]{
            "  ***  ",
            " **  ** ",
            "**    **",
            "**    **",
            "**    **",
            " **  ** ",
            "  ***  "
        };
    }

    // Method to build P
    static String[] buildP() {
        return new String[]{
            " ****  ",
            "**   **",
            "**   **",
            "****   ",
            "**     ",
            "**     ",
            "**     "
        };
    }

    // Method to build S
    static String[] buildS() {
        return new String[]{
            " **** ",
            "**    ",
            "**    ",
            " ***  ",
            "    **",
            "    **",
            " **** "
        };
    }

    public static void main(String args[]) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", O[i], O[i], P[i], S[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}