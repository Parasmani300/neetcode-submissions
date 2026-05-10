class Solution {
    public  boolean isNumeric(String str) {
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<tokens.length;i++)
        {
            if(isNumeric(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                Integer a = stack.pop();
                Integer b = stack.pop();
                Integer c = 0;
                if(tokens[i].equals("+"))
                {
                    c = b+a;
                    stack.push(c);
                }else if(tokens[i].equals("-"))
                {
                    c = b-a;
                    stack.push(c);
                }else if(tokens[i].equals("*")){
                    c = b*a;
                    stack.push(c);
                }else if(tokens[i].equals("/"))
                {
                    c = b/a;
                    stack.push(c);
                }
            }
        }
        return stack.pop();
    }
}
