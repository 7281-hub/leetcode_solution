class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        //Step 1: Count frequency
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
         // Step 2: Find first unique character
        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            if(freq[ch-'a']==1){
                return j;
            }
        }
        return -1;

    }
}