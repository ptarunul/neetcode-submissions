class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char schar = s.charAt(i);
            if (schar == '{' || schar == '[' || schar == '(') {
                stack.push(schar);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char bracket;
            switch (schar) {
                case '}':
                    bracket = stack.pop();
                    if (bracket != '{') {
                        return false;
                    }
                    break;
                case ']':
                    bracket = stack.pop();
                    if (bracket != '[') {
                        return false;
                    }
                    break;
                case ')':
                    bracket = stack.pop();
                    if (bracket != '(') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
