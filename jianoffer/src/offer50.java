import java.util.HashMap;
import java.util.Map;

public class offer50 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, false);
            } else {
                map.put(c, true);
            }
        }
        for (int i = 0; i < s.length();i++) {
            char c = s.charAt(i);
            if (map.get(c)){
                return c;
            }

        }
        return ' ';
    }
//测试
    public static void main(String[] args) {
    offer50 o = new offer50();
    String s = "leetcode";
    System.out.println(o.firstUniqChar(s));
    }
}