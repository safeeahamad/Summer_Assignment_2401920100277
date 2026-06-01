class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        int cur=-101;
        for(int i=0;i<n;i++){
            if(nums[i]!=cur){
                cur=nums[i];
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
}
