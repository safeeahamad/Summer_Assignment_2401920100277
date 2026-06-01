class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int pro=0;

        for(int p:prices){
            if(min>p) min=p;
            else pro=Math.max(pro,p-min);
        }
        return pro;
    }
}
