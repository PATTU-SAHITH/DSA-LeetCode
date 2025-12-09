class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int sum = 0;
        int ref;
        if(ruleKey.equals("type")){
            ref=0;
        }
        else if(ruleKey.equals("color")){
            ref = 1;
        }
        else{
            ref =2;
        }

        for(List<String> item: items){
            if(item.get(ref).equals(ruleValue)){
                sum++;
            }
        }
        return sum;
    }
}