class Solution {
    public String reverseWords(String s) {
        String [] array=s.trim().split("\\s+");
        int n=array.length;
        String res="";
        for(int i=n-1;i>=0;i--){
            res += array[i];
            if(i!=0){
                res += " ";
            }
        }
        return res;
    }
}