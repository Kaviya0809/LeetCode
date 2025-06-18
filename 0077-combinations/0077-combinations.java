class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), n, k, 1);  // Start recursion from number 1
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> temp, int n, int k, int num){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp)); // When size reaches k, add copy of list to result
            return;
        }

        for(int i=num; i<=n; i++){
            temp.add(i);                        //Add number
            backtrack(ans, temp, n, k, i+1);    //recurse with number
            temp.remove(temp.size() - 1);       //remove last numer
        }
    }
}