/*
 * Time Complexity: O(nlog(k))
 * Space Complexity: O(n)
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        //getting freq of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            // priority by count of a number/item. SO, when we poll from the queue, the pair with bigger count of item will get out first
            (a, b) -> a.getValue() - b.getValue());
        
        //adding elements w/ freq to pq
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k){ 
                pq.poll(); 
            }
        }

        //polling elements with highest freq
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}