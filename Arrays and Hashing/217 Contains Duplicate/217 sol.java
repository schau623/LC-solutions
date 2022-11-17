/*
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();
        //iterate thru nums[], add each element to hashmap, if element already appeaars in hashmap, then duplicat exists
        for(int i = 0; i < nums.length; i++) {
            if(items.containsKey(nums[i])) {
                return true;
            }
            items.put(nums[i], 1);
        }
        return false;
    }
}