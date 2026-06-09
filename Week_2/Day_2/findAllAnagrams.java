class Solution {
    public boolean check(HashMap<Character,Integer> maps,HashMap<Character,Integer> mapp){
        if(maps.size()!=mapp.size()) return false;
        for(Character key : mapp.keySet()){
            if(!maps.containsKey(key)) return false;
            if(!maps.get(key).equals(mapp.get(key))) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()) return ans;
        HashMap<Character,Integer> maps=new HashMap<>();
        HashMap<Character,Integer> mapp=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            if(mapp.containsKey(c)) mapp.put(c,mapp.get(c)+1);
            else mapp.put(c,1);

            char ch=s.charAt(i);
            if(maps.containsKey(ch)) maps.put(ch,maps.get(ch)+1);
            else maps.put(ch,1);
        }
        boolean flag=check(maps,mapp);
        if(flag) ans.add(0);
        int a=0;
        for(int i=p.length();i<s.length();i++){
            char c=s.charAt(i);
            if(maps.containsKey(c)) maps.put(c,maps.get(c)+1);
            else maps.put(c,1);

            char d=s.charAt(a);
            if(maps.get(d)==1) maps.remove(d);
            else maps.put(d,maps.get(d)-1);

            a++;
            flag=check(maps,mapp);
            if(flag) ans.add(a);
        }
        return ans;
    }
}
