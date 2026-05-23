import java.util.*;

class Solution {
    static String removeChars(String str1, String str2) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str2.length(); i++) {
            set.add(str2.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (!set.contains(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}