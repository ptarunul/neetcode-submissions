class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        int res=0;

        for(String str: tokens){
            if(str.matches("-?\\d+")){
                stack.push(Integer.parseInt(str));
            }else{
                int a= stack.pop();
                int b= stack.pop();

                switch(str){
                    case "+":
                        res= a + b;
                        break;
                    
                    case "-":
                        res= b-a;
                        break;
                    
                    case "*":
                        res= a*b;
                        break;

                    case "/":
                        res= (int)((double)b/a);
                        break;
                }

                stack.push(res);
            }
        }
        return stack.pop();
    }
}
