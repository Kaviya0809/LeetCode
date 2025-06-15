class Solution {
    public int addDigits(int num) {
        //if num is already a single digit
        if(num/10 == 0) return num;
        //recursively reduce by summing digits
        else return addDigits(add(num));
    }

    public static int add(int num){
        //last digit
        if(num/10 == 0) return num;
        //sum current digit and recurse
        return num%10 + add(num/10);
    }
}