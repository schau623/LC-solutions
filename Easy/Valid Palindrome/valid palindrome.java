class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        int startIdx = 0;
        int endIdx = s.length()-1;
        char head;
        char tail;
        s = s.toLowerCase();
        while(startIdx <= endIdx) {
            head = s.charAt(startIdx);
            tail = s.charAt(endIdx);
            if(!Character.isLetterOrDigit(head)) {
                startIdx++;
            }
            else if(!Character.isLetterOrDigit(tail)) {
                endIdx--;
            }
            else {
                if(head != tail) {
                    return false;
                }
                startIdx++;
                endIdx--;
            }
        }
        
        return true;
    }
}