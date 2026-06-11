class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int a = 0, b = 0;

        StringBuilder ans = new StringBuilder();

        while(b<n){
            a = b; 
            while(b<n && s.charAt(b)!=' ') {
                b++;
            }
            for(int j=b-1;j>=a;j--){
                ans.append(s.charAt(j));
            }
            if(b<n){
                ans.append(' ');
                b++;
            }
        }
        return ans.toString();
    }
}
