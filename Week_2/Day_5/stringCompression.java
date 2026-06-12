class Solution {
    public int compress(char[] arr) {

        StringBuilder ans = new StringBuilder();
        int i=0;
        int n=arr.length;

        while(i<n){
            int j=i;
            while(j<n && arr[j]==arr[i]){
                j++;
            }
            ans.append(arr[i]);
            int len=j-i;
            if (len>1){
                ans.append(len);
            }
            i=j;
        }
        for (int k=0;k<ans.length();k++){
            arr[k]=ans.charAt(k);
        }
        return ans.length();
    }
}
