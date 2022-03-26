class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int res[]=new int[n];
        
        ArrayList<Integer> l=new ArrayList<Integer>();
        ArrayList<Integer> g=new ArrayList<Integer>();
        
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot)
                l.add(nums[i]);
            else if(nums[i]==pivot)
                c++;
            else
                g.add(nums[i]);
        }
        int k=0;
        for(int i=0;i<l.size();i++){
            res[k++]=l.get(i);
        }
        for(int i=0;i<c;i++){
            res[k++]=pivot;
        }
         for(int i=0;i<g.size();i++){
            res[k++]=g.get(i);
        }
        return res;
    }
}
