package recursos;

import java.util.Stack;

public class Convertir{
    int preced(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }
        else if(ch == '^'){
            return 3;
        }
        else{
            return 0;
        }
     }
     
     public static inToPost(string infix, IStack<Character> stack){
        Stack<Character> stk = new Stack<>();
        stk.push('#');
        StringBuilder postfix = new StringBuilder();
        for(char ch : infix.toCharArray()){
            if(i.isLetterOrDigit(ch)){
                postfix.append(ch);
            }
            else if(ch == '('){
                stk.push(ch); 
            }
            else if(ch == '^'){
                stk.push(ch);
            }
            else if(ch == ')'){
                while (!stk.isEmpty() && stk.peek() != '(' && stk.peek() != '#') {
                    postfix.append(stk.pop());
                }
                stk.pop();
            }
            else{
                while (!stk.isEmpty() && stack.peek() != null && preced(ch) <= preced(stk.peek())) {
                    postfix.append(stk.pop());
                }
                stk.push(ch);
            }
        }
        while(!stk.isEmpty() && stk.peek() != '#'){
            postfix.append(stk.pop());
        }
        return postfix.toString();
    }
}
