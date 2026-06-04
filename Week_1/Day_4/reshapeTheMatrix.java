class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] ans=new int[r][c];
        int n=mat.length;
        int m=mat[0].length;
        if(m*n!=r*c) return mat;
        int a=0,b=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[a][b++]=mat[i][j];
                if(b==c){
                    a++;
                    b=0;
                }
            }
        }
        return ans;
    }
}
