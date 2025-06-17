class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        // 0 open brackets, 0 close brackets, empty string, and n pairs to form
        recurse(ans, 0, 0, "", n);
        return ans;
    }
    public void recurse(List<String> ans, int left, int right, String s, int n){
        if(s.length() == n*2){
            ans.add(s);
            return;
        }
         // If we can still add more '(', do it and recurse further
        if(left<n){
            recurse(ans, left+1, right, s+ "(", n);
        }
         // If we can add ')' without violating the balance, add it
        if(right < left){
            recurse(ans, left, right+1,s+ ")", n);
        }
    }
}