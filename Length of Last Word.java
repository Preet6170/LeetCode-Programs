class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
    while (i >= 0 && s.charAt(i) == ' ')
      --i;
     int lastIndex = i;
    while (i >= 0 && s.charAt(i) != ' ')
      --i;
    return lastIndex - i;
//    s= s.trim();
//     int x=s.lastIndexOf(' ');
//     return s.length()-x-1;
        
        
    }
}
