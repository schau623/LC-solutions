/* 
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> roman = new HashMap();
        int res = 0;
        roman.put("I", 1);
        roman.put("IV", 4);
        roman.put("V", 5);
        roman.put("IX", 9);
        roman.put("X", 10);
        roman.put("XL", 40);
        roman.put("L", 50);
        roman.put("XC", 90);
        roman.put("C", 100);
        roman.put("CD", 400);
        roman.put("D", 500);
        roman.put("CM", 900);
        roman.put("M", 1000);
        
        for(int i = 0; i < s.length(); i++) {
            char c =  s.charAt(i);
            int curr = roman.get(String.valueOf(c));
            int next = -1;
            if(i != s.length()-1) {
                next = roman.get(String.valueOf(s.charAt(i+1)));
            }
            
            if(curr >= next) {
                res += curr;
            }
            else {
                String sCurr = String.valueOf(c) + String.valueOf(s.charAt(i+1));
                res += roman.get(sCurr);
                i++;
            }
        }
        return res;
    }
}