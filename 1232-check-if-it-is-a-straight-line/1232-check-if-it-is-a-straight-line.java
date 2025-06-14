class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int difX =  coordinates[1][0] - coordinates[0][0];
        int difY = coordinates[1][1] - coordinates[0][1];
        
        for(int i=2; i<coordinates.length; i++){
            int difX1 =  coordinates[i][0] - coordinates[i-1][0];
            int difY1 = coordinates[i][1] - coordinates[i-1][1];
        
            //check the slopes y/y1 = x/x1
            if(difY * difX1 != difY1 * difX) {
                return false;
            }
            
        }
        return true;
    }
}