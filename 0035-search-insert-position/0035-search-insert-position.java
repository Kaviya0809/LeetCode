class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        if(nums[0]>target) return 0;

        while(left<right){
            int mid = (left + right)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                if(nums.length-1<mid && nums[mid+1]>target){
                    return mid+1;
                }
                left = mid;
                left++; 
            }
            else{
                if(mid>0 && nums[mid-1]<target){
                    return mid;
                }
                right = mid;
                mid--;
            }
        }
        
        return nums.length;
    }
}