package recursos;

public class StackFactory<T> {
    public IStack<T> getStack(String type) {
        switch (type.toLowerCase()) {
            case "1":
                return new ArrayListStack<>();
            case "2":
                return new VectorStack<>();
            case "3":
                return new ListStack<>();
            default:
                throw new IllegalArgumentException("Tipo de pila no válido");
        }
    }
}
