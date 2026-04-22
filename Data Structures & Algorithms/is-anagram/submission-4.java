class Solution {
    public boolean isAnagram(String s, String t) {

    char[] cs = s.toCharArray();
    char[] ct = t.toCharArray();

    Arrays.sort(cs);
    Arrays.sort(ct);

    System.out.println(cs);
    System.out.println(ct);
    
    if(cs.length == ct.length) {
        
    for(int i=0 ; i<cs.length ; i++) {

        if(cs[i]!=ct[i]) {
            return false;
            }

        }
    
    }else {
        return false;
    }
    
    return true;

    }
}
