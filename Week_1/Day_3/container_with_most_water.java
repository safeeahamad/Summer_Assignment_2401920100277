class Solution {
    public int maxArea(int[] arr) {
        int maxa=0;
        int n=arr.length;
        int h=0;

        int i=0,j=n-1;
        while(i<j){
            int min=Math.min(arr[i],arr[j]);
            maxa=Math.max(maxa,(j-i)*min);
            if(arr[i]<arr[j]) i++;
            else if(arr[i]>arr[j]) j--;
            else j--;

        }
             
        return maxa; 
        
    }
}
