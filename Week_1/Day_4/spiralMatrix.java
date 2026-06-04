class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> arr = new ArrayList<>();
        
        int minr=0;
        int maxr=mat.length-1;
        int minc=0;
        int maxc=mat[0].length-1;
        
        while (minr <= maxr && minc <= maxc) {
            for(int i=minc;i<=maxc;i++){
                arr.add(mat[minr][i]);
            }
            minr++;
            for(int i=minr;i<=maxr;i++){
                arr.add(mat[i][maxc]);
            }
            maxc--;
            if(minr<=maxr){
                for(int i=maxc;i>=minc;i--){
                    arr.add(mat[maxr][i]);
                }
                maxr--;
            }
            if(minc<=maxc) {
                for(int i=maxr;i>=minr;i--){
                    arr.add(mat[i][minc]);
                }
                minc++;
            }
        }
        return arr;
    }
}
