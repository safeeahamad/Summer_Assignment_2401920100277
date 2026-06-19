class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;       
        int[] next=new int[n]; 
        int[] prev=new int[n]; 
        int i=n-1;
        while(i>=0){
            int a=arr[i];
            while(!st.isEmpty() && arr[st.peek()]>=a) st.pop();
            if(st.isEmpty()) {
                next[i]=n-1;
            }
            else {
                next[i]=st.peek()-1;
            }
            st.push(i);
            i--;
        }
        

        while(!st.isEmpty()) st.pop();


        i=0;
        while(i<n){
            int a=arr[i];
            while(!st.isEmpty() && arr[st.peek()]>=a) st.pop();
            if(st.isEmpty()) {
                prev[i]=0;
            }
            else {
                prev[i]=st.peek()+1;
            }
            st.push(i);
            i++;
        }
        
        int mx=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            mx=Math.max(mx, arr[j]*(Math.abs(prev[j]-next[j])+1));
        }
        return mx;
        
    }
}
