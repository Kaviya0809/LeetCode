class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int valid = n/3;

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i< n; i++){
            if(ans.contains(nums[i])) continue;

            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
            if(mp.get(nums[i]) > valid){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}