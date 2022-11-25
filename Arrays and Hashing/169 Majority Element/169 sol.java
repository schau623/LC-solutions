/* 
 * Time: O(log(n))
 * Space: O(1)
 */
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        int prev = nums[0];
        int max = -1;
        int res = -1;
        for(int i = 0; i < nums.length; i++) {
            if(prev == nums[i]) {
                counter++;
            }
            else {
                if(max < counter) {
                    max = counter;
                    res = prev;
                }
                counter = 1;
                prev = nums[i];
            }
        }
        if(max < counter) {
            max = counter;
            res = prev;
        }
        return res;
    }
}