class Solution {
    public boolean isAnagram(String s, String t) {

        Hashtable<Character,Integer> ht1 = new Hashtable<>();
        Hashtable<Character,Integer> ht2 = new Hashtable<>();
        int counter = 1 ; 

        for(int i = 0 ; i < s.length() ; i++) {

            if(ht1.containsKey(s.charAt(i))==false) { 
                ht1.put(s.charAt(i),counter);
            }else {
                ht1.put(s.charAt(i),ht1.get(s.charAt(i))+1);
            }

        }

        for(int i = 0 ; i < t.length() ; i++) {

            if(ht2.containsKey(t.charAt(i))==false) { 
                ht2.put(t.charAt(i),counter);
            }else {
                ht2.put(t.charAt(i),ht2.get(t.charAt(i))+1);
            }

        }

        if(ht1.entrySet().equals(ht2.entrySet())){
            return true;
        }else {
            return false;
        }


    }
}
