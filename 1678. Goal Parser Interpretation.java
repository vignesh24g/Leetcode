class Solution {
    public String interpret(String command) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G')
                st.append("G");
            else if(command.charAt(i)=='(' & command.charAt(i+1)==')'){
                st.append("o");
                i++;
            }
            else{
                st.append("al");
                i=i+3;
            }
        }
        
        return st.toString();
        
    }
}
