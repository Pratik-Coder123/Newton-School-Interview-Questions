import java.util.HashSet;
import java.util.LinkedHashSet;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int a = 0;
        int b = 0;
        int max = 0;
        HashSet<Character> set = new LinkedHashSet<>();
        while (a < s.length()) {
            char c = s.charAt(a);
            if (!set.contains(c)) {
                set.add(c);
                a++;
                max = Math.max(max, set.size());
            } else {

                char c1 = s.charAt(b);
                set.remove(c1);
                b++;
            }

        }
        System.out.println(max);
    }
}