import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
public class MySet<E> implements Set<E>{
    // Use a HashMap to store the elements in the set
    private HashMap<E, Object> map;

    // Use a BOX object as the value in the map
    private static final Object BOX = new Object();

    // Create obj
    public MySet() {
        map = new HashMap<>();
    }

    // Return the number of elements in the set
    public int size() {
        return map.size();
    }

    // Return true if the set is empty, false otherwise
    public boolean isEmpty() {
        return map.isEmpty();
    }

    // Check if the set contains an element
    public boolean contains(Object element) {
        return map.containsKey(element);
    }

    // Add an element to the set
    public boolean add(E element) {
        // If the element is already in the set, return false
        if(map.containsKey(element)) {
            return false;
        }
        // Otherwise, add the element to the map with the dummy object as the value
        map.put(element, BOX);
        return  true;
    }

    // Remove an element from the set
    public boolean remove(Object element) {
        // If the element is not in the set, return false
        if(!map.containsKey(element)) {
            return false;
        }
        // Otherwise, remove the element from the map
        map.remove(element);
        return true;
    }

    // Return an iterator over the elements in the set
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    // Return true if the set contains all the elements in the specified collection
    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }

    // Add all the elements in the specified collection to the set
    public boolean addAll(Collection<? extends E> c) {
        boolean edited = false;
        for (E element : c) {
            edited |= add(element);
        }
        return edited;
    }

    // Retain all the elements in the set that are also in the specified collection
    public boolean retainAll(Collection<?> c) {
        return map.keySet().retainAll(c);
    }

    // Remove all the elements in the set that are also in the specified collection
    public boolean removeAll(Collection<?> c) {
        return map.keySet().removeAll(c);
    }

    // Remove all the elements in the set
    public void clear() {
        map.clear();
    }

    /**
     * Under here don't need to implement
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
}