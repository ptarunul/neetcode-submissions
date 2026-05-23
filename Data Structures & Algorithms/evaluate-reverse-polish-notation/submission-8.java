class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int res=0;

        for(String token:tokens){
            if(token.matches("-?\\d+")){
                stack.push(Integer.parseInt(token));
            }else{
                int a=stack.pop();
                int b=stack.pop();
                switch(token){
                case "+":
                    res=a+b;
                    break;
                case "-":
                    res=b-a;
                    break;
                case "*":
                    res=a*b;
                    break;
                case "/":
                    res=(int) ((double) b / a);
                    break;
            }
            stack.push(res);
            }
        }

    return stack.pop();
    }
}
