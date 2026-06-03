class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int p=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int t=arr[i];
                arr[i]=arr[p];
                arr[p]=t;
                p++;
            }
        }
        
    }
}
