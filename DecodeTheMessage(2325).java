class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character , Character> dict =  new HashMap<>();
        char cur_ch = 'a';
        for(char ch : key.toCharArray()){
            if(Character.isLetter(ch)){
                if (!dict.containsKey(ch)){
                    dict.put(ch , cur_ch);
                    cur_ch++;
                }
            }
        }
        dict.put(' ',' ');
        String res="";
        for(char c : message.toCharArray()){
            res+=dict.get(c);
        }
        return res;
    }
}
