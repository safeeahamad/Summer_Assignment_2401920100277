class Solution {
    public static void generate(String s,int n , int op,int cl,List<String> result){
        if(s.length()==2*n){
            result.add(s);
            return;

        }
        if(op<n){
            generate(s+"(",n,op+1,cl,result);

        }
        if(cl<op){
            generate(s+")",n,op,cl+1,result);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("",n,0,0,result);
        return result;
        
    }
}
