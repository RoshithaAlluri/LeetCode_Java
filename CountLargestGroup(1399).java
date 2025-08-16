class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> dict=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=digitSum(i);
            if(dict.containsKey(sum)){
                dict.put(sum,dict.get(sum)+1);
            } else {
                dict.put(sum,0);
            }
        }
        int max=0;
        for(int val : dict.values()){
            if (val>max){
                max=val;
            }
        }
        int count=0;
        for(int val : dict.values()){
            if (val == max){
                count++;
            }
        }
        return count;
    }
    private int digitSum(int num){
        int total=0;
        while(num>0){
            total += num%10;
            num=num/10;
        }
        return total;
    }
}
