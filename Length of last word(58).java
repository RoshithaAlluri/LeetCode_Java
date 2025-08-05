class Solution {
    public int lengthOfLastWord(String s) {
        String [] array=s.trim().split("\\s+");
        return array[array.length - 1].length();
    }
}