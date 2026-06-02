class Solution {
    public boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        
        int n=arr.length-1;
        
        int j=0;
        while(j<n){
            if(arr[j]==arr[j+1]) return true;
            j++;
        }
        return false;
    }
}
