/*
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        
        //get count of each letter in string s
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            letters.put(curr, letters.getOrDefault(curr, 0) + 1);
        }
        
        //iterate thru chars in string t
        //for each character found in t and s, subtract one from that value in map until map is empty.
        //if character found in t is not in s, no longer valid anagram
        for(int i = 0; i < t.length(); i++) {
            char curr = t.charAt(i);
            Integer value =  letters.get(curr);
            
            if(value == null) {
                return false;
            }
            
            else if(value.equals(1)) {
                letters.remove(curr);
            }
            else {
                letters.put(curr, value-1);
            }
        }
        return true;
    }
}