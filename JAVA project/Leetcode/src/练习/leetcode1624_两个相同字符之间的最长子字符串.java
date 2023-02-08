package 练习;

import java.util.ArrayList;
import java.util.List;

public class leetcode1624_两个相同字符之间的最长子字符串 {
    public static void main(String[] args) {
        maxLengthBetweenEqualCharacters("\"afrrgadefa\"");
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                continue;
            }
            ;
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    list.add(s.charAt(i));
                    int temp = j - i - 1;
                    if (temp > result) {
                        result = temp;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
