/*
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //iterate thru numbers[], for each element, calculate remainder using target and curr to get number to find, check map for remainder. 
        //if remainder is not present in map, add curr to map, otherwise return result
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}