class Solution {
    public boolean check(HashMap<Character,Integer> maps,HashMap<Character,Integer> mapp){
        if(maps.size()!=mapp.size()) return false;
        for(Character key : mapp.keySet()){
            if(!maps.containsKey(key)) return false;
            if(!maps.get(key).equals(mapp.get(key))) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> mapp=new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);

            c=s2.charAt(i);
            if(mapp.containsKey(c)) mapp.put(c,mapp.get(c)+1);
            else mapp.put(c,1);
        }
        if(check(mapp,map)) return true;  
        int a=0,b=s1.length()-1;          

        for(int i=0;i<s2.length()-s1.length();i++){
            b++;
            char add=s2.charAt(b);                         
            if(mapp.containsKey(add)) mapp.put(add,mapp.get(add)+1);
            else mapp.put(add,1);

            char rem=s2.charAt(a);                         
            if(mapp.get(rem)==1) mapp.remove(rem);
            else mapp.put(rem,mapp.get(rem)-1);
            a++;

            if(check(mapp,map)) return true;
        }
        return false;
    }
}
