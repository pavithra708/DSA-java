class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // Append only if the stack is not empty (not the outermost '(')
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
                st.push(ch);
            } else if (ch == ')') {
                st.pop(); // Remove the top '('
                // Append only if the stack is not empty (not the outermost ')')
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
