class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        if(coordinates.length==2){
            return true;
        }
        else{
            for(int i=0;i<coordinates.length-2;i++){
                int x=(coordinates[i+1][0]-coordinates[i][0])*(coordinates[i+2][1]-coordinates[i][1]);
                int y=(coordinates[i+1][1]-coordinates[i][1])*(coordinates[i+2][0]-coordinates[i][0]);
                if(x-y!=0){
                    return false;
                }
            }
        }
        return true;
        
    }
}
