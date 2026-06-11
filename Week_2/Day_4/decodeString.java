class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums=new Stack<>();
        Stack<String> strs=new Stack<>();
        int num=0;
        String cur="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                nums.push(num);
                strs.push(cur);
                num=0;
                cur="";
            }
            else if(c==']'){
                int k=nums.pop();
                String prev=strs.pop();
                StringBuilder sb=new StringBuilder(prev);
                for(int j=0;j<k;j++) sb.append(cur);
                cur=sb.toString();
            }
            else cur+=c;
        }
        return cur;
    }
}
