class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start =-1;
        int end = -1;
        for(int i=0; i<nums.length;i++){
            if(nums[i] ==target){
                start = i;
                for(int j =i; j<nums.length;j++){
                    if(nums[j]==target) end=j;
                }
                break;
            }
        }
        return new int[]{start, end};
    }
}