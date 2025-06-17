class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c = 1;
        if(nums.length == 1) return nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            if(nums[i]!=nums[i+1]){
                if(c==1){
                    return nums[i];
                }
                c=1;
            }
        }
        return nums[nums.length -1];
    }
}