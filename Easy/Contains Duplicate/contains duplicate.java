class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(items.containsKey(nums[i])) {
                return true;
            }
            items.put(nums[i], 1);
        }
        return false;
    }
}