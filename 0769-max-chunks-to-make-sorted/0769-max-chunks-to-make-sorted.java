class Solution {
    public int maxChunksToSorted(int[] arr) {
        int runningSum = 0; // Cumulative sum of elements seen so far
        int expectingSum = 0; // Cumulative sum of sorted values (i.e., expected values if sorted)
        int chunks =  0; // Number of chunks that can be independently sorted

        for(int i=0; i<arr.length; i++){
            runningSum += arr[i]; // Sum of actual elements
            expectingSum += i;  // Sum of indices (expected values in sorted array)

            // If the sums match, we can split here
            if(runningSum == expectingSum) chunks++;
        }
        return chunks;
    }
}