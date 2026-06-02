class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sub = 0;
        for(int i=0;i<k;i++){
            sub+=nums[i];
        }
        int mx=sub;
        int j=k;
        while(j<nums.length){
            sub+=nums[j]-nums[j-k];
            mx=Math.max(mx, sub);
            j++;
        }
        return (double) mx/k;
    }
}
