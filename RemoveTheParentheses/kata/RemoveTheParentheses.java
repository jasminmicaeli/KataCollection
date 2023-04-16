public class RemoveTheParentheses {

    public String removeParentheses(String given) {
        StringBuilder stringBuilder = new StringBuilder();
        int parenthesesCounter = 0;

        for(char c : given.toCharArray()){
            if(c == '(') parenthesesCounter++;
            else if(c == ')') parenthesesCounter--;
            else if(parenthesesCounter == 0) stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
