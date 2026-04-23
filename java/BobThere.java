/**
 * Detects a "bob" pattern where the middle character may be anything: {@code b?b}.
 */
public final class BobThere {

    private BobThere() {
    }

    /**
     * @param str input string
     * @return true if some substring matches {@code 'b' + any char + 'b'}
     */
    public static boolean bobThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}
