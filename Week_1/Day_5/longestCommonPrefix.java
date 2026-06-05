class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        for(int i=1;i<=strs[0].length();i++){
            String pre=strs[0].substring(0,i);
            boolean flag=true;
            for(int j=0;j<strs.length;j++){
                if(!strs[j].startsWith(pre)){
                    flag=false;
                    break;
                }
            }
            if(flag) ans=pre;
            else break;
        }
        return ans;
    }
}
