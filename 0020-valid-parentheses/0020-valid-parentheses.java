class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char it: s.toCharArray()){
            if(it=='('||it=='['||it=='{')
                st.push(it);
            else {
                if(st.size()==0) return false;
                char ch=st.pop();
                if((ch=='(' && it==')')||(ch=='{' && it=='}')||(ch=='[' && it==']')) continue;
                else return false;
            }
        }
        return st.size()==0;
        //OR return st.isEmpty();
    }
}
