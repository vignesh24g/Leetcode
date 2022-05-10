class Solution {
    public int numUniqueEmails(String[] emails) {
        
        int n=emails.length;
        Set<String> s=new HashSet<String>();
        for(int i=0;i<n;i++){
            String t=emails[i];
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<t.length()-1;j++){
                if(t.charAt(j)=='@'){
                    int k=j;
                    for(int m=k;k<t.length()-1;k++){
                        sb.append(t.charAt(m));
                    }
                    break;
                }
                else if(t.charAt(j)=='+'){
                    while(t.charAt(j)!='@'){
                        j++;
                    }
                    j=j-1;
                }
                else if(t.charAt(j)=='.'){
                        continue;
                }
                else{
                    sb.append(t.charAt(j));
                }     
                
            }
            s.add(sb.toString());
        }
        return s.size();
        
    }
}
