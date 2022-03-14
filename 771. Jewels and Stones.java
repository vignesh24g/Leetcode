class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result=0;
        int n=jewels.length();
        
        int m=stones.length();
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
            if(stones.charAt(j)==jewels.charAt(i))
                result++;
        }
        }
        return result;
    }
}
