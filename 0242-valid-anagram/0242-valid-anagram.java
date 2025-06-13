class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            // Increment count for character from s
            mp.put(a, mp.getOrDefault(a,0) + 1);

            // Decrement count for character from t
            mp.put(b, mp.getOrDefault(b,0) - 1);

        }
        // If all counts are zero, strings are anagrams
        for(int j : mp.values()){
            if(j!=0) return false;
        }
        return true;
        
    }
}