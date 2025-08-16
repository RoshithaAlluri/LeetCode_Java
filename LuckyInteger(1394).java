class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> dict=new HashMap<>();
        int res=-1;
        for(int n : arr){
            if(!dict.containsKey(n)){
                dict.put(n,1);
            }
            else {
                dict.put(n,dict.get(n)+1);
            }
        }
            List<Integer> keys = new ArrayList<>(dict.keySet());
            Collections.sort(keys);
            for(int key : keys){
            if(key == dict.get(key)){
                res = Math.max(res,key);
            }
        }
        return res;
    }
}
