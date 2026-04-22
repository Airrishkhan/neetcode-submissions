class Solution {
    public boolean isPalindrome(String s) {

        String temp = s.toLowerCase();
        int start = 0;
        int end = temp.length()-1;
      
        while(start<end) {
        
            if(!((temp.charAt(start)>='a' && temp.charAt(start)<='z') ||
                (temp.charAt(start)>='0' && temp.charAt(start)<='9'))) {
                start++;
            }else if (!((temp.charAt(end)>='a' && temp.charAt(end)<='z') ||
                (temp.charAt(end)>='0' && temp.charAt(end)<='9'))){
                end--;
            }else if(temp.charAt(start)!=temp.charAt(end)) {
                return false;
            }else{
                start++;
                end--;
            }
        }
          System.out.println(start);
            System.out.println(end);
        return true;
    
    }
    
}
