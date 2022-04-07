class Solution {
    public int lengthOfLastWord(String s) {
        
        int c=s.length()-1;
        
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')
                c--;
            else
                break;
        }
        int cnt=0;
        
        for(int i=c;i>=0;i--){
            if(s.charAt(i)==' ')
                break;
            cnt++;
        }
        
        return cnt;
        
    }
}
