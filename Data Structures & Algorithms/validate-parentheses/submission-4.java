class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        int i=0;

        if(s.length()%2!=0){
            return false;
        }

        while(i<s.length()){

            if(st.empty() || s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
               st.push(s.charAt(i));
               i++;
            }else if (
                (s.charAt(i)==')' && st.peek()=='(' ) || 
                (s.charAt(i)==']' && st.peek()=='[') ||
                (s.charAt(i)=='}' && st.peek()=='{') 
                    )
                {
                    st.pop();
                    i++;
            }else{
                return false;
            }

        }
        
        if(st.empty()){
            return true;
        }else{
        return false;
        }
    }
}
