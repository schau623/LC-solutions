class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            letters.put(curr, letters.getOrDefault(curr, 0) + 1);
        }
        
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