class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> hm = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

      
        //put in hashmap
        for(int i=0 ; i<s.length() ; i++) {
            
            if(hm.containsKey(s.charAt(i))==false){
                hm.put(s.charAt(i),1);
            }else {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }

        }

        for(int i=0 ; i<t.length() ; i++) {

            if(hm.containsKey(t.charAt(i))==false) {
                return false;
            }else if(hm.get(t.charAt(i)) > 0) {
                    hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
            }else {
                return false;
            }

        }

        return true;
   
    }

}

