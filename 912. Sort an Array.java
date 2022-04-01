class Solution {
     public void mergesort(int[] a,int beg,int mid,int end){

        int i,j,k;
        int n1=mid-beg+1;
        int n2=end-mid;
        int l[]=new int[n1];
        int r[]=new int[n2];
        for(int m=0;m<n1;m++){
            l[m]=a[beg+m];
        }
        for(int m=0;m<n2;m++){
            r[m]=a[mid+1+m];
        }
         i=0;
         j=0;
         k=beg;
        
        while(i<n1 && j<n2){
         if(l[i]<=r[j]){
            a[k]=l[i++];
            }
        else{
            a[k]=r[j++];
        }
        k++;
         }
    while(i<n1){
        a[k++]=l[i++];
    }
    while(j<n2){
        a[k++]=r[j++];
    }
    }
    
    public void merge(int[] a,int beg,int end){
        
        if(beg<end){
            int mid=(beg+end)/2;
            merge(a,beg,mid);
            merge(a,mid+1,end);
            mergesort(a,beg,mid,end);
        }
    }
    public int[] sortArray(int[] nums) {
        
       merge(nums,0,nums.length-1);
        return nums;
        
    }
    
    
   
}
