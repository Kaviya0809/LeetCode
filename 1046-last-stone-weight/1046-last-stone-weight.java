class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }

        while(pq.size()>=2){
            int a=pq.poll();
            int b=pq.poll();
            if(a==b){
                continue;
            }else{
                int clash=Math.abs(a-b);
                pq.add(clash);
            }
        }

        if(pq.size()==1){
            return pq.peek();
        }

        return 0;
    }
}