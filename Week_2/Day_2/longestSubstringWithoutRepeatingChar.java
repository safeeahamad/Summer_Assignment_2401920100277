class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        int lo=0,hi=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)){
                ans=Math.max(ans,hi-lo);
                while(c!=s.charAt(lo)) {
                    set.remove(s.charAt(lo));
                    lo++;
                }
                set.remove(s.charAt(lo));
                lo++;
                set.add(c);
                hi++;

            }
            else {
                set.add(c);
                hi++;
            }
        }
        ans = Math.max(ans, hi - lo);
        return ans;
        
    }
}
