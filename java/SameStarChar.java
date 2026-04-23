/**
 * Returns true if for every '*' in the string, when there are characters both
 * immediately before and after the star, those two characters are the same.
 * A star at index 0 or at the last index is ignored (no pair to check).
 */
public class SameStarChar {

    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz")); // true
        System.out.println(sameStarChar("xy*zzz")); // false
        System.out.println(sameStarChar("*xa*az")); // true
    }
}
