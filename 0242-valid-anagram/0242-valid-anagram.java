class Solution {
    public boolean isAnagram(String s, String t) {
        int[] set=new int[26];

        if(s.length() != t.length
        ()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            set[s.charAt(i)-'a']++;
            set[t.charAt(i)-'a']--;

        }
        for(int j=0; j<set.length; j++){
            if(set[j]!=0){
                return false;
            }
        }
        return true;
    }
}