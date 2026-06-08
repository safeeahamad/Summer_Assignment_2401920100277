class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        int m=magazine.length();
        int r=ransomNote.length();
        if(r>m) return false;
        for(int i=0;i<m;i++){
            char c=magazine.charAt(i);
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }

        for(int i=0;i<r;i++){
            char c=ransomNote.charAt(i);
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
            if(map.get(c)==0) map.remove(c);
            
        }
        return true;
        
    }
}
