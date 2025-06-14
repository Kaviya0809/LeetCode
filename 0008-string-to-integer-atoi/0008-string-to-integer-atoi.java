class Solution {
    public int myAtoi(String s) {
        int i =0;
        int n = s.length();
        int sign = 1;  // Sign of the number (+1 by default)
        int ans = 0;

        // Skip leading whitespace characters
        while(i<n  && s.charAt(i) == ' '){
            i++;
        }
        // Check for optional '+' or '-' sign
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // Process numeric digits and build the number
        while(i<n && s.charAt(i)>= '0' && s.charAt(i)<= '9'){
            int dig = s.charAt(i)-'0';
            // Check for overflow before adding the digit
            if(ans>(Integer.MAX_VALUE - dig) /10){
                // Return the clamped value based on the sign
                return (sign ==1) ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            // Append the digit to the result
            ans = ans*10 + dig;
            i++;
        }
        return ans*sign;
    }
}