class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j:nums){
            if(map.containsKey(j)){
                return true;
            }else{
                map.put(j,1);
            }
        }
        return false;
    }
}