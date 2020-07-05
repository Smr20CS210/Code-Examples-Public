package midterm2;

public class GenericBox<E> {

    private E item;
    
    // Constructor
    public GenericBox() {
        item = null;
    }

    // Put method
    public void put(E item) {
        this.item = item;
    }

    // Get method
    public E get() {
        return this.item;
    }
}
