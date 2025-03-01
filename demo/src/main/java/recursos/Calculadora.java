package recursos;

public class Calculadora {
    private static Calculadora calculo;

    private Calculadora() {}

    public static Calculadora getCalculo() {
        if (calculo == null) {
            calculo = new Calculadora();
        }
        return calculo;
    }

    public int evaluarPostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
}
