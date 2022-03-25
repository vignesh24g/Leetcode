class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res=0;
        int cindex=0;
        switch(ruleKey){
            case "type":cindex=0;
                        break;
            case "color":cindex=1;
                        break;
            case  "name":cindex=2;
                        break;
            default:
        }
        
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(cindex).equals(ruleValue)){
                res++;
            }
        }
        return res;
    }
}
