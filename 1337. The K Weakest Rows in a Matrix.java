class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int[] res=new int[mat.length];
        int[] res2=new int[mat.length];
        
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)
                    cnt++;
                }
            res[i]=cnt;
            res2[i]=cnt;
        }
        
        Arrays.sort(res2);
        int[] rep=new int[mat.length]; 
        for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            if(res2[i]==res[j]){
                rep[i]=j;
                res[j]=1000;
                break;
            }    
        }
        }
        int ans[]=new int[k];
        for(int j=0;j<k;j++){
            ans[j]=rep[j];
        }
        return ans;
      
    }
}
