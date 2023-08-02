package lessons.lesson17_18_19._01_generics;

public class GenericBox<T> {

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T doSmth() {
        return value;
    }
}
