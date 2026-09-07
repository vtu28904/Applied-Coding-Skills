class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder temp = new StringBuilder();
        int open = 0;

        // Remove invalid ')'
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
                temp.append(ch);
            }
            else if (ch == ')') {
                if (open > 0) {
                    open--;
                    temp.append(ch);
                }
            }
            else {
                temp.append(ch);
            }
        }

        // Remove unmatched '(' from the right
        for (int i = temp.length() - 1; i >= 0 && open > 0; i--) {

            if (temp.charAt(i) == '(') {
                temp.deleteCharAt(i);
                open--;
            }
        }

        return temp.toString();
    }
}
