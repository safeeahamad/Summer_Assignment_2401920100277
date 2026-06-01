class Solution {
    public int maxSubArray(int[] arr) {
        int mx=arr[0];
        int sm=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sm+=arr[i];
            mx=Math.max(sm,mx);
            if(sm<0) sm=0;
        }
        return mx; 
    }
}
