class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            int a=temp[i];
            while(!st.isEmpty() && temp[st.peek()]<=a) st.pop();
            if(st.isEmpty()) ans[i]=0;
            else ans[i]=st.peek()-i;
            st.push(i);
        }
        return ans;
    }
}
