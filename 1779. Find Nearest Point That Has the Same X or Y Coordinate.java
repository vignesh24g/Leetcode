class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int res=Integer.MAX_VALUE;
        int ret=-1;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x || points[i][1]==y){
                int d=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(d<res){
                    res=d;
                    ret=i;
                }
            }
            
        }
        return ret;
        
    }
}
