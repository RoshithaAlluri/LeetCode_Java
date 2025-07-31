import java.util.Scanner;
class Solution {
    public static int[] productExceptSelf(int[] nums){
       int n=nums.length;
       int [] Left = new int[n];
       int [] Right = new int[n];
       int [] Product = new int[n];

    Left[0]=1;
    for(int i=1;i<=n-1;i++){
        Left[i]=Left[i-1]*nums[i-1];
    }
    Right[n-1]=1;
    for(int i=n-2;i>=0;i--){
        Right[i]=Right[i+1]*nums[i+1];
    }
    for(int i=0;i<n;i++){
        Product[i]=Left[i]*Right[i];
    }
    return Product;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [] nums= new int[1];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print(productExceptSelf(nums));
    }
    }      
