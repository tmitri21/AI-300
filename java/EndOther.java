/**
 * Case-insensitive check whether either string appears at the end of the other.
 */
public final class EndOther {

    private EndOther() {
    }

    /**
     * @param a first string
     * @param b second string
     * @return true if {@code a} ends with {@code b} or {@code b} ends with {@code a}, ignoring case
     */
    public static boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        return aLower.endsWith(bLower) || bLower.endsWith(aLower);
    }
}
