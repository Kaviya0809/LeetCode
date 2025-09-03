class Solution {
    public int countDigits(int num) {
        int x = num;
        int rem;
        int c = 0;
        while(num!=0){
            rem = num%10;
            if(x%rem == 0) c++;
            num /=10;
        }
        return c;
    }
}