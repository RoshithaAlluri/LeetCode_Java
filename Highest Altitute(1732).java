class Solution {
    public int largestAltitude(int[] gain) {
        int[] result = new int[gain.length+1];
        result[0] = 0;
        int mx = 0;
        for(int i=1;i<gain.length+1;i++){
            result[i] = result[i-1] + gain[i-1];
            mx=Math.max(mx, result[i]);
        }
        return mx;
    }
}