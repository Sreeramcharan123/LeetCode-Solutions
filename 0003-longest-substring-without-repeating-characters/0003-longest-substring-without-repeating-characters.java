import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int l=0;
        int r=0;
        int maxLen = 0;
        while (r < n) {
            char ch = s.charAt(r);
            while (set.contains(ch)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}