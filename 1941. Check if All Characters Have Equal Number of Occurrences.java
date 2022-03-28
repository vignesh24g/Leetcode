class Solution {
    public boolean areOccurrencesEqual(String s) {
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int t=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
               a[i]++;
            }
        }
        }
        boolean t=true;
        int d=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]!=d){
                t=false;
                break;
            }
        }
        return t;
        
    }
}
