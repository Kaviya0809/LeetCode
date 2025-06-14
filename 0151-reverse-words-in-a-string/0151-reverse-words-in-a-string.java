class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");
        String ans ="";

        for(int i = s1.length - 1; i>0; i--){
            ans += s1[i] +" ";
        }
        return ans + s1[0];
    }
}