class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(String token: tokens){
            if(isNumeric(token)){
                stack.push(Integer.parseInt(token));
            }else{
                int b=stack.pop();
                int a=stack.pop();
            switch(token){
                case "+":
                    stack.push(a+b);
                    break;
                case "-":
                    stack.push(a-b);
                    break;
                case "*":
                    stack.push(a*b);
                    break;
                case "/":
                    stack.push(a/b);
                    break;
            }
            }

        }

        return stack.pop();
    }
        private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
