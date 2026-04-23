/**
 * Returns the substring between the first and last occurrence of "bread",
 * or the empty string if "bread" does not appear at least twice.
 */
public class Sandwich {

    public static String getSandwich(String str) {
        final String bread = "bread";
        int first = str.indexOf(bread);
        int last = str.lastIndexOf(bread);
        if (first == -1 || last == -1 || first == last) {
            return "";
        }
        return str.substring(first + bread.length(), last);
    }
}
