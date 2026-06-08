class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()) return false;
        int n=s.length();

        HashMap<Character,Integer> smap=new HashMap<>();
        HashMap<Character,Integer> tmap=new HashMap<>();

        for(int i=0;i<n;i++){
            char key=s.charAt(i);
            if(smap.containsKey(key)){
                int fre=smap.get(key);
                smap.put(key,fre+1);
            }
            else smap.put(key,1);
        }
        for(int i=0;i<n;i++){
            char key=t.charAt(i);
            if(tmap.containsKey(key)){
                int fre=tmap.get(key);
                tmap.put(key,fre+1);
            }
            else tmap.put(key,1);
        }

        for(int i=0;i<n;i++){
            char key=s.charAt(i);
            if(!tmap.containsKey(key)) return false;

            // HashMap.get() returns an Integer object, not int.
            // Using != compares references, not values.
            // if(smap.get(key) != tmap.get(key)) return false;


            if(!smap.get(key).equals(tmap.get(key))) return false;
        }
        return true;
    }
}
