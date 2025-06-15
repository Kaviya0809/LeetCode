class Solution {
    public int addDigits(int num) {
        if(num/10 == 0) return num;
        else return addDigits(add(num));
    }

    public static int add(int num){
        if(num/10 == 0) return num;
        return num%10 + add(num/10);
    }
}