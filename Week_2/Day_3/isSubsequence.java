class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length(),m=t.length();
        int a=0,b=0;
        while(a<n && b<m){
            if(s.charAt(a)==t.charAt(b)){
                a++;b++;
            }
            else b++;
        }
        if(a==n) return true;
        else return false;
    }
}
