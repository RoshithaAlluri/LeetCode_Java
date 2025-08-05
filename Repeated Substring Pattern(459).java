class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String dup=s+s;
        return dup.indexOf(s,1)<s.length();
    }
}