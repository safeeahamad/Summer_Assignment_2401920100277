class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int i=0,k=n-1;
        while(i<n){
            sum+=mat[i][i]+mat[i][k];
            i++;k--;
        }
        if(n%2!=0) sum-=mat[n/2][n/2];
        return sum;
    }
}
