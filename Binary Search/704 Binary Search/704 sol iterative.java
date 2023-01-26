class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int mid;
        while(lo <= hi) {
            mid = lo + (hi-1)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(target > nums[mid]) {
                lo = mid+1;
            }  
            else {
                hi = mid-1;
            }
        }
        return -1;
    }
}