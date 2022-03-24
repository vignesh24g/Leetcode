class Solution {
    public int getSum(int a, int b) {
        return sum(a,b);
        
        
    }
    
    int sum(int a,int b){
        int s,c;
        if(b==0)
            return a;
        else{
            s=a^b;
            c=(a&b)<<1;
            return sum(s,c);
        }
        
    }
}
