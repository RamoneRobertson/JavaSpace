package generics;

// The T represents the type of objects we want to store
public class GenericList <T> {
//    private T[] items = new T[10];
    // A better way to do this
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}
