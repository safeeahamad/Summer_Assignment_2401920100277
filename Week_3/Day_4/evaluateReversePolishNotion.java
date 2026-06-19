4class Solution {
    public static boolean check(String s){
        if(s.equals("+")) return true;
        else if(s.equals("*")) return true;
        else if(s.equals("-")) return true;
        else if(s.equals("/")) return true;
        else return false;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        boolean f=false;
        int n=tokens.length;
        for(int i=0;i<n;i++){
            String s=tokens[i];
            boolean flag=check(s);
            if (flag){
                int a=st.pop();
                int b=st.pop();
                if(s.equals("+")) st.push(b+a);
                else if(s.equals("-")) st.push(b-a);
                else if(s.equals("/")) st.push(b/a);
                else st.push(b*a);
            }
            else st.push(Integer.parseInt(s));
        }
        return st.pop();
    }
}
