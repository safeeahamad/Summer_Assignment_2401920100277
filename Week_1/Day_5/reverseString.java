class Solution {
    public void reverseString(char[] s) {
        int l=s.length-1;
        int i=0;
        while(i<=l){
            char c=s[i];
            s[i++]=s[l];
            s[l]=c;
            l--;
        }
        
    }
}
