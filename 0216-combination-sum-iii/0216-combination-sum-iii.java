class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), n , k, 1);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> temp, int n , int k, int num){
        if(temp.size()> k) return;
        if(temp.size() == k && n==0){
            ans.add(new ArrayList<>(temp));
        }

        for(int i=num; i<=9; i++){
            temp.add(i);
            backtrack(ans, temp, n-i, k, i+1);
            temp.remove(temp.size()-1);
        }
    }

}