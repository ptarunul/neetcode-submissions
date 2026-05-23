class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();

        for(int i=0;i<s.length();i++){
            char input= s.charAt(i);
            if(input =='{' || input =='[' || input =='('){
                stack.push(s.charAt(i));
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }

            char bracket;
            switch(input){
                case '}':
                    bracket= stack.pop();
                    if(bracket=='[' || bracket=='('){
                        return false;
                    }
                    break;
                case ']':
                    bracket= stack.pop();
                    if(bracket=='{' || bracket=='('){
                        return false;
                    }
                    break;
                case ')':
                    bracket= stack.pop();
                    if(bracket=='[' || bracket=='{'){
                        return false;
                    }
                    break;
            }


        }

        

        return stack.isEmpty();
    }
}
