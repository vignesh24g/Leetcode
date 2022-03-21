class Solution {
    public String freqAlphabets(String s) {
        
        StringBuilder st=new StringBuilder();
            String str="";
        for(int i=0;i<s.length();i++){
               if((i+2)<s.length() &&s.charAt(i+2)=='#'){
                 int n=s.charAt(i);
                 n-=48;
                 n*=10;
                 int m=s.charAt(i+1);
                 m-=48;
                 n=n+m;
                 n+=96;
                 char c=(char)n;
                 str=str+c;
                 i+=2;
               }
            else{
                int n=s.charAt(i);
                n-=48;
                n+=96;
                char c=(char)n;
                str=str+c;
            }
           }
        
        
        return str;
        
    }
}
