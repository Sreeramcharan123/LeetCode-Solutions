class Solution {
    public int minimumPushes(String word) {
        int a = word.length() >> 3;
        int b = word.length() & 7;
        return ((a<<2)+b) * (a+1);
    }
}