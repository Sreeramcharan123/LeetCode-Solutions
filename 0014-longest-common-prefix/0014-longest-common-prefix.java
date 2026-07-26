class Solution {
    public String longestCommonPrefix(String[] v) {
String prefix = v[0];
for(int i =0;i<v.length;i++){
    while(!v[i].startsWith(prefix)){
        prefix = prefix.substring(0,prefix.length()-1);
    }
}
return prefix;
    }
}
