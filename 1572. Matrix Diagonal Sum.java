class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j)
                    ans+=mat[i][j];
                if(i==mat.length-1-j) 
                    if(j==mat.length-1-i) 
                        if(i!=j)
                         ans+=mat[i][j];
            }
        }
        return ans;
        
    }
}
