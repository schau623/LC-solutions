class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i],0) + 1);
        }
        for(int key:count.keySet()) {
            int value = count.get(key);
            if(bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        }
        int[] res = new int[k];
        int idx = 0;
        for(int i = bucket.length-1; i > 0 && idx <= k; i--) {
            if(bucket[i] != null) {
                for(int j : bucket[i]) {
                    if(idx == k) {
                        break;
                    }
                    res[idx++] = j;
                }
            }
        }
        return res;
    }
}