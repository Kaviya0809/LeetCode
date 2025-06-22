class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        int left = 0, right =0, max=0;

        while(right<s.length()){
            Character ch = s.charAt(right);

            if(mp.containsKey(ch) && mp.get(ch) >= left){
                int idx = mp.get(ch);
                left = idx+1;
            }else{
                int newLength = right - left + 1;
                max = Math.max(max, newLength);
            }

            mp.put(ch, right);
            right++;
        }
        return max;
    }
}