/* 
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) {
            set.add(num);
        }
        
        for(int num:nums) {
            if(!set.contains(num-1)) {
                int count = 1;
                while(set.contains(num+1)) {
                    num++;
                    count++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
}