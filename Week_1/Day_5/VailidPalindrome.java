class Solution {
    public boolean isPalindrome(String s) {

        int n=s.length();

        StringBuilder d=new StringBuilder();
        for(int i=0;i<n;i++){
            int t=(int)s.charAt(i);
            if((t>=65 && t<=90) ||  (t>=97 && t<=122) ||(t >= 48 && t <= 57)){
                d.append(s.charAt(i));
            }
        }

        String y=d.toString().toLowerCase();

        int i=0,j=y.length()-1;
        while(i<=j){
            if(y.charAt(i)==y.charAt(j)){
                i++;j--;
            }
            else return false;
        }
        return true;

        
    }
}
