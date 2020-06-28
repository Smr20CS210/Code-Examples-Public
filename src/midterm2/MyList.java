package midterm2;

/* interface defines the signature of methods
 * but does not implement them.
 * 
 * interface may also define some constants usable
 * by the implementing class(es)
 */

/* T represents something commonly known as a Generic Type
 * this gives us the flexibility to allow multiple classes
 * implement this interface as different object types.
 */
public interface MyList<T> {
    // adds an item to the end
    public void add(T value);

    // adds an item to a specific index
    public void add(int index, T value);

    // returns the an item at specific index
    public T get(int index);

    // returns the index where an item is
    public int indexOf(T value);

    // checks if container is empty or not
    public boolean isEmpty();

    // remove item at given index
    public void remove(int index);

    // sets an item of a specific index
    public void set(int index, T value);

    // returns the size of the item container
    public int size();

}
