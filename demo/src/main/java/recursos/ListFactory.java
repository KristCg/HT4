package recursos;

public class ListFactory<T> {
    public IList<T> getList(String type) {
        switch (type.toLowerCase()) {
            case "1":
                return new SimpleLinkedList<>();
            case "2":
                return new DoubleLinkedList<>();
            default:
                throw new IllegalArgumentException("Tipo de lista no válido");
        }
    }
}
