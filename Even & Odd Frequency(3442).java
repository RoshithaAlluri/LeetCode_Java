class Solution {
    public int maxDifference(String s) {
        HashMap<Character , Integer> dict=new HashMap<>();
        for(char ch : s.toCharArray()){
            if(dict.containsKey(ch)){
                dict.put(ch , dict.get(ch)+1);
            } else {
                dict.put(ch , 1);
            }
        }
        int oddf = 0;
        int evenf = Integer.MAX_VALUE;
        for(int val : dict.values()){
            if(val%2==0){
                evenf=Math.min(val,evenf);
            } else {
                oddf=Math.max(val,oddf);
            }
        }
        return oddf-evenf;
    }
}
