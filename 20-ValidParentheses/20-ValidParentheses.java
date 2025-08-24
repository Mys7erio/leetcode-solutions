// Last updated: 8/24/2025, 11:28:46 PM
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        HashMap<String, String> closingPairs = new HashMap<String, String>();
        closingPairs.put(")", "(");
        closingPairs.put("}", "{");
        closingPairs.put("]", "[");

        Stack<Character> stack = new Stack<Character>();
        for (char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                
                // If there are more closing brackets than there are opening brackets
                if (stack.empty())
                    return false;
                
                char top = stack.peek();
                
                if (ch == ')' &&  top == '(')
                    stack.pop();

                else if (ch == '}' &&  top == '{')
                    stack.pop();

                else if (ch == ']' &&  top == '[')
                    stack.pop();

                else
                    return false;
            }
        }

        return stack.empty() ? true : false;
    }
}