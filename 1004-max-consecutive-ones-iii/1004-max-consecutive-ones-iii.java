class Solution {
    public int longestOnes(int[] nums, int k) {
        int c = 0;
        int max = Integer.MIN_VALUE;
        if(nums.length <= k) return nums.length;
        for(int i=0; i<nums.length; i++){
            c=0;
            for(int j =i ; j<nums.length; j++){
                if(nums[j]==0 && c<=k){
                    c++;
                    max = Math.max(max, (j-i));
                }
            }
        }
        return max;
    }
}