class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
                int x=0;
                if(height[i]<height[j])
                    x=height[i];
                else
                    x=height[j];
                int y=Math.abs(i-j);
            int temp=x*y;
                if(temp>area){
                    area=temp;
                }
        if(height[i]>height[j]){
            j--;
        }
        else
            i++;
        }
        
        return area;
        
    }
}
