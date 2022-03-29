class Solution {
    public int findDuplicate(int[] nums) {
        int t=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                t=nums[i];
                break;
            }
        }
        return t;
    }
}
