class Solution {
    public int maxChunksToSorted(int[] arr) {
        int runningSum = 0;
        int expectingSum = 0;
        int chunks =  0;

        for(int i=0; i<arr.length; i++){
            runningSum += arr[i];
            expectingSum += i;

            if(runningSum == expectingSum) chunks++;
        }
        return chunks;
    }
}