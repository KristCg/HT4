package recursos;

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
        Stack<Character> stk = new Stack<T>();
        stk.push('#');
        String postfix = new String();
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
                while(stk.isEmpty() == true && stk.peek() != '(' && stack.peek() != '#'){
                    postfix.append(stk.pop());
                }
                stk.pop();
            }
            else{
                while(stk.isEmpty == false && preced(ch) <= preced(stk.peek())){
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(stk.isEmpty() == false){
            postfix.append(stk.pop());
        }
        return postfix;
    }
}
