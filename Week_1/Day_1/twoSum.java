class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                ans[0]=i;
                ans[1]=map.get(rem);
                return ans;
            }
            else map.put(nums[i],i);
        }
        return ans;
        
    }
}
