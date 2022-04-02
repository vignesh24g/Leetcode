class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        HashMap<Integer,String> hs=new HashMap<Integer,String>();
        
        String[] alpha={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        
        for(int i=0;i<26;i++){
            int a=97+i;
            hs.put(a,alpha[i]);
        }
        String[] res=new String[words.length];
        for(int i=0;i<words.length;i++){
            StringBuilder str=new StringBuilder();
            String s=words[i];
            for(int j=0;j<words[i].length();j++){
                int a=s.charAt(j);
                str.append(hs.get(a));
            }
            res[i]=str.toString();
        }
        
        HashSet<String> hh=new HashSet<String>();
        
        for(int i=0;i<words.length;i++){
            hh.add(res[i]);
        }
        return hh.size();
    }
}
