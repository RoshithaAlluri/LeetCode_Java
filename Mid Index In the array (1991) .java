class Solution {
    public static int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int [] left=new int[n];
        int [] right=new int[n];
        left[0]=0;
        for(int i=1;i<=n-1;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        right[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [] nums=new int[1];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(findMiddleIndex(nums));
    }
}