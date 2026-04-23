/**
 * XY-balanced strings: every 'x' must have a 'y' somewhere later in the string.
 * One 'y' can satisfy any number of preceding unbalanced 'x' characters.
 */
public final class XyBalance {

    private XyBalance() {
    }

    /**
     * @param str input string (treats only lowercase 'x' and 'y' as special)
     * @return true if the string is xy-balanced
     */
    public static boolean xyBalance(String str) {
        int unbalancedXCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'x') {
                unbalancedXCount++;
            } else if (c == 'y') {
                unbalancedXCount = 0;
            }
        }
        return unbalancedXCount == 0;
    }
}
