class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            char[] currArr = curr.toCharArray();
            Arrays.sort(currArr);
            String str = new String(currArr);
            if(map.containsKey(str)) {
                map.get(str).add(curr);
            }
            else {
                map.put(str, new ArrayList<>());
                map.get(str).add(curr);
            }
        }
        return new ArrayList<>(map.values());
    }
}