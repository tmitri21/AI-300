/**
 * "xyz" substring counts only when it is not immediately preceded by '.'.
 */
public final class XyzThere {

    private XyzThere() {
    }

    /**
     * @param str input string
     * @return true if {@code str} contains {@code "xyz"} not directly preceded by {@code '.'}
     */
    public static boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
}
