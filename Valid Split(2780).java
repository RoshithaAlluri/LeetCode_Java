class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer , Integer> left=new HashMap<>();
        HashMap<Integer , Integer> right=new HashMap<>();
        for(int i : nums){
            if(right.containsKey(i)){
                right.put(i,right.get(i)+1);
            } else {
                right.put(i , 1);
            }
        }
        int n=nums.size();
        for(int i=0;i<n;i++){
            int num=nums.get(i);
            left.put(num , left.getOrDefault(num , 0)+1);
            right.put(num, right.get(num)-1);
            if((left.get(num) * 2> (i+1)) && (right.get(num) * 2 > (n-1-i))){
                return i;
            }
        }
        return -1;
    }
}
