class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> as=new ArrayList<Integer>();
        
        for(int i=0;i<nums1.length;i++){
            
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    as.add(nums1[i]);
                    nums2[j]=2000;
                    break;
                }
            }
        }
        int[] ar=new int[as.size()];
        for(int i=0;i<as.size();i++){
            ar[i]=as.get(i);
        }
        return ar;
    }
}
