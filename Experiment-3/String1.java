
package experiment2;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        boolean result = isAnagram(s, t);
        System.out.println("Is t an anagram of s? " + result);
    }

    public static boolean isAnagram(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}
//use small words as it is case sensitive
//forgot to convert string to char
