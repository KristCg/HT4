import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackAndListTest {
    private IStack<String> arrayListStack;
    private IStack<String> vectorStack;
    private IStack<String> listaStackSingly;
    private IStack<String> listaStackDoubly;
    private IList<String> singlyLinkedList;
    private IList<String> doublyLinkedList;

    @BeforeEach
    void setUp() {
        arrayListStack = new ArrayListStack<>();
        vectorStack = new VectorStack<>();
        singlyLinkedList = new SinglyLinked<>();
        doublyLinkedList = new DoublyLinked<>();
        listaStackSingly = new ListaStack<>(singlyLinkedList);
        listaStackDoubly = new ListaStack<>(doublyLinkedList);
    }

    @Test
    void testInfixToPostfixConversion() {
        String infix = "(10+20)*9";
        System.out.println("Postfix usando ArrayListStack: " + Convertir.infixToPostfix(infix, arrayListStack));
        System.out.println("Postfix usando VectorStack: " + Convertir.infixToPostfix(infix, vectorStack));
        System.out.println("Postfix usando ListaStack (Singly Linked): " + Convertir.infixToPostfix(infix, listaStackSingly));
        System.out.println("Postfix usando ListaStack (Doubly Linked): " + Convertir.infixToPostfix(infix, listaStackDoubly));
    }

    @Test
    void testPostfixEvaluation() {
        String postfix = "10 20 + 9 *";
        System.out.println("Resultado usando ArrayListStack: " + Calculadora.evaluar(postfix, arrayListStack));
        System.out.println("Resultado usando VectorStack: " + Calculadora.evaluar(postfix, vectorStack));
        System.out.println("Resultado usando ListaStack (Singly Linked): " + Calculadora.evaluar(postfix, listaStackSingly));
        System.out.println("Resultado usando ListaStack (Doubly Linked): " + Calculadora.evaluar(postfix, listaStackDoubly));
    }
}
