package recursos;
import recursos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione la implementación del stack:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");
        int opcionStack = sc.nextInt();
        sc.nextLine(); 
        
        IStack<String> stack = StackFactory.createStack(opcionStack);
        
        if (opcionStack == 3) {
            System.out.println("Seleccione la implementación de la lista:");
            System.out.println("1. Simplemente encadenada");
            System.out.println("2. Doblemente encadenada");
            int opcionLista = sc.nextInt();
            sc.nextLine();
            
            IList<String> lista = ListFactory.createList(opcionLista);
            stack = new ListaStack<>(lista);
        }
        
        System.out.println("Ingrese la expresión infix:");
        String infix = sc.nextLine();
        
        String postfix = Convertir.inToPost(infix);
        System.out.println("Expresión postfix: " + postfix);
        
        int resultado = Calculadora.evaluar(postfix);
        System.out.println("Resultado: " + resultado);
        
        sc.close();
    }
}