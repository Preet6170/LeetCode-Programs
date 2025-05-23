class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m1[]=new int[10000];
        int m2[]=new int[10000];
        for(int i=0;i<s.length();i++){
            m1[s.charAt(i)]=t.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            m2[t.charAt(i)]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(m1[s.charAt(i)]!=t.charAt(i)) {return false;}
        }
        for(int i=0;i<t.length();i++){
           if(m2[t.charAt(i)]!=s.charAt(i)) {return false;}
        }
        return true;

        //  if (s.length() != t.length()) return false;
        // int[] map = new int[256];
        // for (int i = 0; i<s.length(); i++) {
        //     if (map[s.charAt(i)]!=0 && map[s.charAt(i)]!=t.charAt(i)) return false;
        //     map[s.charAt(i)] = t.charAt(i);
        // }
        // return true;
        
    }
}
